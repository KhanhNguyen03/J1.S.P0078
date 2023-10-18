
package repository;

import dataAccess.StudentDao;
import java.util.List;
import model.Student;

public class StudentRes implements IStudentRes{

    @Override
    public void addStudent(List<Student> stdList) {
        StudentDao.Instance().addStudent(stdList);
    }

    @Override
    public void showAll(List<Student> stdList) {
        StudentDao.Instance().showAll(stdList);
    }
    
}
