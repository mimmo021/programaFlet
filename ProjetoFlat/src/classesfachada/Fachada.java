/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesfachada;

import classesbasicas.Apartamento;
import classesbasicas.CheckIn;
import classesbasicas.CheckOut;
import classesbasicas.Locador;
import classesbasicas.Login;
import classesbasicas.Proprietario;
import classesbasicas.Reserva;
import classesexception.ApartamentoException;
import classesexception.CheckInException;
import classesexception.CheckOutException;
import classesexception.LocadorException;
import classesexception.LoginException;
import classesexception.ProprietarioException;
import classesexception.ReservaException;
import classesnegocios.ApartamentoNegocios;
import classesnegocios.CheckInNegocios;
import classesnegocios.CheckOutNegocios;
import classesnegocios.LocadorNegocios;
import classesnegocios.LoginNegocios;
import classesnegocios.ProprietarioNegocios;
import classesnegocios.ReservaNegocios;
import java.util.List;

/**
 *
 * @author peppe
 */
public class Fachada {
    private ApartamentoNegocios apartamentonegocios;
    private CheckInNegocios checkinnegocios;
    private CheckOutNegocios checkoutnegocios;
    private LocadorNegocios locatarionegocios;
    private LoginNegocios loginnegocios;
    private ProprietarioNegocios proprietarionegocios;
    private ReservaNegocios reservanegocios;
    
    public Fachada(){
        this.apartamentonegocios = new ApartamentoNegocios();
        this.checkinnegocios = new CheckInNegocios();
        this.checkoutnegocios = new CheckOutNegocios();
        this.locatarionegocios = new LocadorNegocios();
        this.loginnegocios = new LoginNegocios();
        this.proprietarionegocios = new ProprietarioNegocios();
        this.reservanegocios = new ReservaNegocios();
    }
    public void saveApartamento(Apartamento a) throws ApartamentoException {
		apartamentonegocios.save(a);
	}

	public void deleteApartamento(Apartamento a) {
		apartamentonegocios.delete(a);
	}

	public Apartamento findApartamento(Apartamento a) {
		return apartamentonegocios.find(a);
	}

	public List<Apartamento> listallApartamento(Apartamento a) {
		return apartamentonegocios.listall(a);
	}
        public void saveCheckIn(CheckIn a) throws CheckInException {
		checkinnegocios.save(a);
	}

	public void deleteCheckIn(CheckIn a) {
		checkinnegocios.delete(a);
	}

	public CheckIn findCheckIn(CheckIn a) {
		return checkinnegocios.find(a);
	}

	public List<CheckIn> listallCheckIn(CheckIn a) {
		return checkinnegocios.listall(a);
	}
        public void saveCheckOut(CheckOut a) throws CheckOutException {
		checkoutnegocios.save(a);
	}

	public void deleteCheckOut(CheckOut a) {
		checkoutnegocios.delete(a);
	}

	public CheckOut findCheckOut(CheckOut a) {
		return checkoutnegocios.find(a);
	}

	public List<CheckOut> listallCheckOut(CheckOut a) {
		return checkoutnegocios.listall(a);
	}
        public void saveLocador(Locador a) throws LocadorException {
		locatarionegocios.save(a);
	}

	public void deleteLocador(Locador a) {
		locatarionegocios.delete(a);
	}

	public Locador findLocador(Locador a) {
		return locatarionegocios.find(a);
	}

	public List<Locador> listallLocador(Locador a) {
		return locatarionegocios.listall(a);
	}
        public void saveLogin(Login a) throws LoginException {
		loginnegocios.save(a);
	}

	public void deleteLogin(Login a) {
		loginnegocios.delete(a);
	}

	public Login findLogin(Login a) {
		return loginnegocios.find(a);
	}

	public List<Login> listallLogin(Login a) {
		return loginnegocios.listall(a);
	}
        	public void saveProprietario(Proprietario a) throws ProprietarioException {
		proprietarionegocios.save(a);
	}

	public void deleteProprietario(Proprietario a) {
		proprietarionegocios.delete(a);
	}

	public Proprietario findProprietario(Proprietario a) {
		return proprietarionegocios.find(a);
	}

	public List<Proprietario> listallProprietario(Proprietario a) {
		return proprietarionegocios.listall(a);
	}
        public void saveReserva(Reserva a) throws ReservaException {
		reservanegocios.save(a);
	}

	public void deleteReserva(Reserva a) {
		reservanegocios.delete(a);
	}

	public Reserva findReserva(Reserva a) {
		return reservanegocios.find(a);
	}

	public List<Reserva> listallReserva(Reserva a) {
		return reservanegocios.listall(a);
	}


    
}
