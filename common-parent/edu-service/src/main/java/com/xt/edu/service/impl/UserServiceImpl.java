package com.xt.edu.service.impl;

import com.xt.edu.model.User;
import com.xt.edu.service.IUserService;
import com.xt.edu.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    public User login(String name, String password) {
        return null;
    }

    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
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
