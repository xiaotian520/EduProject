package com.xt.edu.web.controller;

import com.xt.edu.model.Customer;
import com.xt.edu.web.controller.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("customer")
public class CustomerController extends BaseController<Customer> {


    @RequestMapping("find")
    public String find(Integer id){
        //User user = userService.findById(id);
        //System.out.println(user);
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
