package com.shi.creation.factory.simpleFactory;

/**
 * @author shichao
 * @date 2018/1/4 下午2:14
 */
public class CarBenz implements Car {
    @Override
    public void run() {
        System.out.println("benz车启动");
    }
}
