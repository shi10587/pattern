package com.shi.construction.proxy.dynamicProxy.cglibProxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author shichao
 * @date 2018/1/11 下午2:07
 */
public class HelloMethodInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("===============Before===============");
        Object obj = methodProxy.invokeSuper(o, objects);
        System.out.println("===============After================");
        return obj;
    }

}
