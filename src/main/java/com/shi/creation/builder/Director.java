package com.shi.creation.builder;

/**
 * 构建电脑指导者
 *
 * @author shichao
 * @date 2018/1/9 下午4:18
 */
public class Director {

    private ComputerBuilder builder;

    public Director(ComputerBuilder builder) {
        this.builder = builder;
    }

    public Computer construct() {
        builder.buildCpu();
        builder.buildKeyBoard();
        builder.buildScreen();
        builder.buildType();
        return builder.createComputer();
    }

    public static void main(String[] args) {
        Computer c = new Director(new ComputerAppleBuilder()).construct();
        System.out.println(c.getType());
        System.out.println(c.getScreen());
    }

}
