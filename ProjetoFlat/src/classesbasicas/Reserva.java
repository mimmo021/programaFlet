package classesbasicas;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

@Entity
public class Reserva {
@Id
@GeneratedValue
private int id;
@Temporal(javax.persistence.TemporalType.DATE)
private Date dataregistro;
@Temporal(javax.persistence.TemporalType.DATE)
 private Date dataentrada;
@Temporal(javax.persistence.TemporalType.DATE)
 private Date datasaida;
@ManyToOne
private Apartamento apartamento;
@ManyToOne
private Locatario locatario;
private Double valor;
private Boolean calcao;
private Double valorcalcao;


public Reserva(){
    this.apartamento = new Apartamento();
    this.locatario = new Locatario();
    this.dataentrada = new Date();
    this.dataregistro = new Date();
    this.datasaida = new Date();
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
     * @return the valor
     */
    public Double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(Double valor) {
        this.valor = valor;
    }

    /**
     * @return the calcao
     */
    public Boolean getCalcao() {
        return calcao;
    }

    /**
     * @param calcao the calcao to set
     */
    public void setCalcao(Boolean calcao) {
        this.calcao = calcao;
    }

    /**
     * @return the valorcalcao
     */
    public Double getValorcalcao() {
        return valorcalcao;
    }

    /**
     * @param valorcalcao the valorcalcao to set
     */
    public void setValorcalcao(Double valorcalcao) {
        this.valorcalcao = valorcalcao;
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

   

    
  
}
