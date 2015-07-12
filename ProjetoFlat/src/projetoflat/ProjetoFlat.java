/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoflat;

import GUI.TelaGerenciaApt;
import GUI.TelaGerenciaProprietario;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author peppe
 */
public class ProjetoFlat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("hibernateteste");
		emf.close();
        
        //TelaGerenciaApt t = new TelaGerenciaApt();
        //t.setVisible(true);
    }
    
}
