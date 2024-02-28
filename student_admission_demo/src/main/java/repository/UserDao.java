package repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import model.User;

public class UserDao {
    
    public User login(User user) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Query<User> query = ss.createQuery("FROM User WHERE email = :email", User.class);
            query.setParameter("email", user.getEmail());
            User theUser = query.uniqueResult();
            ss.close();
            return theUser;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }


    @SuppressWarnings("deprecation")
    public User register(User user) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.save(user);
            ss.beginTransaction().commit();
            ss.close();
            return user;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public List<User> viewUsers() {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            @SuppressWarnings({ "deprecation", "unchecked" })
            List<User> users = ss.createQuery("SELECT theUser FROM User theUser").list();
            return users;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

}
