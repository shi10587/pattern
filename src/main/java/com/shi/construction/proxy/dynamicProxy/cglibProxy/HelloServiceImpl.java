package com.shi.construction.proxy.dynamicProxy.cglibProxy;

/**
 * @author shichao
 * @date 2018/1/11 下午2:06
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public void hello() {
        System.out.println("hello world");
    }

}
