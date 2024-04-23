package onetoone_bi.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class AadharDao {

	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("sujit").createEntityManager();
	}
	
//	public void saveAdharcard(Aadharcard aadhar) {
//		EntityManager manager = getEntityManager();
//		EntityTransaction transaction = manager.getTransaction();
//		transaction.begin();
//		manager.persist(aadhar.getP());
//		manager.persist(aadhar);
//		transaction.commit();
//	}
}
