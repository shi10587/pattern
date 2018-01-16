package com.shi.creation.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 解决反射和反序列化漏洞
 *
 * @author shichao
 * @date 2018/1/3 下午3:29
 */
public class SingletonDemo6 implements Serializable {

    private static SingletonDemo6 instance = new SingletonDemo6();

    private SingletonDemo6() {
        // 解决反射漏洞
        if (null != instance) {
            throw new RuntimeException();
        }
    }

    //反序列化时，如果定义了readResolve()则直接返回此方法指定的对象。而不需要单独再创建对象
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }

    public static SingletonDemo6 getInstance() {
        return instance;
    }
}
