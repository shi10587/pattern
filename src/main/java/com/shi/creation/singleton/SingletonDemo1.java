package com.shi.creation.singleton;

import java.io.Serializable;

/**
 * 饿汉式单例模式
 *
 * @author shichao
 * @date 2018/1/3 下午3:29
 */
public class SingletonDemo1 implements Serializable {

    private static final long serialVersionUID = 8701743491125522369L;

    private static SingletonDemo1 instance = new SingletonDemo1();

    public static int count1;
    public static int count2 = 0;

    private SingletonDemo1() {
        count1++;
        count2++;
    }

    public static SingletonDemo1 getInstance() {
        return instance;
    }
}
