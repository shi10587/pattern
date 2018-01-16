package com.shi.creation.factory.abstractFactory;

/**
 * @author shichao
 * @date 2018/1/4 下午3:21
 */
public class ComputerAppleFactory implements ComputerFactory {
    @Override
    public KeyBorad createKeyBorad() {
        return new KeyBoradApple();
    }

    @Override
    public Screen createScreen() {
        return new ScreenApple();
    }
}
