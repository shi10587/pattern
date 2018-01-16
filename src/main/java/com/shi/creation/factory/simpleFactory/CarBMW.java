package com.shi.creation.factory.simpleFactory;

/**
 * @author shichao
 * @date 2018/1/4 下午2:16
 */
public class CarBMW implements Car{
    @Override
    public void run() {
        System.out.println("BMW车启动");
    }
}
