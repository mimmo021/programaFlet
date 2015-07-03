package classesbasicas;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class CheckOut {
@Id
@GeneratedValue
private int id;
@OneToOne
private CheckIn checkin;
private Double leituraentrada;
private Double leiturasaida;
private Double totalkwh;
private Boolean hospedeacompanhouentrada;
private Boolean hospedeacompanhousaida;
private Date dataderegistro;

public CheckOut(){
    this.checkin = new CheckIn();
    this.dataderegistro = new Date();
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

    /**
     * @return the checkin
     */
    public CheckIn getCheckin() {
        return checkin;
    }

    /**
     * @param checkin the checkin to set
     */
    public void setCheckin(CheckIn checkin) {
        this.checkin = checkin;
    }

    /**
     * @return the leituraentrada
     */
    public Double getLeituraentrada() {
        return leituraentrada;
    }

    /**
     * @param leituraentrada the leituraentrada to set
     */
    public void setLeituraentrada(Double leituraentrada) {
        this.leituraentrada = leituraentrada;
    }

    /**
     * @return the leiturasaida
     */
    public Double getLeiturasaida() {
        return leiturasaida;
    }

    /**
     * @param leiturasaida the leiturasaida to set
     */
    public void setLeiturasaida(Double leiturasaida) {
        this.leiturasaida = leiturasaida;
    }

    /**
     * @return the totalkwh
     */
    public Double getTotalkwh() {
        return totalkwh;
    }

    /**
     * @param totalkwh the totalkwh to set
     */
    public void setTotalkwh(Double totalkwh) {
        this.totalkwh = totalkwh;
    }

    /**
     * @return the hospedeacompanhouentrada
     */
    public Boolean getHospedeacompanhouentrada() {
        return hospedeacompanhouentrada;
    }

    /**
     * @param hospedeacompanhouentrada the hospedeacompanhouentrada to set
     */
    public void setHospedeacompanhouentrada(Boolean hospedeacompanhouentrada) {
        this.hospedeacompanhouentrada = hospedeacompanhouentrada;
    }

    /**
     * @return the hospedeacompanhousaida
     */
    public Boolean getHospedeacompanhousaida() {
        return hospedeacompanhousaida;
    }

    /**
     * @param hospedeacompanhousaida the hospedeacompanhousaida to set
     */
    public void setHospedeacompanhousaida(Boolean hospedeacompanhousaida) {
        this.hospedeacompanhousaida = hospedeacompanhousaida;
    }

    /**
     * @return the dataderegistro
     */
    public Date getDataderegistro() {
        return dataderegistro;
    }

    /**
     * @param dataderegistro the dataderegistro to set
     */
    public void setDataderegistro(Date dataderegistro) {
        this.dataderegistro = dataderegistro;
    }
}
