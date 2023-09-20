package model;


public class Intern extends Candidates {
    private String majors;
    private String semester;
    private String university;
    
    public Intern (){
        super();
    }

    public Intern(String majors, String semester, String university,String Id, String FirstName, 
            String LastName, String BirthDate, String Address, 
            String Phone, String email, int Candidatetype) {
        super(Id, FirstName, LastName, BirthDate, Address, Phone, email, Candidatetype);
        this.majors = majors;
        this.semester = semester;
        this.university = university;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
    
}
