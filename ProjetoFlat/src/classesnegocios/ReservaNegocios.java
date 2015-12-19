/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesnegocios;

import classesbasicas.Reserva;
import classesdados.ReservaDAO;
import classesexception.ReservaException;
import classesinterfaces.InterfaceReserva;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author peppe
 */
public class ReservaNegocios {
         private InterfaceReserva reservasdao;
    
    public ReservaNegocios(){
        this.reservasdao = new ReservaDAO();
    }
    public void save(Reserva a) throws ReservaException{
        if(a.getDataentrada()== null){
            throw new ReservaException("Data de entrada nao pode esta vazia");
        }
	if(a.getDataentrada().after(a.getDataregistro())){
            throw new ReservaException("Data de entrada nao pode ser Anterior a hoje");
        }
        if(a.getDatasaida()== null){
            throw new ReservaException("Data de saida nao pode esta vazia");
        }
         
         
	this.reservasdao.save(a);
}
public Reserva find(Reserva a){
	
	return (Reserva) this.reservasdao.find(a, a.getId());
}
public void delete(Reserva a ){
	this.reservasdao.delete(a);
}
public List<Reserva> listall(Reserva a){
	List<Reserva> listaReserva = new ArrayList<Reserva>();
	List<Object> lista = this.reservasdao.listall(a);
	for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
		Reserva attraction = (Reserva) iterator.next();
		listaReserva.add(attraction);
	}
        return listaReserva;
}
    
}
