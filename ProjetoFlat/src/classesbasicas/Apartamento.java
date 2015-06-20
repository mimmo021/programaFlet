package classesbasicas;

import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Apartamento {
	
	private String numerocelpe;
	private String numeronet;
	private String situacao;
	private int quartos;
	private int numero;
	private double valorminimo;
        
	@ManyToOne
	private
	Proprietario proprietario;
	@Id
	@GeneratedValue
	private int id;
        
        @OneToMany
        private Collection<Reserva> reservas; 
        private Collection<CheckIn> checkin;
	
	public Apartamento(){
		this.proprietario = new Proprietario();
                this.reservas = new ArrayList<>();
                this.checkin = new ArrayList<>();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getQuartos() {
		return quartos;
	}
	public void setQuartos(int quartos) {
		this.quartos = quartos;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public String getNumeronet() {
		return numeronet;
	}
	public void setNumeronet(String numeronet) {
		this.numeronet = numeronet;
	}
	public String getNumerocelpe() {
		return numerocelpe;
	}
	public void setNumerocelpe(String numerocelpe) {
		this.numerocelpe = numerocelpe;
	}
	public Proprietario getProprietario() {
		return proprietario;
	}
	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}
	public double getValorminimo() {
		return valorminimo;
	}
	public void setValorminimo(double valorminimo) {
		this.valorminimo = valorminimo;
	}

    /**
     * @return the reservas
     */
    public Collection<Reserva> getReservas() {
        return reservas;
    }

    /**
     * @param reservas the reservas to set
     */
    public void setReservas(Collection<Reserva> reservas) {
        this.reservas = reservas;
    }

    /**
     * @return the checkin
     */
    public Collection<CheckIn> getCheckin() {
        return checkin;
    }

    /**
     * @param checkin the checkin to set
     */
    public void setCheckin(Collection<CheckIn> checkin) {
        this.checkin = checkin;
    }
}
