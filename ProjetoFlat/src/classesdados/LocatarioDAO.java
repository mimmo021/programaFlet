package classesdados;

import classesbasicas.Locatario;
import classesinterfaces.InterfaceLocatario;
import javax.persistence.Query;

public class LocatarioDAO extends GenericDAO<Locatario> implements InterfaceLocatario {
public String pesquisarPlaca(String placa) {
       em.getTransaction().begin();

        Query consulta = em.createNativeQuery("select locatario.nome \n" +
            "from locatario, checkin\n" +
            "where locatario.id = checkin.locatario_id\n" +
            "and locatario.placa = :placa \n" +
            "and checkin.datacheckout is null").setParameter("placa", placa);

       String retorno;
       try{
         retorno= (String) consulta.getSingleResult();
       }catch(Exception e){
            retorno="";
    }
        
        em.getTransaction().commit();
        
        return retorno;
    }
}
