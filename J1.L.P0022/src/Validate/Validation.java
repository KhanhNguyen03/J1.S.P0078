
package Validate;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    static Scanner sc = new Scanner(System.in);
    public static final String REGEX_QUESTION = "^y|^n";
// For Candidate
    public boolean isValidId(String id) {
        String regex = "^[0-9]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(id);
        return matcher.matches();
    }

    public boolean isValidFirstName(String firstName) {
        String regex = "^[A-Za-z\\s]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }

    public boolean isValidLastName(String lastName) {
        String regex = "^[A-Za-z\\s]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }

    public boolean isValidBirthDay(String birthDay) {
        String regex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/((19|20)\\d{2})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(birthDay);
        return matcher.matches();
    }

    public boolean isValidAddress(String address) {
        String regex = "^[A-Za-z0-9/\\s]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(address);
        return matcher.matches();
    }

    public boolean isValidPhone(String phone) {
        String regex = "^[0-9]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();
    }

    public boolean isValidEmail(String email) {
        String regex = "^[a-zA-Z0-9._%+-]+@gmail\\.com$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    // check input
    public String checkId() {
        String id = "";
        while (!isValidId(id)) {
            System.out.println("Input ID: ");
            Scanner sc = new Scanner(System.in);
            id = sc.nextLine();
            if (!isValidId(id)) {
                System.out.println("Invalid input");
            }
        }
        return id;
    }

    public String checkFirstName() {
        String firstName = "";
        while (!isValidFirstName(firstName)) {
            System.out.println("Input firstName: ");
            Scanner sc = new Scanner(System.in);
            firstName = sc.nextLine();
            if (!isValidFirstName(firstName)) {
                System.out.println("Invalid input");
            }
        }
        return firstName;
    }

    public String checkLastName() {
        String lastName = "";
        while (!isValidLastName(lastName)) {
            System.out.println("Input lastName: ");
            Scanner sc = new Scanner(System.in);
            lastName = sc.nextLine();
            if (!isValidLastName(lastName)) {
                System.out.println("Invalid input");
            }
        }
        return lastName;
    }

    public String checkBirthDay() {
        String birthDay = "";
        while (!isValidBirthDay(birthDay)) {
            System.out.println("Input birthDay: ");
            Scanner sc = new Scanner(System.in);
            birthDay = sc.nextLine();
            if (!isValidBirthDay(birthDay)) {
                System.out.println("Invalid input");
            }
        }
        return birthDay;
    }

    public String checkAddress() {
        String address = "";
        while (!isValidAddress(address)) {
            System.out.println("Input address: ");
            Scanner sc = new Scanner(System.in);
            address = sc.nextLine();
            if (!isValidAddress(address)) {
                System.out.println("Invalid input");
            }
        }
        return address;
    }

    public String checkPhone() {
        String phone = "";
        while (!isValidPhone(phone)) {
            System.out.println("Input phone: ");
            Scanner sc = new Scanner(System.in);
            phone = sc.nextLine();
            if (!isValidPhone(phone)) {
                System.out.println("Invalid input");
            }
        }
        return phone;
    }

    public String checkEmail() {
        String email = "";
        while (!isValidEmail(email)) {
            System.out.println("Input email: ");
            Scanner sc = new Scanner(System.in);
            email = sc.nextLine();
            if (!isValidEmail(email)) {
                System.out.println("Invalid input");
            }
        }
        return email;
    }

    // For fresher
    public boolean isValidGraduation(String graduationDay) {
        String regex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/((19|20)\\d{2})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(graduationDay);
        return matcher.matches();
    }

    public boolean isValidRank(String rank) {
        String regex = "^[A-Za-z\\s]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(rank);
        return matcher.matches();
    }

    public boolean isValidEducation(String education) {
        String regex = "^[A-Za-z\\s]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(education);
        return matcher.matches();
    }

    public String checkGraduation() {
        String graduation = "";
        while (!isValidGraduation(graduation)) {
            System.out.println("Enter graduation date: ");
            Scanner sc = new Scanner(System.in);
             graduation = sc.nextLine();
            if (!isValidGraduation(graduation)) {
                System.out.println("Invalid input");
            }
        }
        return graduation;
    }

    public String checkEducation() {
        
        String education = "";
        while (!isValidEducation(education)) {
            System.out.println("Enter education place: ");
            Scanner sc = new Scanner(System.in);
            education =sc.nextLine();
            if (!isValidGraduation(education)) {
                System.out.println("Invalid input");
            }
        }
        return education;
    }

    public String checkRank() {
        String rank = "";
        while (!isValidRank(rank)) {
            System.out.println("Enter rank of graduation: ");
            Scanner sc = new Scanner(System.in);
            rank =sc.nextLine();
            if (!isValidRank(rank)) {
                System.out.println("Invalid input");
            }
        }
        return rank;
    }
    
    // For Experience
    //year of experience (ExpInYear), Professional Skill (ProSkill). 
    public boolean isValidExpInYear(String expInYear) {
        String regex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/((19|20)\\d{2})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(expInYear);
        return matcher.matches();
    }

    public boolean isValidProSkill(String proSkill) {
        String regex = "^[A-Za-z\\s]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(proSkill);
        return matcher.matches();
    }
    

    public static int checkInt(String mess, int min,int max) {
        int intVar;
        while (true) {
            System.out.println("Enter " + mess + " :");
            try {
                intVar = Integer.parseInt(sc.nextLine().trim());

            } catch (NumberFormatException e) {
                System.out.println("Wrong Input");
                continue;
            }
                if (intVar < min && intVar >max) {
                    System.out.println(mess + " must greater than " + min+ " must less than " + max );
                } else {

                    return intVar;

                }
            }
        }

    

    public String checkProSkill() {
        String proSkill = "";
        while (!isValidProSkill(proSkill)) {
            System.out.println("Enter ProSkill: ");
            Scanner sc = new Scanner(System.in);
            proSkill = sc.nextLine();
            if (!isValidProSkill(proSkill)) {
                System.out.println("Invalid input");
            }
        }
        return proSkill;
    }
    
    
    // for intership
    /*
    private String majors;
    private String semester;
    private String universityName;*/
    public boolean isValidMajor(String major) {
        String regex = "^[A-Za-z\\s]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(major);
        return matcher.matches();
    }
    
    public boolean isValidSemester(String semester) {
        String regex = "^[0-9]+$";;
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(semester);
        return matcher.matches();
    }
    
    public boolean isValidUniversityName(String universityName) {
        String regex = "^[A-Za-z\\s]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(universityName);
        return matcher.matches();
    }
    
    public String checkMajors() {
        String major = "";
        while (!isValidMajor(major)) {
            System.out.println("Input majors: ");
            Scanner sc = new Scanner(System.in);
            major = sc.nextLine();
            if (!isValidMajor(major)) {
                System.out.println("Invalid input");
            }
        }
        return major;
    }
    public String checkSemester() {
        String semester = "";
        while (!isValidSemester(semester)) {
            System.out.println("Input semester: ");
            Scanner sc = new Scanner(System.in);
            semester = sc.nextLine();
            if (!isValidSemester(semester)) {
                System.out.println("Invalid input");
            }
        }
        return semester;
    }
    public String checkUniversityName() {
        String universityName = "";
        while (!isValidUniversityName(universityName)) {
            System.out.println("Input uniName: ");
            Scanner sc = new Scanner(System.in);
            universityName = sc.nextLine();
            if (!isValidUniversityName(universityName)) {
                System.out.println("Invalid input");
            }
        }
        return universityName;
    }
    public static boolean checkInputYN() {
        while (true) {
            String result = sc.nextLine();
            if (result.matches(REGEX_QUESTION ) ){
                return result.equalsIgnoreCase("y");
            }
            System.err.println("Please input y/Y or n/N.");
            System.out.print("Enter again: ");
        }
    }
    
  

    
}
