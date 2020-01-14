/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.study.proxy.db;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author gaoruiqiang
 * @Description
 * @create:2020/1/13
 */
public class OrderServiceSaticProxy implements OrderService {

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
    private OrderService orderService;

    public OrderServiceSaticProxy(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public int CreateOrder(Order order) {
        before();
        //切换数据源
        Long createTime = order.getCreateTime();
        String format = sdf.format(new Date(createTime));
        Integer dbRouter = Integer.valueOf(format);
        System.out.println("静态代理类自动分配到【DB_" + dbRouter + "】数据源处理数据。");
        DynamicDataSourceEntry.set(dbRouter);
        orderService.CreateOrder(order);
        DynamicDataSourceEntry.restore();
        after();
        return 0;
    }

    void before() {
        System.out.println("代理开始");
    }

    void after() {
        System.out.println("代理结束");
    }
}
