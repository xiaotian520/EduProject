package com.xt.edu.service;

import com.xt.edu.model.User;
import com.xt.edu.service.base.IBaseService;
import com.xt.edu.utils.Page;

public interface IUserService extends IBaseService<User> {

    /**
     *      继承了 IBaseService 中的方法
     *      只用写特有的方法  很少  很简洁
     */



    //特有的方法
    public User login(String username,String password);

    public Page<User> findUserList(Integer page, Integer rows,String username, String realname, Integer emp_id);
}
