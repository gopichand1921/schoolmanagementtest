package com.schoolmanagement.service.teacher;

import com.schoolmanagement.entity.teacher.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> getall();

    Teacher saveTeacher(Teacher teacher);

    List<Teacher> search(String name);
}
