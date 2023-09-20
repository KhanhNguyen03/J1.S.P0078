package model;




public class Candidates {
    private String Id;
    private String FirstName;
    private String LastName;
    private String BirthDate;
    private String Address;
    private String Phone;
    private String email;
    private int Candidatetype;
    
    public Candidates(){
        
    }

    public Candidates(String Id, String FirstName, String LastName, String BirthDate, String Address, String Phone, String email, int Candidatetype) {
        this.Id = Id;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.BirthDate = BirthDate;
        this.Address = Address;
        this.Phone = Phone;
        this.email = email;
        this.Candidatetype = Candidatetype;
    }
    
    

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(String BirthDate) {
        this.BirthDate = BirthDate;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCandidatetype() {
        return Candidatetype;
    }

    public void setCandidatetype(int Candidatetype) {
        this.Candidatetype = Candidatetype;
    }

    @Override
    public String toString() {
        return "Candidates{" + "Id=" + Id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", BirthDate=" + BirthDate + ", Address=" + Address + ", Phone=" + Phone + ", email=" + email + ", Candidatetype=" + Candidatetype + '}';
    }
    
    public String getLFName(){
        String LFName= LastName + FirstName;
        return LFName;
    }
    
}
