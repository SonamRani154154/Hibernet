package in.purab.tech;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

         Alien a1= new Alien();
          a1.setAid(101);
           a1.setName("sonam ");
            a1.setTech("Java");
        Configuration config= new Configuration();
         config.addAnnotatedClass(in.purab.tech.Alien.class);
          config.configure("hibernate.cfg.xml");
        config.configure();
        SessionFactory factory=config.buildSessionFactory();
        Session session= factory.openSession();

        Transaction transaction=session.beginTransaction();
         session.persist(a1);
         transaction.commit();
    }
}