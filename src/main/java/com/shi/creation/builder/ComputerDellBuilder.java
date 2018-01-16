package com.shi.creation.builder;

/**
 * Dell computer构建者
 *
 * @author shichao
 * @date 2018/1/9 下午4:26
 */
public class ComputerDellBuilder extends ComputerBuilder {

    public void buildType() {
        computer.setType("DELL");
    }

    public void buildScreen() {
        computer.setScreen("DELL screen");
    }

    public void buildCpu() {
        computer.setCpu("DELL cpu");
    }

    public void buildKeyBoard() {
        computer.setKeyBoard("DELL keyBoard");
    }
}
