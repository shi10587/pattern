package com.shi.creation.singleton;

/**
 * 懒汉式单例模式
 *
 * @author shichao
 * @date 2018/1/3 下午3:29
 */
public class SingletonDemo2 {

    private static SingletonDemo2 instance;

    private SingletonDemo2() {
    }

    //方法同步，调用效率低
    public synchronized static SingletonDemo2 getInstance() {
        if (null == instance) {
            instance = new SingletonDemo2();
        }
        return instance;
    }
}
