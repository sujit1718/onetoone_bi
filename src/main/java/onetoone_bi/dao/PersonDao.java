package onetoone_bi.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoone_bi.dto.Person;

public class PersonDao {

	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("sujit").createEntityManager();
	}
	
	public void savePerson(Person person) {
		EntityManager manager = getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(person.getAc());
		manager.persist(person);
		transaction.commit();
	}
	
	public void getPerson(int id) {
		EntityManager manager = getEntityManager();
		Person person = manager.find(Person.class, id);
		if (person!=null) {
			System.out.println(person);
		} else {
            System.out.println("No person found with id : "+id);
		}
	}
	
	public void deletePerson(int id) {
		EntityManager manager = getEntityManager();
		Person person = manager.find(Person.class, id);
		
		if (person != null) {
			EntityTransaction transaction  = manager.getTransaction();
			transaction.begin();
			manager.remove(person.getAc());
			manager.remove(person);
			transaction.commit();
		}else {
			System.out.println("Person not found with id : "+id);
		}
	}
	
	public void updatePerson(int id, Person person) {
		EntityManager manager = getEntityManager();
		Person person2 = manager.find(Person.class, id);
		if (person2 != null) {
			EntityTransaction transaction = manager.getTransaction();
			person.setId(id);
			person.setAc(person2.getAc());
			transaction.begin();
			manager.merge(person);
			transaction.commit();
		} else {
             System.out.println("No person found with id: "+id);
		}
	}
}
