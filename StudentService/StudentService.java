package StudentService;

import Student.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private List<Student> students = new ArrayList<>();

    public void StudentService(Student students) {
        this.students.add(students);
    }

    public void deleteStudent(int Id) {
        int count = 0;
        for (Student student : students) {
            count++;
            if (student.getID().equals(Id)) {
                students.remove(count);
            }
        }
    }

    


}
