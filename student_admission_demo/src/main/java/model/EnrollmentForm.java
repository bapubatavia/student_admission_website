package model;

import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name="enrollment_form")
public class EnrollmentForm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "form_id")
    private int formId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column
    private String gender;
    @Temporal(TemporalType.DATE) 
    @Column(name = "date_of_birth")
    private Date dob;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column
    private String faculty;
    @Column
    private String department;
    @Column
    private String semester;
    @Column
    private String address;
    @Column(name = "passport_picture")
    private byte[] passportPicture;
    @Column(name = "passport_picture_type")
    private String passportPictureType;

    private String base64Image;
    @Column(name = "certificate_pdf")
    private byte[] certificatePdf;
    private String formattedDob;
    private String status;

    public EnrollmentForm(){
    }
    
    public EnrollmentForm(int formId) {
        this.formId = formId;
    }

    public EnrollmentForm(int formId, String firstName, String lastName, String gender, Date dob, String phoneNumber,
            String faculty, String department, String semester, String address, byte[] passportPicture, String passportPictureType,
            byte[] certificatePdf, String status) {
        this.formId = formId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dob = dob;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.department = department;
        this.semester = semester;
        this.address = address;
        this.passportPicture = passportPicture;
        this.passportPictureType = passportPictureType;
        this.certificatePdf = certificatePdf;
        this.status = status;
    }

    public int getFormId() {
        return formId;
    }

    public void setFormId(int formId) {
        this.formId = formId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public byte[] getPassportPicture() {
        return this.passportPicture;
    }

    public void setPassportPicture(byte[] passportPicture) {
        this.passportPicture = passportPicture;
    }

    public String getPassportPictureType() {
        return passportPictureType;
    }

    public void setPassportPictureType(String passportPictureType) {
        this.passportPictureType = passportPictureType;
    }

    public byte[] getCertificatePdf() {
        return certificatePdf;
    }

    public void setCertificatePdf(byte[] certificatePdf) {
        this.certificatePdf = certificatePdf;
    }

    public String getBase64Image() {
        base64Image = Base64.getEncoder().encodeToString(this.passportPicture);
        return base64Image;
    }

    public void setBase64Image(String base64Image) {
        this.base64Image = base64Image;
    }
    
    public String getFormattedDob(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        formattedDob = dateFormat.format(this.dob);
        return formattedDob;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    


}
