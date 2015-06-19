package classesbasicas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Quarto {
	
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
	
	public Quarto(){
		this.proprietario = new Proprietario();
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
}
