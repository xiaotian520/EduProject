package com.xt.edu.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("salary")
public class SalaryController {


    @RequestMapping("/manage")
    public String manage(){
        return "Salary/Manage";
    }

    @RequestMapping("/info")
    public String info(){
        return "Salary/Info";
    }

    @RequestMapping("/edit")
    public String edit(){
        return "Salary/Edit";
    }

    @RequestMapping("/update")
    public String update(){
        return "Salary/Update";
    }
}
