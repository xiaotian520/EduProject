package com.xt.edu.web.controller.base;

import java.lang.reflect.ParameterizedType;

public abstract class BaseController<T> {

    public static String MANAGE_PAGE;//管理页面
    public static String INFO_PAGE;//列表页面
    public static String EDIT_PAGE;//编辑页面
    public static String UPDATE_PAGE;//更新页面


    public static final String MANAGE = "manage";//管理
    public static final String INFO = "info";//列表
    public static final String EDIT = "edit";//编辑
    public static final String UPDATE = "update";//更新

    public BaseController(){
        //1.获取泛型的真实类型BaseController
        ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
        System.out.println("======"+type);
        //com.xt.edu.web.controller.base.BaseController<com.xt.edu.model.User>

        //获取到被调用的模型
        Class<?> modelClass = (Class<?>) type.getActualTypeArguments()[0];
        System.out.println("======"+modelClass);
        //class com.xt.edu.model.User

        //2.获取模块名并转成小写
        String moduleName = modelClass.getSimpleName().toLowerCase();

        //3.给静态属性赋值
        MANAGE_PAGE = moduleName + "/" +MANAGE;
        INFO_PAGE = moduleName + "/" + INFO;
        EDIT_PAGE = moduleName + "/" + EDIT;
        UPDATE_PAGE = moduleName + "/" + UPDATE;

    }
}
