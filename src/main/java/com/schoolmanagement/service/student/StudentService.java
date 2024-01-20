package com.schoolmanagement.service.student;

import com.schoolmanagement.entity.student.Student;

import java.util.List;

public interface StudentService {
    Student create(Student studentService);

    List<Student> getAll();

    List<Student> search(String name);

    void deleteStudent(int id);

    Student getStudentByrollNumber(int id);
}
