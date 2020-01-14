/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.study.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author gaoruiqiang
 * @Description
 * @create:2020/1/13
 */
public class JDKMeipo implements InvocationHandler {

    //被代理的对象,把对象的引用保存下来
    private Object object;

    public Object getInstance(Object object) {
        this.object = object;
        Class<?> clazz = object.getClass();
        //利用反射将类的所有方法生成
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object invoke = method.invoke(this.object, args);
        after();
        return invoke;
    }

    void before() {
        System.out.println("媒婆开始物色对象");
    }

    void after() {
        System.out.println("找对象结束");
    }
}
