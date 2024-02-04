package com.example.SpringMVC.Controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class mvcController {
    @RequestMapping("/")
    public String home() {
//         System.out.println("Homepage Requested");
        return "index.jsp"; //It will download the index.jsp file from your browser
//        in order to display the webpage u have to add dependency Tomcat Jasper dependency
    }

    @RequestMapping("/add")
    public String add(HttpServletRequest req) {
        int a = Integer.parseInt(req.getParameter("num1"));
        int b = Integer.parseInt(req.getParameter("num2"));
        int res = a + b;

        HttpSession session = req.getSession();
        session.setAttribute("result", res);
        return "result.jsp";
    }
}
