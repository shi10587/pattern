package com.shi.creation.factory.simpleFactory;

/**
 *
 * @author shichao
 * @date 2018/1/4 下午2:22
 */
public class CarTest {

    public static void main(String[] args) {
        Car car = CarFactory.getCar("audi");
        car.run();
    }

}
