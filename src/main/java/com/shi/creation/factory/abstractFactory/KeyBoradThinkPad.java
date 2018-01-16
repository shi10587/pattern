package com.shi.creation.factory.abstractFactory;

/**
 * @author shichao
 * @date 2018/1/4 下午3:11
 */
public class KeyBoradThinkPad implements KeyBorad {
    @Override
    public void use() {
        System.out.println("ThinkPad普通键盘");
    }
}
