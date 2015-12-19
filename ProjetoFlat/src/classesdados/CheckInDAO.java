package classesdados;

import classesbasicas.CheckIn;
import classesbasicas.Locatario;
import classesinterfaces.InterfaceCheckIn;
import java.math.BigInteger;
import javax.persistence.Query;

public class CheckInDAO extends GenericDAO<CheckIn> implements InterfaceCheckIn {
public int pesquisarQtdCheckin() {
          em.getTransaction().begin();

        Query consulta = em.createNativeQuery("select count(*) from checkin where checkin.datacheckout is null");

       
        
        BigInteger retorno = (BigInteger) consulta.getSingleResult();
        em.getTransaction().commit();
        int i = retorno.intValue();
        return i;
    }

   
    public int pesquisarUltimo() {
         em.getTransaction().begin();

        Query consulta = em.createNativeQuery("select MAX(id) from checkin");

       
        
      int retorno = (int) consulta.getSingleResult();
        em.getTransaction().commit();
       
        return retorno;
    }

    
    
}
