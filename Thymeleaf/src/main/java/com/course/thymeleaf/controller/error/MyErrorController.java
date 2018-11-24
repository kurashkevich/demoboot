package com.course.thymeleaf.controller.error;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyErrorController implements ErrorController {


    @RequestMapping("/error")
    public String handleError(Model model) {
        model.addAttribute("errorMessage", "404");
        return "views/error/error";
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}
