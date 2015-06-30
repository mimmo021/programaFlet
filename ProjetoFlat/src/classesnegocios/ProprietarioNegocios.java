/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesnegocios;

import classesbasicas.Proprietario;
import classesdados.ProprietarioDAO;
import classesexception.ProprietarioException;
import classesinterfaces.InterfaceProprietario;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author peppe
 */
public class ProprietarioNegocios {
         private InterfaceProprietario proprietariodao;
    
    public ProprietarioNegocios(){
        this.proprietariodao = new ProprietarioDAO();
    }
    public void save(Proprietario a) throws ProprietarioException{
	
	this.proprietariodao.save(a);
}
public Proprietario find(Proprietario a){
	
	return (Proprietario) this.proprietariodao.find(a, a.getId());
}
public void delete(Proprietario a ){
	this.proprietariodao.delete(a);
}
public List<Proprietario> listall(Proprietario a){
	List<Proprietario> listaProprietario = new ArrayList<Proprietario>();
	List<Object> lista = this.proprietariodao.listall(a);
	for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
		Proprietario attraction = (Proprietario) iterator.next();
		listaProprietario.add(attraction);
	}
        return listaProprietario;
}
    
}
