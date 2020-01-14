/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.study.proxy.db;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * @Author gaoruiqiang
 * @Description
 * @create:2020/1/13
 */
public class Test {

    @Autowired
    private OrderDao orderDao;

    public static void main(String[] args) {
        try {
            Order order = new Order();
            order.setCreateTime(new Date().getTime());
            OrderServiceSaticProxy orderServiceSaticProxy = new OrderServiceSaticProxy
                    (new OrderServiceImple());
            orderServiceSaticProxy.CreateOrder(order);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
