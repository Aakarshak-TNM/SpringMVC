package com.example.SpringMVC.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class mvcController {
    @RequestMapping("/")
    public String home() {
//         System.out.println("Homepage Requested");
        return "index"; //It will download the index.jsp file from your browser
//        in order to display the webpage u have to add dependency Tomcat Jasper dependency
    }

    @RequestMapping("/add")
    public String add(@RequestParam("num1") int a, @RequestParam("num2") int b, ModelMap model) {
        int res = a + b;
        model.addAttribute("result", res);
        return "result";
    }
}
