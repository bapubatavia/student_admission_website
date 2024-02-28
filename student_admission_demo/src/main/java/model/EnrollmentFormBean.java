package model;


public class EnrollmentFormBean {
    private int formId;
    private String firstName;
    private String lastName;
    private String gender;
    private String dob;
    private String phoneNumber;
    private String faculty;
    private String department;
    private String semester;
    private String address;
    private byte[] passportPicture;
    private String passportPictureType;
    private String base64Image;
    private byte[] certificatePdf;
    private String status;

    // Getters and Setters
    public int getFormId() {
        return formId;
    }

    public void setFormId(int formId) {
        this.formId = formId;
    }

    public String getBase64Image() {
        return base64Image;
    }

    public void setBase64Image(String base64Image) {
        this.base64Image = base64Image;
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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
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
        return passportPicture;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
}
