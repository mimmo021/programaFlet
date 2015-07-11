package classesbasicas;

import java.util.Calendar;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class CheckIn {
@Id
@GeneratedValue
private int id;
private Double valormensal;
private Double valordiaria;
private Double valortotaldiarias;
@ManyToOne
private Apartamento apartamento;
@ManyToOne
private Locador locatario;
private Date dataderegistro;
private Date dataentrada;
private Date datasaida;
@OneToOne
private CheckOut checkout;
public CheckIn(){
    this.apartamento = new Apartamento();
    this.locatario = new Locador();
    this.dataderegistro = new Date();
    this.datasaida = new Date();
    this.dataentrada = new Date();
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
     * @return the valormensal
     */
    public Double getValormensal() {
        return valormensal;
    }

    /**
     * @param valormensal the valormensal to set
     */
    public void setValormensal(Double valormensal) {
        this.valormensal = valormensal;
    }

    /**
     * @return the valordiaria
     */
    public Double getValordiaria() {
        return valordiaria;
    }

    /**
     * @param valordiaria the valordiaria to set
     */
    public void setValordiaria(Double valordiaria) {
        this.valordiaria = valordiaria;
    }

    /**
     * @return the valortotaldiarias
     */
    public Double getValortotaldiarias() {
        return valortotaldiarias;
    }

    /**
     * @param valortotaldiarias the valortotaldiarias to set
     */
    public void setValortotaldiarias(Double valortotaldiarias) {
        this.valortotaldiarias = valortotaldiarias;
    }

    /**
     * @return the apartamento
     */
    public Apartamento getApartamento() {
        return apartamento;
    }

    /**
     * @param apartamento the apartamento to set
     */
    public void setApartamento(Apartamento apartamento) {
        this.apartamento = apartamento;
    }

    /**
     * @return the locatario
     */
    public Locador getLocatario() {
        return locatario;
    }

    /**
     * @param locatario the locatario to set
     */
    public void setLocatario(Locador locatario) {
        this.locatario = locatario;
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

    /**
     * @return the dataentrada
     */
    public Date getDataentrada() {
        return dataentrada;
    }

    /**
     * @param dataentrada the dataentrada to set
     */
    public void setDataentrada(Date dataentrada) {
        this.dataentrada = dataentrada;
    }

    /**
     * @return the datasaida
     */
    public Date getDatasaida() {
        return datasaida;
    }

    /**
     * @param datasaida the datasaida to set
     */
    public void setDatasaida(Date datasaida) {
        this.datasaida = datasaida;
    }

    /**
     * @return the checkout
     */
    public CheckOut getCheckout() {
        return checkout;
    }

    /**
     * @param checkout the checkout to set
     */
    public void setCheckout(CheckOut checkout) {
        this.checkout = checkout;
    }
}
