package com.schoolmanagement.controller.student;

import com.schoolmanagement.entity.student.Student;
import com.schoolmanagement.service.student.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class studentController {
    @Autowired
    StudentService studentService;// dependency injection
    @PostMapping("/students/save")
    public String studentRegistration(@Valid @ModelAttribute("student") Student student){
      studentService.create(student);
      return "redirect:/students";

    }
    @GetMapping("/form")
    public String showStudentForm(Model model) {
        model.addAttribute("student", new Student());
        return "student_Register";
    }

    @GetMapping("/students")
    public String getallstudent( Model model, @RequestParam(required = false) String name ){
        List<Student>students=new ArrayList<>();
       if(name!=null){
           students= studentService.search(name);
           model.addAttribute("students",students);
           return "StudentHome";
       }
       else {
        students =studentService.getAll();
        model.addAttribute("students",students);
        return "StudentHome";}
    }
@GetMapping("/delete/{id}")
public String deleteStudent(@PathVariable int id){
        studentService.deleteStudent(id);
        return "redirect:/students";

}
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable int id, Model model) {
        Student student = studentService.getStudentByrollNumber(id);
        model.addAttribute("student", student);
        return "update";
    }

    @PostMapping("/update")
    public String updateStudent(@ModelAttribute("student") Student student) {
        studentService.create(student);
        return "redirect:/students";
    }


}
