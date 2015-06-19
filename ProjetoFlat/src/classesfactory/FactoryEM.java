package classesfactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class FactoryEM {
	private static EntityManagerFactory emf = null;
	private static EntityManager em = null;
	private static FactoryEM instance = new FactoryEM();

	private FactoryEM() {

	}

	public static FactoryEM getInstance() {
		return instance;
	}

	public static EntityManager create() {
		try {
			if (emf == null) {
				emf = Persistence.createEntityManagerFactory("hibernateteste");

			}
			em = emf.createEntityManager();

		} catch (Exception e) {
			System.out.println("Nao conseguiu acesar o Banco ");
		}
		return em;
	}
}
