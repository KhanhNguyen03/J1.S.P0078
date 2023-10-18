
package dataAccess;

import common.ScannerFactory;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import model.Student;

public class StudentDao {

    ScannerFactory sc;
    private static StudentDao instance = null;

    public StudentDao() {
        sc = new ScannerFactory();
    }

    public static StudentDao Instance() {
        if (instance == null) {
            synchronized (StudentDao.class) {
                if (instance == null) {
                    instance = new StudentDao();
                }
            }
        }
        return instance;
    }

    public void addStudent(List<Student> stdList) {
        while (true) {
            System.out.println("Please input student information");
            String name = sc.getString("Name: ");
            String classes = sc.getString("Classes: ");
            float mark = sc.getDouble("Mark: ");
            stdList.add(new Student(name, classes, mark));
            System.out.println("Do you want to enter more student information?(Y/n)");
            String choice = sc.getYN();
            if (choice.equals("n")) {
                break;
            }
        }
    }

    public void showAll(List<Student> stdList) {
        Collections.sort(stdList, Comparator.comparing(Student::getName));
        for (Student st : stdList) {
            System.out.println("-----Student " + (stdList.indexOf(st) + 1) + "-----");
            System.out.println("Name: " + st.getName());
            System.out.println("Classes: " + st.getClasses());
            System.out.println("Mark: " + st.getMark());
        }
    }
}
