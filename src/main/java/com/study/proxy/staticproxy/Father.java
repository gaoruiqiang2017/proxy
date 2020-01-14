/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.study.proxy.staticproxy;

/**
 * @Author gaoruiqiang
 * @Description
 * @create:2020/1/13
 */
public class Father implements Person {

    private Son son;

    public Father(Son son) {
        this.son = son;
    }

    @Override
    public void findLove() {
        before();
        son.findLove();
        after();
    }

    void before() {
        System.out.println("开始物色");
    }

    void after() {
        System.out.println("结束");
    }


}
