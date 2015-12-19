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
private String formaPagamento;
private String LeituraEntrada;
private String LeituraSaida;
private String LeituraTotal;
private String totalkwh;
@Temporal(javax.persistence.TemporalType.DATE)
private Date dataCheckout;

private boolean acompanhouLeituraEntrada;
private boolean acompanhouLeituraSaida;
private String acnome;
private String acnome2;
private String acnome3;
private String accpf;
private String accpf2;
private String accpf3;

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

    /**
     * @return the totalkwh
     */
    public String getTotalkwh() {
        return totalkwh;
    }

    /**
     * @param totalkwh the totalkwh to set
     */
    public void setTotalkwh(String totalkwh) {
        this.totalkwh = totalkwh;
    }

    /**
     * @return the dataCheckout
     */
    public Date getDataCheckout() {
        return dataCheckout;
    }

    /**
     * @param dataCheckout the dataCheckout to set
     */
    public void setDataCheckout(Date dataCheckout) {
        this.dataCheckout = dataCheckout;
    }

    /**
     * @return the acnome
     */
    public String getAcnome() {
        return acnome;
    }

    /**
     * @param acnome the acnome to set
     */
    public void setAcnome(String acnome) {
        this.acnome = acnome;
    }

    /**
     * @return the acnome2
     */
    public String getAcnome2() {
        return acnome2;
    }

    /**
     * @param acnome2 the acnome2 to set
     */
    public void setAcnome2(String acnome2) {
        this.acnome2 = acnome2;
    }

    /**
     * @return the acnome3
     */
    public String getAcnome3() {
        return acnome3;
    }

    /**
     * @param acnome3 the acnome3 to set
     */
    public void setAcnome3(String acnome3) {
        this.acnome3 = acnome3;
    }

    /**
     * @return the accpf
     */
    public String getAccpf() {
        return accpf;
    }

    /**
     * @param accpf the accpf to set
     */
    public void setAccpf(String accpf) {
        this.accpf = accpf;
    }

    /**
     * @return the accpf2
     */
    public String getAccpf2() {
        return accpf2;
    }

    /**
     * @param accpf2 the accpf2 to set
     */
    public void setAccpf2(String accpf2) {
        this.accpf2 = accpf2;
    }

    /**
     * @return the accpf3
     */
    public String getAccpf3() {
        return accpf3;
    }

    /**
     * @param accpf3 the accpf3 to set
     */
    public void setAccpf3(String accpf3) {
        this.accpf3 = accpf3;
    }
}
