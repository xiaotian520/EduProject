package com.xt.edu.service.impl;

import com.xt.edu.model.User;
import com.xt.edu.service.IUserService;
import com.xt.edu.service.base.BaseServiceImpl;
import com.xt.edu.utils.Page;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl<User> implements IUserService {

    /**
     *    继承了BaseServiceImpl
     *    就相当于继承了IBaseService中的所有方法
     *    但是不会继承特有的方法，特有的方法定义在IUserService中
     *    给BaseServiceImpl一个User类型，
     *    就将User类型赋给了所有方法上的泛型
     *    public T findById(Integer id)  == public User findById(Integer id)
     *
     *    直接在BaseServiceImpl中自动注入Mapper,方便字类直接调用
     */

    /**
     *  所以实现IUserService
     *  是为了实现特有的方法！
     *  除了抽取的方法以外的方法定义在IUserService中
     *  其他抽取的方法定义在IBaseService中
     *  被BaseServiceImpl实现之后再继承下来
     */



    @Override
    public User login(String username, String password) {
        return userMapper.selectByNameAndPassword(username, password);
    }


    @Override
    public Page<User> findUserList(Integer page, Integer rows, String username, String realname, Integer emp_id) {
        User user = new User();
        if (StringUtils.isNotBlank(username)){
            user.setUsername(username);
        }
        if (StringUtils.isNotBlank(realname)){
            user.setRealname(realname);
        }
        user.setEmpId(emp_id);
        user.setStart((page-1) * rows);
        user.setRows(rows);
        System.out.println("********************************"+user);
        List<User> users = userMapper.selectUserList(user);
        int count =  userMapper.selectUserListCount(user);
        Page<User> result = new Page<>();
        result.setPage(page);
        result.setRows(users);
        result.setSize(rows);
        result.setTotal(count);
        System.out.println(users);
        System.out.println("=================="+rows);
        return result;
    }

    @Override
    public User findById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public User findByUUId(String uuid) {
        return null;
    }

    @Override
    public void deleteByUUId(String uuid) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public void insert(User user) {

    }
}
