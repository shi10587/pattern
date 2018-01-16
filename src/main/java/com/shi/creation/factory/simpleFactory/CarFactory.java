package com.shi.creation.factory.simpleFactory;

/**
 * 获取车工厂类
 *
 * @author shichao
 * @date 2018/1/4 下午2:17
 */
public class CarFactory {

    /**
     * 通过类型获取指定车型
     *
     * @param type 类型
     * @return 指定车型
     */
    public static Car getCar(String type) {
        Car car = null;
        if (type.equals("audi")) {
            car = new CarAudi();
        } else if (type.equals("benz")) {
            car = new CarBenz();
        } else if (type.equals("BMW")) {
            car = new CarBMW();
        }
        return car;
    }

}
