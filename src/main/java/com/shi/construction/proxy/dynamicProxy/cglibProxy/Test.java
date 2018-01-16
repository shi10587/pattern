package com.shi.construction.proxy.dynamicProxy.cglibProxy;

import net.sf.cglib.proxy.Enhancer;

/**
 * 如果委托类被final修饰，那么它不可被继承，即不可被代理；同样，如果委托类中存在final修饰的方法，那么该方法也不可被代理
 * Exception in thread "main" java.lang.IllegalArgumentException: Cannot subclass final class ...
 *
 * @author shichao
 * @date 2018/1/11 下午2:10
 */
public class Test {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(HelloServiceImpl.class);
        enhancer.setCallback(new HelloMethodInterceptor());
        HelloService helloService = (HelloService) enhancer.create();
        helloService.hello();
    }

}
