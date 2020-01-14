/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.study.proxy.staticproxy;

/**
 * @Author gaoruiqiang
 * @Description
 * @create:2020/1/13
 */
public class Test {

    public static void main(String[] args) {
        Father father = new Father(new Son());
        father.findLove();
    }
}
