/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.study.proxy.simpleproxy;

/**
 * @Author gaoruiqiang
 * @Description
 * @create:2020/1/13
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("目标对象执行业务逻辑");
    }
}
