package service;

import java.util.List;

import model.EnrollmentForm;
import repository.EnrollmentFormDao;




public class EnrollmentFormServiceImpl implements EnrollmentFormService{
    private final EnrollmentFormDao formDao = new EnrollmentFormDao();


    @Override
    public EnrollmentForm updateForm(EnrollmentForm theEnrollmentForm){
        return formDao.update(theEnrollmentForm);
    }

    @Override
    public EnrollmentForm registerForm(EnrollmentForm theEnrollmentForm){
        return formDao.register(theEnrollmentForm);
    }

    @Override
    public List<EnrollmentForm> viewEnrollmentForms(){
        return formDao.viewEnrollmentForms();
    }

    @Override
    public EnrollmentForm getFormById(EnrollmentForm theEnrollmentForm) {
        return formDao.getFormById(theEnrollmentForm);
    }

}

