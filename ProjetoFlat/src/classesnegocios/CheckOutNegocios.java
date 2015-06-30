/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesnegocios;

import classesbasicas.CheckOut;
import classesdados.CheckOutDAO;
import classesexception.CheckOutException;
import classesinterfaces.InterfaceCheckOut;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author peppe
 */
public class CheckOutNegocios {
         private InterfaceCheckOut checkoutdao;
    
    public CheckOutNegocios(){
        this.checkoutdao = new CheckOutDAO();
    }
    public void save(CheckOut a) throws CheckOutException{
	
	this.checkoutdao.save(a);
}
public CheckOut find(CheckOut a){
	
	return (CheckOut) this.checkoutdao.find(a, a.getId());
}
public void delete(CheckOut a ){
	this.checkoutdao.delete(a);
}
public List<CheckOut> listall(CheckOut a){
	List<CheckOut> listaCheckOut = new ArrayList<CheckOut>();
	List<Object> lista = this.checkoutdao.listall(a);
	for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
		CheckOut attraction = (CheckOut) iterator.next();
		listaCheckOut.add(attraction);
	}
        return listaCheckOut;
}
    
}
