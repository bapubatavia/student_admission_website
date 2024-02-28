package service;


import java.util.List;

import model.EnrollmentForm;

public interface EnrollmentFormService {
    EnrollmentForm getFormById(EnrollmentForm theEnrollmentForm);
    EnrollmentForm updateForm(EnrollmentForm thEnrollmentForm);
    EnrollmentForm registerForm(EnrollmentForm theEnrollmentForm);
    List<EnrollmentForm> viewEnrollmentForms();
}
