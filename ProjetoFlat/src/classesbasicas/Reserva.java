package classesbasicas;

import java.util.Calendar;
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
int id;
Calendar dataregistro;
Calendar datainicio;
Calendar datafim;
@ManyToOne
Apartamento apartamento;
}
