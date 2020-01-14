/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.study.proxy.staticproxy;

/**
 * @Author gaoruiqiang
 * @Description
 * @create:2020/1/13
 */
public class Son implements Person {
    @Override
    public void findLove() {
        System.out.println("找美女");
    }
}
