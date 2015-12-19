package classesbasicas;

import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Login {
	@Id
	@GeneratedValue
	private int id;
        @Column(unique= true)
	private String usuario;
	private String senha;  
        @OneToMany
        private Collection<Registro> registro;
        
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

    /**
     * @return the registro
     */
    public Collection<Registro> getRegistro() {
        return registro;
    }

    /**
     * @param registro the registro to set
     */
    public void setRegistro(Collection<Registro> registro) {
        this.registro = registro;
    }
    public Login(){
        this.registro = new ArrayList<>();
        
    }
}
