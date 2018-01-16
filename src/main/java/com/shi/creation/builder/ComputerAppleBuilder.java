package com.shi.creation.builder;

/**
 * Apple computer构建者
 *
 * @author shichao
 * @date 2018/1/9 下午4:34
 */
public class ComputerAppleBuilder extends ComputerBuilder {

    public void buildType() {
        computer.setType("APPLE");
    }

    public void buildScreen() {
        computer.setScreen("APPLE screen");
    }

    public void buildCpu() {
        computer.setCpu("APPLE cpu");
    }

    public void buildKeyBoard() {
        computer.setKeyBoard("APPLE keyBoard");
    }
}
