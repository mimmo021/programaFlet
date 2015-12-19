package classesdados;

import classesbasicas.Apartamento;
import classesbasicas.Proprietario;
import classesinterfaces.InterfaceApartamento;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.SQLQuery;
import org.hibernate.transform.Transformers;

public class ApartamentoDAO extends GenericDAO<Apartamento> implements InterfaceApartamento {

    @Override
    public List<Apartamento> pesquisarReserva(Date entrada, Date saida) {
        em.getTransaction().begin();

        Query consulta = em.createNativeQuery("select * from apartamento ap\n" +
                                            "where \n" +
                                            "	ap.id not in ( select reserva.apartamento_id \n" +
                                            "			from reserva \n" +
                                            "			where (reserva.dataentrada  \n" +
                                            "				between :entrada and :saida \n" +
                                            "				or reserva.datasaida  \n" +
                                            "				between :entrada \n" +
                                            "				and :saida)or(:entrada > reserva.dataentrada and  :saida < reserva.datasaida ))\n" +
                                            "\n" +
                                            "	and ap.id not in (select checkin.apartamento_id \n" +
                                            "			from checkin \n" +
                                            "			where (checkin.dataentrada  \n" +
                                            "				between :entrada and :saida \n" +
                                            "				or checkin.datasaida  \n" +
                                            "				between :entrada \n" +
                                            "				and :saida)or(:entrada > checkin.dataentrada and  :saida < checkin.datasaida ))"
                                        ).setParameter("entrada", entrada).setParameter("saida", saida);

       
        List<Apartamento> retorno = new ArrayList<Apartamento>();
        List<Object> t = consulta.getResultList();
        for(int i = 0; i < t.size(); i++) {
            Object o[] = (Object[]) t.get(i);
            Apartamento ap = new Apartamento();
            ap.setId((int) o[0]);
            ap.setNumero((int) o[1]);
            ap.setQuartos((int) o[4]);
            ap.setSituacao((String) o[5]);
            ap.setValorminimo((double) o[6]);
            
            retorno.add(ap);
        }
        em.getTransaction().commit();
        return retorno;
    }

    @Override
    public int pesquisarQtdApartamento() {
          em.getTransaction().begin();

        Query consulta = em.createNativeQuery("select count(*) from apartamento");

       
        
        BigInteger retorno = (BigInteger) consulta.getSingleResult();
        em.getTransaction().commit();
        int i = retorno.intValue();
        return i;
    }
    
}
