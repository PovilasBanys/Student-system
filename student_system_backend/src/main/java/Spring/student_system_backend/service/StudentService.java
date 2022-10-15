package Spring.student_system_backend.service;

import Spring.student_system_backend.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
