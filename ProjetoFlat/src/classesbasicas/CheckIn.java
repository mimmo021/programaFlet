package classesbasicas;

import java.util.Calendar;
import java.util.GregorianCalendar;
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
private Locatario locatario;
private Calendar dataderegistro;
private Calendar dataentrada;
private Calendar datasaida;
@OneToOne
private CheckOut checkout;
public CheckIn(){
    this.apartamento = new Apartamento();
    this.locatario = new Locatario();
    this.dataderegistro = new GregorianCalendar();
    this.datasaida = new GregorianCalendar();
    this.dataentrada = new GregorianCalendar();
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
    public Locatario getLocatario() {
        return locatario;
    }

    /**
     * @param locatario the locatario to set
     */
    public void setLocatario(Locatario locatario) {
        this.locatario = locatario;
    }

    /**
     * @return the dataderegistro
     */
    public Calendar getDataderegistro() {
        return dataderegistro;
    }

    /**
     * @param dataderegistro the dataderegistro to set
     */
    public void setDataderegistro(Calendar dataderegistro) {
        this.dataderegistro = dataderegistro;
    }

    /**
     * @return the dataentrada
     */
    public Calendar getDataentrada() {
        return dataentrada;
    }

    /**
     * @param dataentrada the dataentrada to set
     */
    public void setDataentrada(Calendar dataentrada) {
        this.dataentrada = dataentrada;
    }

    /**
     * @return the datasaida
     */
    public Calendar getDatasaida() {
        return datasaida;
    }

    /**
     * @param datasaida the datasaida to set
     */
    public void setDatasaida(Calendar datasaida) {
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
