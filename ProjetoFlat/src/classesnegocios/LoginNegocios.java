/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesnegocios;

import classesbasicas.Login;
import classesdados.LoginDAO;
import classesexception.LoginException;
import classesinterfaces.InterfaceLogin;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author peppe
 */
public class LoginNegocios {
         private InterfaceLogin logindao;
    
    public LoginNegocios(){
        this.logindao = new LoginDAO();
    }
    public void save(Login a) throws LoginException{
	
	this.logindao.save(a);
}
public Login find(Login a){
	
	return (Login) this.logindao.find(a, a.getId());
}
public void delete(Login a ){
	this.logindao.delete(a);
}
public List<Login> listall(Login a){
	List<Login> listaLogin = new ArrayList<Login>();
	List<Object> lista = this.logindao.listall(a);
	for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
		Login attraction = (Login) iterator.next();
		listaLogin.add(attraction);
	}
        return listaLogin;
}
    
}
