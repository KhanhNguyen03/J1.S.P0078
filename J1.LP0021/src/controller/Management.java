
package controller;

import java.util.ArrayList;
import model.Report;
import model.Student;
import view.Menu;

public class Management extends Menu<String>  {
    static String[] mc = {"Create","Find and Sort","Update/Delete","Report", "Exit"};
    private ArrayList<Student> students ;
    private Validation validate;
    private int count = 0;
    public Management(){
        super("Student Management",mc);
        students = new ArrayList<>();
       validate = new Validation();
    } 
        @Override
    public void execute(int choice) {
        switch(choice){
            case 1 : {create_Student();
            }
            case 2 : {
                Find_and_Sort();
            }
            case 3 : {
                Update_or_Delete();
            }
            case 4 : {
                report();
            }
            default : System.out.println("Try again");
        }
    }
    
    public void create_Student(){
        //if number of students greater than 10 ask user continue or not
        if (count > 10) {
            System.out.print("Do you want to continue (Y/N): ");
            if (!validate.checkInputYN()) {
                return;
            }
        }
         while (true) {
            System.out.print("Enter id: ");
            String id =validate.checkInputString();
            System.out.print("Enter name student: ");
            String name = validate.checkInputString();
            if (!validate.checkIdExist(students, id, name)) {
                System.err.println("Id has exist student. Pleas re-input.");
                continue;
            }
            System.out.print("Enter semester: ");
            String semester = validate.checkInputString();
            System.out.print("Enter name course: ");
            String course =validate.checkInputCourse();
            //check student exist or not
            if (validate.checkStudentExist(students, id, name, semester, course)) {
                students.add(new Student(id, name, semester, course));
                count++;
                System.out.println("Add student success.");
                return;
            }
            System.err.println("Duplicate.");

        }
    }

 public void Find_and_Sort() {
    if (students.isEmpty()) {
        System.err.println("List empty.");
        return;
    }  
    System.out.print("Enter name to search: ");
    String name = validate.checkInputString();   
    boolean found = false;   
    System.out.printf("%-15s%-15s%-15s\n", "Student name", "semester", "Course Name");   
    // Lặp qua danh sách sinh viên và in ra thông tin của các sinh viên thỏa mãn
    for (Student student : students) {
        if (student.getStudentName().contains(name)) {
            student.print();
            found = true; // Đánh dấu là đã tìm thấy ít nhất một sinh viên thỏa mãn
        }
    }    
    if (!found) {
        System.err.println("Not exist!");
    }
}

 public void Update_or_Delete() {
    if (students.isEmpty()) {
        System.err.println("List empty.");
        return;
    }
    System.out.print("Enter student ID: ");
    String id = validate.checkInputString();
    // Tìm sinh viên có ID tương ứng
    ArrayList<Student> studentsToUpdateOrDelete = new ArrayList<>();
    for (Student student : students) {
        if (student.getId().equalsIgnoreCase(id)) {
            studentsToUpdateOrDelete.add(student);
        }
    }
    if (studentsToUpdateOrDelete.isEmpty()) {
        System.err.println("Student with ID " + id + " not found.");
        return;
    }
    System.out.println("List of students with ID " + id + ":");
    int Count = 1;
    System.out.printf("%-15s%-15s%-15s\n", "Student name", "semester", "Course Name");
    for (Student student : studentsToUpdateOrDelete) {
        System.out.println(Count + ". " );
        student.print();
        Count++;
    }

    System.out.print("Do you want to update (U) or delete (D) student? ");
    if (validate.checkInputUD()) {
        System.out.print("Enter the number of the student to update/delete: ");
        int choice =validate.checkInputIntLimit(1, studentsToUpdateOrDelete.size());
        Student studentToUpdateOrDelete = studentsToUpdateOrDelete.get(choice - 1);
        // Cập nhật sinh viên
        System.out.print("Enter new ID: ");
        String newId = validate.checkInputString();
        System.out.print("Enter new student name: ");
        String newName = validate.checkInputString();
        System.out.print("Enter new semester: ");
        String newSemester = validate.checkInputString();
        System.out.print("Enter new course name: ");
        String newCourse = validate.checkInputCourse();

        if (!validate.checkChangeInfomation(studentToUpdateOrDelete, newId, newName, newSemester, newCourse)) {
            System.err.println("Nothing changed.");
            return;
        }

        if (validate.checkStudentExist(students, newId, newName, newSemester, newCourse)) {
            studentToUpdateOrDelete.setId(newId);
            studentToUpdateOrDelete.setStudentName(newName);
            studentToUpdateOrDelete.setSemester(newSemester);
            studentToUpdateOrDelete.setCourseName(newCourse);
            System.err.println("Update success.");
        }
    } else {
    // Xóa sinh viên
       students.removeAll(studentsToUpdateOrDelete);
       count -= studentsToUpdateOrDelete.size();
       System.err.println("Delete success.");

    }
}

  
   public void report() {
    if (students.isEmpty()) {
        System.err.println("List empty.");
        return;
    }

    // Tạo danh sách sinh viên duyệt qua
    ArrayList<Student> uniqueStudents = new ArrayList<>();
    ArrayList<Report> reportList = new ArrayList<>();
    for (Student student : students) {
        boolean found = false;
        // Kiểm tra xem sinh viên đã được thêm vào danh sách chưa
        for (Student uniqueStudent : uniqueStudents) {
            if (uniqueStudent.getStudentName().equals(student.getStudentName()) &&
                uniqueStudent.getCourseName().equals(student.getCourseName())) {
                found = true;
                break;
            }
        }
        // Nếu sinh viên chưa được thêm vào danh sách, thêm nó vào
        if (!found) {
            uniqueStudents.add(student);
        }
    }

    // In ra thông tin từ danh sách đã tạo
    System.out.printf("%-15s%-15s%-15s\n", "Student name", "Course Name", "Total Courses");
    for (Student uniqueStudent : uniqueStudents) {
        int totalCourses = countTotalCourses(uniqueStudent.getStudentName(), uniqueStudent.getCourseName());
        reportList.add(new Report(uniqueStudent.getStudentName(),uniqueStudent.getCourseName(), totalCourses));
    }
    for(Report rp : reportList){
        System.out.printf("%-15s%-15s%-15s\n", rp.getStudentName(), rp.getCourseName(), rp.getTotalCourse());
    }
}
   


private int countTotalCourses(String studentName, String courseName) {
    int totalCourses = 0;
    for (Student student : students) {
        if (student.getStudentName().equals(studentName) && student.getCourseName().equals(courseName)) {
            totalCourses++;
        }
    }
    return totalCourses;

}
}

