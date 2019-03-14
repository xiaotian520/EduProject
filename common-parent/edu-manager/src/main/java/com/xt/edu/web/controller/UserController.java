package com.xt.edu.web.controller;

import com.xt.edu.model.User;
import com.xt.edu.service.IUserService;
import com.xt.edu.utils.Page;
import com.xt.edu.web.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @RequestMapping(INFO)
    public String list(@RequestParam(defaultValue="1")Integer page,
                       @RequestParam(defaultValue="8")Integer rows,
                       String username, String realname, Integer emp_id, Model model) {
        // 条件查询所有用户
        System.out.println("============================="+page+rows);
        Page<User> users = userService.findUserList(page, rows, username,realname, emp_id);
        model.addAttribute("page", users);
        System.out.println(users.getRows()+"--------------");
        // 添加参数
        model.addAttribute("username", username);
        model.addAttribute("realname", realname);
        model.addAttribute("emp_id", emp_id);
        return INFO_PAGE;
    }


    @RequestMapping(MANAGE)
    public String info(){
        return MANAGE_PAGE;
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
