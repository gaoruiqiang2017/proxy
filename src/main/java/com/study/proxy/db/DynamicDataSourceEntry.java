/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.study.proxy.db;

/**
 * @Author gaoruiqiang
 * @Description
 * @create:2020/1/13
 */
public class DynamicDataSourceEntry {


    public final static String DUFAULT_SOURCE = null;

    private final static ThreadLocal<String> local = new ThreadLocal<String>();

    private DynamicDataSourceEntry() {
    }

    //清空数据源
    public void clear() {
        local.remove();
    }

    //获取当前数据源
    public static String get() {
        return local.get();
    }

    //还原数据源
    public static void restore() {
        local.set(DUFAULT_SOURCE);
        System.out.println("还原数据源");
    }

    //设置数据源
    public static void set(String source) {
        local.set(source);
    }

    //根据年份设置数据源
    public static void set(int year) {
        local.set("DB_" + year);
        System.out.println("根据年份设置数据源:" + year);
    }

}
