
package controller;

import java.util.ArrayList;
import java.util.Scanner;
import model.Student;


public class Validation{
    private final static Scanner sc = new Scanner(System.in);
    
    public String checkInputString() {
    String input;
    while (true) {
        input = sc.nextLine().trim();
        if (!input.isEmpty()) {
            return input;
        } else {
            System.out.print("Please enter a valid string: ");
        }
    }
   }
   
    public boolean checkIdExist(ArrayList<Student> students, String id, String name) {
        for (Student student : students) {
            if (id.equalsIgnoreCase(student.getId())
                    && !name.equalsIgnoreCase(student.getStudentName())) {
                return false;
            }
        }
        return true;
    }

    //check user input course
    public  String checkInputCourse() {
        
        while (true) {
            String result = checkInputString().trim();
            
            if (result.equalsIgnoreCase("java")
                    || result.equalsIgnoreCase(".net")
                    || result.equalsIgnoreCase("c/c++")) {
                return result;
            }
            System.err.println("There are only three courses: Java, .Net, C/C++");
            System.out.print("Enter again: ");
        }
    }
    
    //check student exist
    public boolean checkStudentExist(ArrayList<Student> ls, String id,
            String studentName, String semester, String courseName) {
        for (Student student : ls) {
            if (id.equalsIgnoreCase(student.getId())
                    && studentName.equalsIgnoreCase(student.getStudentName())
                    && semester.equalsIgnoreCase(student.getSemester())
                    && courseName.equalsIgnoreCase(student.getCourseName())) {
                return false;
            }
        }
        return true;
    }
    
    public boolean checkInputYN() {
    String input;
    while (true) {
        input = sc.nextLine().trim().toUpperCase();
        switch (input) {
    case "Y":
    case "YES":
        return true;
    case "N":
    case "NO":
        return false;
    default:
        System.out.print("Please enter Y/N: ");
}
}
    }

   public boolean checkInputUD(){
           String input;
    while (true) {
        input = sc.nextLine().trim().toUpperCase();
        switch (input) {
            case "U":
            case "UPDATE" : 
                return true; 
            
            case "N":
            case "DELETE"  :
                return false; 
            
            default : System.out.print("Please enter Update/Delete: ");
        }
    }
   }
   
    //check user change or not
    public boolean checkChangeInfomation(Student student, String id,
            String name, String semester, String course) {
        return !(id.equalsIgnoreCase(student.getId())
                && name.equalsIgnoreCase(student.getStudentName())
                && semester.equalsIgnoreCase(student.getSemester())
                && course.equalsIgnoreCase(student.getCourseName()));
    }
    
        //check user input number limit
    public int checkInputIntLimit(int min, int max) {
        //loop until user input correct
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();

                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }
}
