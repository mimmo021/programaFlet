package classesbasicas;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import org.hibernate.annotations.ManyToAny;

@Entity
public class Reserva {
@Id
@GeneratedValue
private int id;
private Calendar dataregistro;
 private Calendar dataentrada;
 private Calendar datasaida;
@ManyToOne
private Apartamento apartamento;
private Double valor;
private Boolean calcao;
private Double valorcalcao;
private SituacaoReserva situacao;

public Reserva(){
    this.apartamento = new Apartamento();
    this.dataentrada = new GregorianCalendar();
    this.dataregistro = new GregorianCalendar();
    this.datasaida = new GregorianCalendar();
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
    public Calendar getDataregistro() {
        return dataregistro;
    }

    /**
     * @param dataregistro the dataregistro to set
     */
    public void setDataregistro(Calendar dataregistro) {
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
     * @return the situacao
     */
    public SituacaoReserva getSituacao() {
        return situacao;
    }

    /**
     * @param situacao the situacao to set
     */
    public void setSituacao(SituacaoReserva situacao) {
        this.situacao = situacao;
    }

    
  
}
