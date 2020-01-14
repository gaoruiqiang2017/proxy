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
public class Test {

    public static void main(String[] args) {
        Person instance = (Person) new JDKMeipo().getInstance(new Customer());
        instance.findLove();
    }
}
