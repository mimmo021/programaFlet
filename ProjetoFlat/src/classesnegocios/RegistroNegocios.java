/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesnegocios;

import classesbasicas.Registro;
import classesdados.RegistroDAO;
import classesexception.RegistroException;
import classesinterfaces.InterfaceRegistro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author peppe
 */
public class RegistroNegocios {
     private InterfaceRegistro registrodao;
    
    public RegistroNegocios(){
        this.registrodao = new RegistroDAO();
    }
    public void save(Registro a) throws RegistroException{
	
	this.registrodao.save(a);
}
public Registro find(Registro a){
	
	return (Registro) this.registrodao.find(a, a.getId());
}
public void delete(Registro a ){
	this.registrodao.delete(a);
}
public List<Registro> listall(Registro a){
	List<Registro> listaRegistro = new ArrayList<Registro>();
	List<Object> lista = this.registrodao.listall(a);
	for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
		Registro attraction = (Registro) iterator.next();
		listaRegistro.add(attraction);
	}
        return listaRegistro;
}
}
