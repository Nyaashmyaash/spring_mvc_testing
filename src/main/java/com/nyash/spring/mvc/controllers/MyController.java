package com.nyash.spring.mvc.controllers;

import com.nyash.spring.mvc.models.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

@Controller

@RequestMapping("/")
public class MyController {


    @RequestMapping("askDetails")
    public String askEmployeeDetails(Model model){
        Employee emp = new Employee();
        emp.setName("Mike");
        emp.setSurname("Donalds");
        emp.setSalary(500);
        emp.setDepartment("HR");
        model.addAttribute("employee", emp);
        return "ask-emp-details-view";
    }

    @RequestMapping("showDetails")
    public String showEmpDetails(@ModelAttribute("employee") Employee emp) {
        return "show-emp-details-view";
    }
}
