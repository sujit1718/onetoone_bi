package onetoone_bi.controller;

import onetoone_bi.dao.PersonDao;
import onetoone_bi.dto.Aadharcard;
import onetoone_bi.dto.Person;

public class Main {

	public static void main(String[] args) {

       Person p = new Person();
       p.setName("Sumit");
       p.setPhone(90947523);
       p.setAddress("Nilanga");
      
       Aadharcard a = new Aadharcard();
       a.setName("Sumit");
       a.setAddress("Nilanga");
       
	   a.setP(p);
	   p.setAc(a);
//	   
//	   EntityManagerFactory factory = Persistence.createEntityManagerFactory("sujit");
//	   EntityManager manager = factory.createEntityManager();
//	   EntityTransaction transaction = manager.getTransaction();
//	   
//	   transaction.begin();
//	   manager.persist(p);
//	   manager.persist(a);
//	   transaction.commit();
	   
	   PersonDao dao = new PersonDao();
	   //dao.savePerson(p);
	   //dao.getPerson(1);
	   //dao.deletePerson(4);
	   dao.updatePerson(2, p);

	}

}
