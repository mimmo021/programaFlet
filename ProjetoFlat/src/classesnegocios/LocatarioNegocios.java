/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesnegocios;

import classesbasicas.Locatario;
import classesdados.LocatarioDAO;
import classesexception.LocatarioException;
import classesinterfaces.InterfaceLocatario;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author peppe
 */
public class LocatarioNegocios {
         private InterfaceLocatario locadordao;
    
    public LocatarioNegocios(){
        this.locadordao = new LocatarioDAO();
    }
    public void save(Locatario a) throws LocatarioException{
	
	this.locadordao.save(a);
}
public Locatario find(Locatario a){
	
	return (Locatario) this.locadordao.find(a, a.getId());
}
public void delete(Locatario a ){
	this.locadordao.delete(a);
}
public List<Locatario> listall(Locatario a){
	List<Locatario> listaLocatario = new ArrayList<Locatario>();
	List<Object> lista = this.locadordao.listall(a);
	for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
		Locatario attraction = (Locatario) iterator.next();
		listaLocatario.add(attraction);
	}
        return listaLocatario;
}
    
}
