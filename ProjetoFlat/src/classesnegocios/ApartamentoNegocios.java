/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesnegocios;

import classesbasicas.Apartamento;
import classesdados.ApartamentoDAO;
import classesexception.ApartamentoException;
import classesinterfaces.InterfaceApartamento;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author peppe
 */
public class ApartamentoNegocios {
    private InterfaceApartamento apartamentodao;
    
    public ApartamentoNegocios(){
        this.apartamentodao = new ApartamentoDAO();
    }
    public void save(Apartamento a) throws ApartamentoException{
	if(a.getNumerocelpe().equals("") || a.getNumerocelpe()== null){
		throw new ApartamentoException("O campo numero celpe esta vazio");
	}
	if(a.getNumeronet().equals("")|| a.getNumeronet()== null){
		throw new ApartamentoException("O campo numero net esta vazio");
	}
        if(a.getNumero()==0){
            throw new ApartamentoException("Numero do apt nao escolhido");
        }
        if(a.getValorminimo()==0){
            throw new ApartamentoException("Valor minimo nao escolhido");
        }
	this.apartamentodao.save(a);
}
public Apartamento find(Apartamento a){
	
	return (Apartamento) this.apartamentodao.find(a, a.getId());
}
public void delete(Apartamento a ){
	this.apartamentodao.delete(a);
}
public List<Apartamento> listall(Apartamento a){
	List<Apartamento> listaApartamento = new ArrayList<Apartamento>();
	List<Object> lista = this.apartamentodao.listall(a);
	for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
		Apartamento attraction = (Apartamento) iterator.next();
		listaApartamento.add(attraction);
	}
        return listaApartamento;
}
}
