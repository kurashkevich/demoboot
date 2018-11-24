package com.course.thymeleaf.controller.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(Exception.class)
    public String myExceptionHandler(HttpServletRequest httpServletRequest, Exception exc, Model model){
        model.addAttribute("errorMessage", exc.getMessage() + "global");
        return "views/error/error";
    }

}
