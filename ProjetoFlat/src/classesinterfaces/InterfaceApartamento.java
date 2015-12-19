package classesinterfaces;

import classesbasicas.Apartamento;
import java.util.Date;


import java.util.List;

public interface InterfaceApartamento extends InterfaceGeneric{
 public List<Apartamento> pesquisarReserva(Date entrada, Date saida);
 public int pesquisarQtdApartamento();
}
