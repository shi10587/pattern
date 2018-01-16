package com.shi.construction.proxy.dynamicProxy.jdkProxy;


import java.lang.reflect.Proxy;

/**
 * JDK的动态代理创建机制
 * 1、获取 RealSubject上的所有接口列表；
 * 2、确定要生成的代理类的类名，默认为：com.sun.proxy.$ProxyXXXX ；
 * 3、根据需要实现的接口信息，在代码中动态创建 该Proxy类的字节码；
 * 4、将对应的字节码转换为对应的class 对象；
 * 5、创建InvocationHandler 实例handler，用来处理Proxy所有方法调用；
 * 6、Proxy 的class对象 以创建的handler对象为参数，实例化一个proxy对象
 * <p>
 * 租赁者
 *
 * @author shichao
 * @date 2018/1/10 下午3:29
 */
public class Renter {

    public static void main(String[] args) {
        Deal deal = new DealLord();
        DealHandler handler = new DealHandler(deal);
        Deal dealProxy = (Deal) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Deal.class}, handler);
        dealProxy.talk();
        dealProxy.investigate();
        dealProxy.houseCertify();
        dealProxy.signContact();
    }

}
