package com.shi.construction.bridge;

/**
 * 抽象部分
 *
 * @author shichao
 * @date 2018/1/12 下午5:10
 */
public abstract class ComputerBrand implements Computer {

    private Color color;

    public ComputerBrand(Color color) {
        this.color = color;
    }

    @Override
    public void run() {
        System.out.println("==========================");
        String computerColor = color.color();
        String computerBrand = brand();
        System.out.println(computerColor + computerBrand);
        System.out.println("==========================");
    }

    abstract String brand();

}
