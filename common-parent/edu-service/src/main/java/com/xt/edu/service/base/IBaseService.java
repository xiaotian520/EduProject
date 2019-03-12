package com.xt.edu.service.base;

public interface IBaseService<T> {

    //Integer类型的id
    public T findById(Integer id);

    public void deleteById(Integer id);

    //String类型的id
    public T findByUUId(String uuid);

    public void deleteByUUId(String uuid);

    public void update(T t);

    public void insert(T t);
}
