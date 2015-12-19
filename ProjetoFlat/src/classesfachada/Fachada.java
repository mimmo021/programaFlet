/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesfachada;

import classesbasicas.Apartamento;
import classesbasicas.CheckIn;
import classesbasicas.Locatario;
import classesbasicas.Login;
import classesbasicas.Proprietario;
import classesbasicas.Registro;
import classesbasicas.Reserva;
import classesexception.ApartamentoException;
import classesexception.CheckInException;
import classesexception.LocatarioException;
import classesexception.LoginException;
import classesexception.ProprietarioException;
import classesexception.RegistroException;
import classesexception.ReservaException;
import classesnegocios.ApartamentoNegocios;
import classesnegocios.CheckInNegocios;
import classesnegocios.LocatarioNegocios;
import classesnegocios.LoginNegocios;
import classesnegocios.ProprietarioNegocios;
import classesnegocios.RegistroNegocios;
import classesnegocios.ReservaNegocios;
import java.util.Date;
import java.util.List;

/**
 *
 * @author peppe
 */
public class Fachada {
    private ApartamentoNegocios apartamentonegocios;
    private CheckInNegocios checkinnegocios;
    private LocatarioNegocios locatarionegocios;
    private LoginNegocios loginnegocios;
    private ProprietarioNegocios proprietarionegocios;
    private ReservaNegocios reservanegocios;
    private RegistroNegocios registronegocios;
    
    public Fachada(){
        this.apartamentonegocios = new ApartamentoNegocios();
        this.checkinnegocios = new CheckInNegocios();
        this.locatarionegocios = new LocatarioNegocios();
        this.loginnegocios = new LoginNegocios();
        this.proprietarionegocios = new ProprietarioNegocios();
        this.reservanegocios = new ReservaNegocios();
        this.registronegocios = new RegistroNegocios();
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
        public List<Apartamento> pesquisarReserva(Date entrada, Date saida){
            return apartamentonegocios.pesquisarReserva(entrada,saida);
        }
        public int pesquisarQtdApartamento(){
            return apartamentonegocios.pesquisarQtdApartamento();
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
        public int pesquisarQtdCheckin(){
            return checkinnegocios.pesquisarQtdCheckin();
        }
        public int pesquisarUltimo(){
            return checkinnegocios.pesquisarUltimo();
        }      
        public void saveLocatario(Locatario a) throws LocatarioException {
		locatarionegocios.save(a);
	}

	public void deleteLocatario(Locatario a) {
		locatarionegocios.delete(a);
	}

	public Locatario findLocatario(Locatario a) {
		return locatarionegocios.find(a);
	}

	public List<Locatario> listallLocatario(Locatario a) {
		return locatarionegocios.listall(a);
	}
        public String pesquisarPlaca(String placa) {
            return locatarionegocios.pesquisarPlaca(placa);
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
        public int acesso(String usuario, String senha) {
                return loginnegocios.acesso(usuario, senha);
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
         public void saveRegistro(Registro a) throws RegistroException {
		registronegocios.save(a);
	}

	public void deleteRegistro(Registro a) {
		registronegocios.delete(a);
	}

	public Registro findRegistro(Registro a) {
		return registronegocios.find(a);
	}

	public List<Registro> listallRegistro(Registro a) {
		return registronegocios.listall(a);
	}


    
}
