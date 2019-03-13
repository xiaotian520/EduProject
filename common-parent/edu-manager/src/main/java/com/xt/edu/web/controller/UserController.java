package com.xt.edu.web.controller;

import com.mchange.v2.lang.StringUtils;
import com.xt.edu.model.User;
import com.xt.edu.service.IUserService;
import com.xt.edu.web.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("user")
public class UserController extends BaseController<User> {

    @Autowired
    private IUserService userService;

    @RequestMapping("login")
    public String login(String username, String password,Model model, HttpSession session){
        if (username != null && username != "" &&password!= null && password!=""){
            User user = userService.login(username, password);
            if (user!=null){
                session.setAttribute("USER_SESSION",user);
                return "index";
            }
        }
        model.addAttribute("msg","用户名或密码错误");
        return "login";
    }

    /**
     *  退出登录
     * @param session
     * @return
     */
    @RequestMapping("logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:Tologin.action";
    }
    /**
     *  向用户登陆页面跳转
     */
    @RequestMapping("Tologin")
    public String ToLogin() {
        return "login";
    }

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
