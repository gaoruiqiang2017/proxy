/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.study.proxy.jdkproxy;

import com.study.proxy.staticproxy.Person;

/**
 * @Author gaoruiqiang
 * @Description
 * @create:2020/1/13
 */
public class Customer implements Person {
    @Override
    public void findLove() {
        System.out.println("找对象");
    }
}
