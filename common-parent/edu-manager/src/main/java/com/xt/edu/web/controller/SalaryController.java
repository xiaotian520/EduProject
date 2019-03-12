package com.xt.edu.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("salary")
public class SalaryController {


    @RequestMapping("manage")
    public String manage(){
        return "salary/manage";
    }

    @RequestMapping("info")
    public String info(){
        return "salary/info";
    }

    @RequestMapping("edit")
    public String edit(){
        return "salary/edit";
    }

    @RequestMapping("update")
    public String update(){
        return "salary/update";
    }
}
