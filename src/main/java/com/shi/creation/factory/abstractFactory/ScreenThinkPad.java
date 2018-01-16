package com.shi.creation.factory.abstractFactory;

/**
 * @author shichao
 * @date 2018/1/4 下午3:17
 */
public class ScreenThinkPad implements Screen {
    @Override
    public void show() {
        System.out.println("ThinkPad 普通显示屏");
    }
}
