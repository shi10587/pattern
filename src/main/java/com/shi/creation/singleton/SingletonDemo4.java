package com.shi.creation.singleton;

/**
 * 静态内部类
 *
 * @author shichao
 * @date 2018/1/3 下午3:29
 */
public class SingletonDemo4 {


    private SingletonDemo4() {
    }

    private static class SingletonHolder {
        private static final SingletonDemo4 instance = new SingletonDemo4();
    }

    public static SingletonDemo4 getInstance() {
        return SingletonHolder.instance;
    }
}
