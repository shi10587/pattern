package com.shi.creation.singleton;

/**
 * 双重检验锁模式,如果不加volatile或者jdk版本为1.6之前有问题，涉及jvm内部模型，
 *
 * @author shichao
 * @date 2018/1/3 下午3:29
 */
public class SingletonDemo3 {

    private volatile static SingletonDemo3 instance;

    private SingletonDemo3() {
    }

    public static SingletonDemo3 getInstance() {
        if (null == instance) {//JMM重排序，instance内存分布空间，添加指向，但是对象尚未初始化，instance不为null，但是instance不可用
            synchronized (SingletonDemo3.class) {
                if (null == instance) {
                    instance = new SingletonDemo3();
                }
            }
        }
        return instance;
    }
}
