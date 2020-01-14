/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.study.proxy.db;

import org.springframework.stereotype.Component;

/**
 * @Author gaoruiqiang
 * @Description
 * @create:2020/1/13
 */
@Component
public class OrderDao {

    int insert(Order order) {
        System.out.println("插入数据库成功");
        return 1;
    }

}
