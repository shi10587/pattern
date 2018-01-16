package com.shi.construction.proxy.dynamicProxy.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * jdk动态实现方式
 * 代理类都需要实现InvocationHandler类，实现invoke方法。
 * 该invoke方法就是调用被代理接口的所有方法时需要调用的，该invoke方法返回的值是被代理接口的一个实现类
 *
 * @author shichao
 * @date 2018/1/10 下午5:22
 */
public class DealHandler implements InvocationHandler {

    private Deal deal;

    public DealHandler(Deal deal) {
        this.deal = deal;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("==================动态代理start====================");
        if ("houseCertify".equals(method.getName())) {
            method.invoke(deal, args);
        } else {
            System.out.println(method.getName());
        }
        System.out.println("==================动态代理end====================");
        return null;
    }

}
