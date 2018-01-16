package com.shi.creation.builder;

/**
 * computer构建接口
 *
 * @author shichao
 * @date 2018/1/9 下午4:11
 */
public abstract class ComputerBuilder {

    protected Computer computer = new Computer();

    /**
     * 构建computer类型
     */
    public abstract void buildType();
    /**
     * 构建computer屏幕
     */
    public abstract void buildScreen();
    /**
     * 构建computer cpu
     */
    public abstract void buildCpu();
    /**
     * 构建computer键盘
     */
    public abstract void buildKeyBoard();

    public Computer createComputer() {
        return computer;
    }

}
