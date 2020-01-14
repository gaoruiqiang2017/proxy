/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.study.proxy.cglibproxy;

/**
 * @Author gaoruiqiang
 * @Description
 * @create:2020/1/13
 */
public class Test {

    public static void main(String[] args) {
        Customer customer = (Customer) new CglibMeipo().getInstance(Customer.class);
        customer.findLove();
    }
}
