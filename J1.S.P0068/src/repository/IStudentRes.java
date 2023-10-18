
package repository;

import java.util.List;
import model.Student;

public interface IStudentRes {
    void addStudent(List<Student> stdList);
    void showAll(List<Student> stdList);
}
