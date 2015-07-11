/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesnegocios;

import classesbasicas.Locador;
import classesdados.LocadorDAO;
import classesexception.LocadorException;
import classesinterfaces.InterfaceLocador;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author peppe
 */
public class LocadorNegocios {
         private InterfaceLocador locatariodao;
    
    public LocadorNegocios(){
        this.locatariodao = new LocadorDAO();
    }
    public void save(Locador a) throws LocadorException{
	
	this.locatariodao.save(a);
}
public Locador find(Locador a){
	
	return (Locador) this.locatariodao.find(a, a.getId());
}
public void delete(Locador a ){
	this.locatariodao.delete(a);
}
public List<Locador> listall(Locador a){
	List<Locador> listaLocatario = new ArrayList<Locador>();
	List<Object> lista = this.locatariodao.listall(a);
	for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
		Locador attraction = (Locador) iterator.next();
		listaLocatario.add(attraction);
	}
        return listaLocatario;
}
    
}
