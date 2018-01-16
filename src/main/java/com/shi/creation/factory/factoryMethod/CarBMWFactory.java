package com.shi.creation.factory.factoryMethod;

/**
 * @author shichao
 * @date 2018/1/4 下午2:40
 */
public class CarBMWFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new CarBMW();
    }
}
