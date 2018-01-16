package com.shi.construction.adapter;


/**
 * 对象适配器类
 *
 * @author shichao
 * @date 2018/1/10 下午2:19
 */
public class Adapter implements Computer{

    private KeyBoard keyBoard;

    public Adapter(KeyBoard keyBoard) {
        this.keyBoard = keyBoard;
    }

    @Override
    public void writeDoc() {
        keyBoard.write();
    }

}
