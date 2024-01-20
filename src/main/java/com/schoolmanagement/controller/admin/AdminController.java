package com.schoolmanagement.controller.admin;

import com.schoolmanagement.entity.admins.Admins;
import com.schoolmanagement.service.admin.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AdminController {
    @Autowired
    AdminService adminService;
    @GetMapping("/adminAddForm")
    public String showAdminAddForm(Model model) {
        // Add an empty Admins object to the model for form binding
        model.addAttribute("admins", new Admins());
        return "adminAddForm";
    }

    @PostMapping("/adminAdd")
    public String adminAdding(@ModelAttribute Admins admins) {
        Admins savedAdmin = adminService.add(admins);
        // You can add a success message or any other data to the model if needed
        return "redirect:/";
    }
//    @GetMapping("/")
//    public String home(){
//        return "AdminHome";
//    }
    @GetMapping("adminview")
    public String templateDisplay(){
        return "admin";
    }
    @GetMapping("/")
public String getall(Model model){
       List<Admins> admins = adminService.getall();
    model.addAttribute("adminsdata",admins);
    return "AdminHome";
}

}
