package com.schoolmanagement.serviceimpl.student;

import com.schoolmanagement.entity.student.Student;
import com.schoolmanagement.repository.StudentRepository;
import com.schoolmanagement.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student create(Student studentService) {
        return studentRepository.save(studentService);
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public List<Student> search(String name) {
        return studentRepository.searchStudents(name);
    }

    @Override
    public void deleteStudent(int id) {
        studentRepository.deleteByrollNumber(id);
    }

    @Override
    public Student getStudentByrollNumber(int id) {
        return studentRepository.findByrollNumber(id);
    }
}
