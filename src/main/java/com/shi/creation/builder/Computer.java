package com.shi.creation.builder;

import lombok.Getter;
import lombok.Setter;

/**
 * @author shichao
 * @date 2018/1/9 下午4:05
 */
public class Computer {

    /**
     * 类型
     */
    @Setter
    @Getter
    private String type;
    /**
     * 屏幕
     */
    @Setter
    @Getter
    private String screen;
    /**
     * cpu
     */
    @Setter
    @Getter
    private String cpu;
    /**
     * 键盘
     */
    @Setter
    @Getter
    private String keyBoard;

}
