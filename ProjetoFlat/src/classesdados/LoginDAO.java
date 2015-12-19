package classesdados;

import classesbasicas.Login;
import classesinterfaces.InterfaceLogin;
import javax.persistence.Query;

public class LoginDAO extends GenericDAO<Login> implements InterfaceLogin{

   
    public int acesso(String usuario, String senha) {
         em.getTransaction().begin();

        Query consulta = em.createNativeQuery("select login.id from login where senha = :senha and usuario = :usuario").setParameter("usuario",usuario).setParameter("senha",senha);

       int  retorno;
        try{
         retorno = (int) consulta.getSingleResult();
        }catch(Exception e){
          retorno = 0;  
        }
        em.getTransaction().commit();
       
        return retorno;
    }

}
