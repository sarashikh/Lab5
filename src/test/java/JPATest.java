//import icedCapp.AddressBook;
//import icedCapp.BuddyInfo;
//import org.junit.Test;
//
//import javax.persistence.*;
//import java.util.List;
//
//
//public class JPATest {
//
//    @Test
//    public void performJPA() {
//
//        // Creating objects representing some products
//        BuddyInfo b1 = new BuddyInfo();
//        b1.setName("Sara");
//        b1.setPhoneNumber("613-123-2345");
//        b1.setAge(20);
//
//        BuddyInfo b2 = new BuddyInfo();
//        b2.setName("Max");
//        b2.setPhoneNumber("613-345-8394");
//        b2.setAge(21);
//
//        AddressBook a1 = new AddressBook();
//        a1.addBuddy(b1);
//        a1.addBuddy(b2);
//
//        // Connecting to the database through EntityManagerFactory
//        // connection details loaded from persistence.xml
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-test");
//
//        EntityManager em = emf.createEntityManager();
//
//        // Creating a new transaction
//        EntityTransaction tx = em.getTransaction();
//
//        tx.begin();
//
//        // Persisting the product entity objects
////        em.persist(b1);
////        em.persist(b2);
//        em.persist(a1);
//
//        tx.commit(); //inserting buddy info into table
//
//        // Querying the contents of the database using JPQL query
//        Query q = em.createQuery("SELECT b1 FROM icedCapp.BuddyInfo b1");
//
//        @SuppressWarnings("unchecked")
//        List<BuddyInfo> results = q.getResultList(); //verifying
//
//        System.out.println("List of Buddies\n----------------");
//
//        for (BuddyInfo p : results) {
//
//            System.out.println(p.getName() + " (name=" + p.getName() + ")" + " (phoneNumber=" + p.getPhoneNumber() + ")" + " (age=" + p.getAge() + ")");
//        }
//
//        // Closing connection
//        em.close();
//
//        emf.close();
//    }
//}
