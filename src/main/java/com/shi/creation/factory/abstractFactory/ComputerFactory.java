package com.shi.creation.factory.abstractFactory;

/**
 * @author shichao
 * @date 2018/1/4 下午3:05
 */
public interface ComputerFactory {

    KeyBorad createKeyBorad();

    Screen createScreen();

}
