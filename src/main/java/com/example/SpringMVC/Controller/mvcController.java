package com.example.SpringMVC.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class mvcController {
    @RequestMapping("/")
    public String home() {
//         System.out.println("Homepage Requested");
        return "index"; //It will download the index.jsp file from your browser
//        in order to display the webpage u have to add dependency Tomcat Jasper dependency
    }

    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("result");
        int res = a + b;
        mv.addObject("result", res);
        return mv;
    }
}
