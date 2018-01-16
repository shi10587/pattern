package com.shi.creation.factory.abstractFactory;

/**
 * @author shichao
 * @date 2018/1/4 下午3:22
 */
public class ComputerThinkPadFactory implements ComputerFactory {
    @Override
    public KeyBorad createKeyBorad() {
        return new KeyBoradThinkPad();
    }

    @Override
    public Screen createScreen() {
        return new ScreenThinkPad();
    }
}
