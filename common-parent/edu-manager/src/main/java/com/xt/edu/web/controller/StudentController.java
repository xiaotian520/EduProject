package com.xt.edu.web.controller;

import com.xt.edu.model.Student;
import com.xt.edu.model.User;
import com.xt.edu.service.IUserService;
import com.xt.edu.web.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("student")
public class StudentController extends BaseController<Student> {

    @Autowired
    private IUserService userService;


    @RequestMapping("find")
    public String find(Integer id){
        User user = userService.findById(id);
        System.out.println(user);
        return "index";
    }

    @RequestMapping(MANAGE)
    public String manage(){
        return MANAGE_PAGE;
    }

    @RequestMapping(INFO)
    public String info(){
        return INFO_PAGE;
    }

    @RequestMapping(EDIT)
    public String edit(){
        return EDIT_PAGE;
    }

    @RequestMapping(UPDATE)
    public String update(){
        return UPDATE_PAGE;
    }
}
