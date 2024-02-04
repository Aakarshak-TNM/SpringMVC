package com.example.SpringMVC.Controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class mvcController {
    @RequestMapping("/")
    public String home() {
//         System.out.println("Homepage Requested");
        return "index.jsp"; //It will download the index.jsp file from your browser
//        in order to display the webpage u have to add dependency Tomcat Jasper dependency
    }

    @RequestMapping("/add")
    public String add(@RequestParam("num1") int a, @RequestParam("num2") int b, HttpSession session) {
        int res = a + b;
//Another method
        session.setAttribute("result", res);
        return "result.jsp";
    }
}
