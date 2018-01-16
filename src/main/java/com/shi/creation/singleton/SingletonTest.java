package com.shi.creation.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.util.concurrent.CountDownLatch;

/**
 * 各种模式效率测试
 *
 * @author shichao
 * @date 2018/1/3 下午4:56
 */
public class SingletonTest {

    public static void main(String[] args) throws Exception {
        // 反射问题
        Class<SingletonDemo1> demo1Class = (Class<SingletonDemo1>) Class.forName("com.shi.creation.singleton.SingletonDemo1");
        Constructor<SingletonDemo1> demo1Constructor = demo1Class.getDeclaredConstructor();
        demo1Constructor.setAccessible(true);
        SingletonDemo1 demo1 = demo1Constructor.newInstance();
        SingletonDemo1 demo2 = demo1Constructor.newInstance();
        System.out.println(demo1 == demo2);//false

        // 序列化问题
//        FileOutputStream out = new FileOutputStream("/Users/ishichao/test.txt");
//        ObjectOutputStream oot = new ObjectOutputStream(out);
//        oot.writeObject(demo1);
//        oot.close();
//        out.close();
//        ObjectInputStream oi = new ObjectInputStream(new FileInputStream("/Users/ishichao/test.txt"));
//        SingletonDemo1 demo11 = (SingletonDemo1) oi.readObject();
//        System.out.println(demo1 == demo11);//false

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ObjectOutputStream oot = new ObjectOutputStream(out);
        oot.writeObject(demo1);
        oot.close();
        out.close();
        ByteArrayInputStream bis = new ByteArrayInputStream(out.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        SingletonDemo1 demo11 = (SingletonDemo1) ois.readObject();
        System.out.println(demo1 == demo11);//false

        //解决反射问题(通过报错，禁止获取新对象)
//        Class<SingletonDemo6> demo6Class = (Class<SingletonDemo6>) Class.forName("com.shi.creation.singleton.SingletonDemo6");
//        Constructor<SingletonDemo6> demo6Constructor = demo6Class.getDeclaredConstructor();
//        demo6Constructor.setAccessible(true);
//        SingletonDemo6 demo6 = demo6Constructor.newInstance();
//        SingletonDemo6 demo7 = demo6Constructor.newInstance();
//        System.out.println(demo6 == demo7);


        // 解决序列化问题
        SingletonDemo6 s6 = SingletonDemo6.getInstance();
        FileOutputStream out1 = new FileOutputStream("/Users/ishichao/test.txt");
        ObjectOutputStream oot1 = new ObjectOutputStream(out1);
        oot1.writeObject(s6);
        oot1.close();
        out1.close();
        ObjectInputStream oi1 = new ObjectInputStream(new FileInputStream("/Users/ishichao/test.txt"));
        SingletonDemo6 demo61 = (SingletonDemo6) oi1.readObject();
        System.out.println(s6 == demo61);//true

    }

    private long getRuntime() {
        // 线程数
        int threadNum = 10;
        // 计数器
        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);
        final CountDownLatch countDownLatchStart = new CountDownLatch(1);
        for (int i = 0; i < threadNum; i++) {
            new Thread(() -> {
                try {
                    countDownLatchStart.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int j = 0; j < 100000; j++) {
//                    Object o = SingletonDemo1.getInstance();//20957816
//                    Object o = SingletonDemo2.getInstance();//79600416
//                    Object o = SingletonDemo3.getInstance();//17119569
//                    Object o = SingletonDemo4.getInstance();//16511761
//                    Object o = SingletonDemo5.INSTANCE;     //8685400
                }
                countDownLatch.countDown();
            }).start();
        }
        long startTime = System.nanoTime();
        countDownLatchStart.countDown();
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

}
