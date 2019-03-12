package com.xt.edu.service.base;

import com.xt.edu.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseServiceImpl<T> implements IBaseService<T> {

    /**
     * 实现了IBaseService  就实现了IBaseService中所有的方法
     */

    //统一管理Dao
    @Autowired
    protected UserMapper userMapper;
}
