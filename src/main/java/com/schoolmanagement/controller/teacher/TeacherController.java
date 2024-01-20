package com.schoolmanagement.controller.teacher;

import com.schoolmanagement.entity.teacher.Teacher;
import com.schoolmanagement.service.teacher.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RequestMapping("teacher")
@Controller
public class TeacherController {
    @Autowired
    TeacherService teacherService;
    @GetMapping("/teachers")
    public String getall(Model  model, @RequestParam(required = false) String name){
        List<Teacher> getall;
        if(name!=null){
            getall =teacherService.search(name);
            model.addAttribute("teachers",getall);
            return "teacher/teacherHome";

      }
        getall = teacherService.getall();
        model.addAttribute("teachers",getall);
        return "teacher/teacherHome";

    }
    @GetMapping("/addTeacher")
    public String teacherSaveHelper(Model model){
        model.addAttribute("teacher",new Teacher());
        return "teacher/TeacherRegister";

    }
    @PostMapping("/SaveTeacher")
    public String teacherCreating(@ModelAttribute Teacher teacher){
        Teacher saveTeacher=teacherService.saveTeacher(teacher);
        return "redirect:/teacher/teachers";
    }
}
