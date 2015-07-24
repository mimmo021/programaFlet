package classesbasicas;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

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
@Temporal(javax.persistence.TemporalType.DATE)
private Date dataderegistro;
@Temporal(javax.persistence.TemporalType.DATE)
private Date dataentrada;
@Temporal(javax.persistence.TemporalType.DATE)
private Date datasaida;
@OneToOne
private CheckOut checkout;
private String formaPagamento;
private String LeituraEntrada;
private String LeituraSaida;
private String LeituraTotal;

private boolean acompanhouLeituraEntrada;
private boolean acompanhouLeituraSaida;

public CheckIn(){
    this.apartamento = new Apartamento();
    this.locatario = new Locatario();
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

    /**
     * @return the formaPagamento
     */
    public String getFormaPagamento() {
        return formaPagamento;
    }

    /**
     * @param formaPagamento the formaPagamento to set
     */
    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    /**
     * @return the LeituraEntrada
     */
    public String getLeituraEntrada() {
        return LeituraEntrada;
    }

    /**
     * @param LeituraEntrada the LeituraEntrada to set
     */
    public void setLeituraEntrada(String LeituraEntrada) {
        this.LeituraEntrada = LeituraEntrada;
    }

    /**
     * @return the LeituraSaida
     */
    public String getLeituraSaida() {
        return LeituraSaida;
    }

    /**
     * @param LeituraSaida the LeituraSaida to set
     */
    public void setLeituraSaida(String LeituraSaida) {
        this.LeituraSaida = LeituraSaida;
    }

    /**
     * @return the LeituraTotal
     */
    public String getLeituraTotal() {
        return LeituraTotal;
    }

    /**
     * @param LeituraTotal the LeituraTotal to set
     */
    public void setLeituraTotal(String LeituraTotal) {
        this.LeituraTotal = LeituraTotal;
    }

    /**
     * @return the acompanhouLeituraEntrada
     */
    public boolean isAcompanhouLeituraEntrada() {
        return acompanhouLeituraEntrada;
    }

    /**
     * @param acompanhouLeituraEntrada the acompanhouLeituraEntrada to set
     */
    public void setAcompanhouLeituraEntrada(boolean acompanhouLeituraEntrada) {
        this.acompanhouLeituraEntrada = acompanhouLeituraEntrada;
    }

    /**
     * @return the acompanhouLeituraSaida
     */
    public boolean isAcompanhouLeituraSaida() {
        return acompanhouLeituraSaida;
    }

    /**
     * @param acompanhouLeituraSaida the acompanhouLeituraSaida to set
     */
    public void setAcompanhouLeituraSaida(boolean acompanhouLeituraSaida) {
        this.acompanhouLeituraSaida = acompanhouLeituraSaida;
    }
}
