package classesdados;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import classesfactory.FactoryEM;
import classesinterfaces.InterfaceGeneric;




public class GenericDAO<T>implements InterfaceGeneric {
	private FactoryEM factory;
	protected EntityManager em;
	

	public GenericDAO() {
		
		em = factory.create();
		
		
	}

	
	public void save(Object obj) {
		em.getTransaction().begin();
		em.persist(obj);
		em.getTransaction().commit();
		
		
	}
	public Object find(Object obj,int id) {
		em.getTransaction().begin();
		Object  t = em.find(obj.getClass(), id);
		em.getTransaction().commit();
		
		return  t;
	}
	public void delete(Object obj) {
		em.getTransaction().begin();
		em.remove(obj);
		em.getTransaction().commit();
		
		
	}
	public List<Object> listall(Object obj) {
		em.getTransaction().begin();
		Query consulta = em.createQuery("from " + obj.getClass().getSimpleName()+" p",obj.getClass());
		List<T> t = consulta.getResultList();
		em.getTransaction().commit();
		
		return  (List<Object>) t;
	}

}
