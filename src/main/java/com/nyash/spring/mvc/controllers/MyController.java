package com.nyash.spring.mvc.controllers;

import com.nyash.spring.mvc.models.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Controller

@RequestMapping("/")
public class MyController {


    @RequestMapping("askDetails")
    public String askEmployeeDetails(Model model){
        Employee emp = new Employee();
        model.addAttribute("employee", emp);

        Map<String, String> departmentMap = new HashMap<>();
        departmentMap.put("IT", "Information Technology");
        departmentMap.put("Sales", "Sales");
        departmentMap.put("HR", "Human Resources");
        model.addAttribute("dept", departmentMap);

        return "ask-emp-details-view";
    }

    @RequestMapping("showDetails")
    public String showEmpDetails(@ModelAttribute("employee") Employee emp) {
        return "show-emp-details-view";
    }
}
