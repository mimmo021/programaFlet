package classesbasicas;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Proprietario {
	@Id
	@GeneratedValue
	private
	int id;
	private String nome;
	private String telefone;
	private String telefone2;
	private String telefone3;
	private String email;
	@OneToMany
	private Collection<Apartamento> apartamento;
        public Proprietario(){
            this.apartamento = new ArrayList<Apartamento>();
        }
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone3() {
		return telefone3;
	}
	public void setTelefone3(String telefone3) {
		this.telefone3 = telefone3;
	}
	public String getTelefone2() {
		return telefone2;
	}
	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

    /**
     * @return the apartamento
     */
    public Collection<Apartamento> getApartamento() {
        return apartamento;
    }

    /**
     * @param apartamento the apartamento to set
     */
    public void setApartamento(Collection<Apartamento> apartamento) {
        this.apartamento = apartamento;
    }
}
