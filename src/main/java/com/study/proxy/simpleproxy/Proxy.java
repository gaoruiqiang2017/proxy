/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.study.proxy.simpleproxy;

/**
 * @Author gaoruiqiang
 * @Description
 * @create:2020/1/13
 */
public class Proxy implements Subject {

    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        before();
        subject.request();
        after();

    }


    void before() {
        System.out.println("代理对象前方法");
    }

    void after() {
        System.out.println("代理对象后方法");
    }


}
