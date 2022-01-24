package web.dao;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.config.WebConfig;
import web.models.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class HibernateUserDAO implements DAO{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> showAll() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }

    @Override
    public User show(int id) {
        return null;
    }

    @Override
    public void save(User user) {

    }

    @Override
    public void update(int id, User updatedUser) {

    }

    @Override
    public void delete(int id) {

    }

    // Реализация методов взаимодействия с БД

//    AnnotationConfigApplicationContext context =
//            new AnnotationConfigApplicationContext(WebConfig.class);
//
//    EntityManagerFactory emf = context.getBean(EntityManagerFactory.class);
//    EntityManager em = emf.createEntityManager();

//    @Override
//    public List<User> showAll() {
//        Session session = em.unwrap(Session.class);
//        List<User> userList = session.createQuery("from User", User.class).getResultList();
//        //session.getTransaction().commit();
//        return userList;
//    }
//
//    @Override
//    public User show(int id) {
//        Session session = em.unwrap(Session.class);
//        User user = session.get(User.class, id);
//        //return showAll().stream().filter(user -> user.getId() == id).findAny().orElse(null);
//        return user;
//    }
//
//    @Override
//    public void save(User user) {
//        Session session = em.unwrap(Session.class);
//        session.save(user);
//    }
//
//    @Override
//    public void update(int id, User updatedUser) {
//        Session session = em.unwrap(Session.class);
//        Query query = session.createQuery("update User set name=:nameParam, age=:ageParam, " +
//                "email=:emailParam where id=:idParam");
//        query.setParameter("nameParam", updatedUser.getName());
//        query.setParameter("ageParam", updatedUser.getAge());
//        query.setParameter("emailParam", updatedUser.getEmail());
//        query.setParameter("idParam", id);
//        query.executeUpdate();
//    }
//
//    @Override
//    public void delete(int id) {
//        Session session = em.unwrap(Session.class);
//        Query query = session.createQuery("delete from User where id=:idParam");
//        query.setParameter("idParam", id);
//        query.executeUpdate();
//    }
}