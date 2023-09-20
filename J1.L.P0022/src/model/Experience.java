package model;




public class Experience extends Candidates {
    
    private int yearExperience;
    private String ProfessionalSkill;
    
    public Experience() {
        super ();
    }

    public Experience(int yearExperience, String ProfessionalSkill,String Id, String FirstName, String LastName, 
            String BirthDate, String Address, String Phone, String email, int Candidatetype) {
        super(Id, FirstName, LastName, BirthDate, Address, Phone, email, Candidatetype);
        this.yearExperience = yearExperience;
        this.ProfessionalSkill = ProfessionalSkill;
    }

    public int getYearExperience() {
        return yearExperience;
    }

    public void setYearExperience(int yearExperience) {
        this.yearExperience = yearExperience;
    }

    public String getProfessionalSkill() {
        return ProfessionalSkill;
    }

    public void setProfessionalSkill(String ProfessionalSkill) {
        this.ProfessionalSkill = ProfessionalSkill;
    }
    
    
    
}
