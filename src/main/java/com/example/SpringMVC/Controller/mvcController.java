package com.example.SpringMVC.Controller;

import com.example.SpringMVC.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class mvcController {
    @Autowired
    Student student;

    @RequestMapping("/")
    public String home() {
//         System.out.println("Homepage Requested");
        return "index"; //It will download the index.jsp file from your browser
//        in order to display the webpage u have to add dependency Tomcat Jasper dependency
    }

    @RequestMapping("/add")
    public String add(@RequestParam("id") int id, @RequestParam("name") String name, Model model, Student student) {

        student.setName(name);
        student.setId(id);
        model.addAttribute("result", student);
        return "result";
//        Want to add simple object go for model otherwise for a Map go for ModelMap
    }
}
