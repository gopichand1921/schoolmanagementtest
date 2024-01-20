package com.schoolmanagement.serviceimpl.teacher;

import com.schoolmanagement.entity.teacher.Teacher;
import com.schoolmanagement.repository.TeacherRepository;
import com.schoolmanagement.service.teacher.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    TeacherRepository teacherRepository;
    @Override
    public List<Teacher> getall() {
        return teacherRepository.findAll();
    }

    @Override
    public Teacher saveTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    @Override
    public List<Teacher> search(String name) {
        return teacherRepository.serach(name);
    }
}
