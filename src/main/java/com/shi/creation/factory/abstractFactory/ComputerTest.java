package com.shi.creation.factory.abstractFactory;

/**
 * @author shichao
 * @date 2018/1/4 下午3:23
 */
public class ComputerTest {

    public static void main(String[] args) {
        ComputerFactory computer = new ComputerAppleFactory();
        computer.createKeyBorad().use();
        computer.createScreen().show();
    }

}
