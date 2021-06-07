package com.nyash.spring.mvc.controllers;

import com.nyash.spring.mvc.models.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.*;

@Controller

@RequestMapping("/")
public class MyController {


    @RequestMapping("askDetails")
    public String askEmployeeDetails(Model model){

        Employee emp = new Employee();
        model.addAttribute("employee", emp);

        return "ask-emp-details-view";
    }

    @RequestMapping("showDetails")
    public String showEmpDetails( @ModelAttribute("employee") @Valid Employee emp, BindingResult bindingResult) {
        if (bindingResult.hasErrors()){
            return "ask-emp-details-view";
        } else {
            return "show-emp-details-view";
        }
    }
}
