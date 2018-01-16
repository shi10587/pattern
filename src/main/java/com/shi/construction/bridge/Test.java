package com.shi.construction.bridge;

/**
 * @author shichao
 * @date 2018/1/12 下午5:22
 */
public class Test {

    public static void main(String[] args) {
        Color color = new ColorRed();
        Computer computer = new ComputerBrandApple(color);
        computer.run();
    }

}
