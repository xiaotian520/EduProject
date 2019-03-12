package com.xt.edu.mapper.base;

public interface BaseMapper<T> {

    //Integer类型的id
    public T findById(Integer id);

    public void deleteById(Integer id);

    //String类型的id
    public T findByUUId(String uuid);

    public void deleteByUUId(String uuid);

    public void update(T t);

    public void insert(T t);
}
