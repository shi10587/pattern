package com.shi.construction.bridge;

/**
 * 抽象实现
 *
 * @author shichao
 * @date 2018/1/12 下午5:14
 */
public class ComputerBrandApple extends ComputerBrand {

    public ComputerBrandApple(Color color) {
        super(color);
    }

    @Override
    String brand() {
        return "Apple computer";
    }
}
