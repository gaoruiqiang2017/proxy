/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.study.proxy.db;

/**
 * @Author gaoruiqiang
 * @Description
 * @create:2020/1/13
 */
public class OrderServiceImple implements OrderService {

    private OrderDao orderDao;

    public OrderServiceImple() {
        orderDao = new OrderDao();
    }

    @Override
    public int CreateOrder(Order order) {
        System.out.println("OrderService 调用OrderDao 创建订单");
        return orderDao.insert(order);
    }


}
