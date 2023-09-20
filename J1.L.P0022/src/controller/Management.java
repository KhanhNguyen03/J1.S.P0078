package controller;

import Validate.Validation;
import java.util.ArrayList;
import java.util.function.Predicate;
import model.Candidates;
import model.Experience;
import model.Fresher;
import model.Intern;


public class Management {
   
    ArrayList<Candidates> candidates = new ArrayList<>();
    Validation val = new Validation();
   public void addCandidate(int type) {
        boolean continueAdding = true;
        while (continueAdding) {
       String id = val.checkId();
       String FirstName = val.checkFirstName();
       String LastName= val.checkLastName();
       String BirthDate=val.checkBirthDay();
       String Address=val.checkAddress();
       String Phone = val.checkPhone();
       String email= val.checkEmail();
       switch (type) {
            case 0:
                int yearExperience = val.checkInt("Year Experience",0,100);   
                String ProfessionalSkil = val.checkProSkill();
                candidates.add(new Experience(yearExperience, ProfessionalSkil, id, FirstName, LastName, BirthDate, Address, Phone, email,type));
                break;
                
            case 1:
                    String graduationDate = val.checkGraduation();
                    String graduationRank = val.checkRank();
                    candidates.add(new Fresher(graduationDate, graduationRank, email, id, FirstName, LastName, BirthDate, Address, Phone, email, type));
                    break;
                case 2:
                    String major =val.checkMajors();
                    String semester = val.checkSemester();
                    String university = val.checkUniversityName();
                    candidates.add(new Intern(major, semester, university, id, FirstName, LastName, BirthDate, Address, Phone, email, type));
                    break;
                    
            }
        System.out.print("Do you want to continue (Y/N): ");
            continueAdding = val.checkInputYN();
            if (continueAdding && type != 0) {
                break;
            }
       
        }
            }
    public ArrayList<Candidates> search(Predicate<Candidates> p) {
        ArrayList<Candidates> rs = new ArrayList<>();
        for (Candidates s : candidates) {
            if (p.test(s)) {
                rs.add(s);
            }
        }
        return rs;

    }
   public void searchCandidate(){
        String name = val.checkFirstName();
        int typeCandidate = val.checkInt("Type Candidate",0,2);
        int count = 0;
        ArrayList<Candidates> search = search(i->i.getLFName().contains(name));
        if(search.isEmpty()){
            System.out.println("Empty");
        }
        else{
            for (Candidates candidate : candidates){
                if(candidate.getCandidatetype() == typeCandidate){
                    System.out.println(search.toString());
                    count++;
                }
            }
        }
        if(count==0){
            System.out.println("Empty");
        }
    }
   
   }
