package model;




public class Fresher extends Candidates {
    private String graduationDate;
    private String graduationRank;
    private String education;
    
    public Fresher() {
        super();
    }

    public Fresher(String graduationDate, String graduationRank,String education,String Id, String FirstName, String LastName, 
            String BirthDate, String Address, String Phone, String email, int Candidatetype) {
        super(Id, FirstName, LastName, BirthDate, Address, Phone, email, Candidatetype);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
    
    
    
}

