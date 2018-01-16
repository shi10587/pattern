package com.shi.construction.adapter;

/**
 * 测试类
 *
 * @author shichao
 * @date 2018/1/10 下午2:39
 */
public class Test {

    public static void main(String[] args) {
        Computer computer = new Adapter(new KeyBoard());
        computer.writeDoc();

        computer = new Adapter2();
        computer.writeDoc();
    }

}
