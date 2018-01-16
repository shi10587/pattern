package com.shi.construction.adapter;


/**
 * 类适配器类
 * @author shichao
 * @date 2018/1/10 下午2:46
 */
public class Adapter2 extends KeyBoard implements Computer {

    @Override
    public void writeDoc() {
        write();
    }
}
