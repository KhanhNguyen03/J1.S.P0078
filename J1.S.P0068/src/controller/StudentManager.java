
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Student;
import repository.IStudentRes;
import repository.StudentRes;
import view.Menu;

public class StudentManager extends Menu {

    private List<Student> stdList;
    IStudentRes mn;
    static String[] mc = {"Add student", "Show All", "Exit"};

    public StudentManager() {
        super("Collection Sort Program", mc);
        stdList = new ArrayList<>();
        mn = new StudentRes();
    }
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1 : {
                mn.addStudent(stdList);
                break;
            }
            case 2 : {
                mn.showAll(stdList);
                break;
            }
            case 3 :{
                System.exit(0);
                break;
            }
        }
    }

}
