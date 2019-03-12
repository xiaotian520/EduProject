package com.xt.edu.mapper;

import com.xt.edu.mapper.base.BaseMapper;
import com.xt.edu.model.User;

public interface UserMapper extends BaseMapper<User> {


/**
 *  UserMapper 继承了BaseMapper中所有的方法
 *  在Service中让Mapper自动注入，便于直接调用
 *
 */
}
