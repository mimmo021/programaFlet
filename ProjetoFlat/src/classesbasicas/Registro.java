/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesbasicas;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author peppe
 */
@Entity
public class Registro {
    @Id
    @GeneratedValue
    private int id;
    private Date dataregistro;
    @ManyToOne
    private Login login;
    private String descricao;

    /**
     * @return the dataregistro
     */
    public Date getDataregistro() {
        return dataregistro;
    }

    /**
     * @param dataregistro the dataregistro to set
     */
    public void setDataregistro(Date dataregistro) {
        this.dataregistro = dataregistro;
    }

    /**
     * @return the login
     */
    public Login getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(Login login) {
        this.login = login;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
            
}
