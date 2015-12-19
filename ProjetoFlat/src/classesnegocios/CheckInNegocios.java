/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesnegocios;

import classesbasicas.CheckIn;
import classesdados.CheckInDAO;
import classesexception.CheckInException;
import classesinterfaces.InterfaceCheckIn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author peppe
 */
public class CheckInNegocios {
     private InterfaceCheckIn checkindao;
    
    public CheckInNegocios(){
        this.checkindao = new CheckInDAO();
    }
    public void save(CheckIn a) throws CheckInException{
        if(a.getDataentrada()==null){
            throw new CheckInException("Data de entrada nao pode ser vazia");
        }
        if(a.getValormensal()== 0.0){
            throw new CheckInException("Valor mensal nao pode ser vazio");
        }
	
	this.checkindao.save(a);
}
public CheckIn find(CheckIn a){
	
	return (CheckIn) this.checkindao.find(a, a.getId());
}
public void delete(CheckIn a ){
	this.checkindao.delete(a);
}
public List<CheckIn> listall(CheckIn a){
	List<CheckIn> listaCheckIn = new ArrayList<CheckIn>();
	List<Object> lista = this.checkindao.listall(a);
	for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
		CheckIn attraction = (CheckIn) iterator.next();
		listaCheckIn.add(attraction);
	}
        return listaCheckIn;
}
public int pesquisarQtdCheckin(){
    return this.checkindao.pesquisarQtdCheckin();
}

public int pesquisarUltimo(){
    return this.checkindao.pesquisarUltimo();
}    
}
