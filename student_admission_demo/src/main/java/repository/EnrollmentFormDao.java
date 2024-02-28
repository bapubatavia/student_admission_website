package repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import model.EnrollmentForm;

public class EnrollmentFormDao {
    



    @SuppressWarnings("deprecation")
    public EnrollmentForm register(EnrollmentForm EnrollmentForm) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.save(EnrollmentForm);
            ss.beginTransaction().commit();
            ss.close();
            return EnrollmentForm;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @SuppressWarnings("deprecation")
    public EnrollmentForm update(EnrollmentForm EnrollmentForm) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.update(EnrollmentForm);
            ss.beginTransaction().commit();
            ss.close();
            return EnrollmentForm;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }    

    public EnrollmentForm getFormById(EnrollmentForm enrollmentForm) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Query<EnrollmentForm> query = ss.createQuery("FROM EnrollmentForm WHERE formId = :formId", EnrollmentForm.class);
            query.setParameter("formId", enrollmentForm.getFormId());
            EnrollmentForm theEnrollmentForm = query.uniqueResult();
            ss.close();
            return theEnrollmentForm;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public List<EnrollmentForm> viewEnrollmentForms() {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            @SuppressWarnings({ "deprecation", "unchecked" })
            List<EnrollmentForm> EnrollmentForms = ss.createQuery("SELECT theEnrollmentForm FROM EnrollmentForm theEnrollmentForm").list();
            return EnrollmentForms;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

}
