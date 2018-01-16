package com.shi.creation.factory.factoryMethod;

/**
 * @author shichao
 * @date 2018/1/4 下午2:42
 */
public class CarTest {

    public static void main(String[] args) {
        Car car = new CarAudiFactory().createCar();
        Car car1 = new CarBMWFactory().createCar();
        Car car2 = new CarBenzFactory().createCar();
        car.run();
        car1.run();
        car2.run();
    }

}
