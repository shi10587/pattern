package com.shi.creation.prototype;

import java.util.Date;

/**
 * prototype模型测试
 *
 * @author shichao
 * @date 2018/1/10 上午10:17
 */
public class UserTest {

    public static void main(String[] args) throws Exception {
        testUser();
        testUser2();
        testUser3();
        testEfficiency();
    }

    protected static void testUser() throws CloneNotSupportedException {
        System.out.println("==================cloneable浅克隆start====================");
        Date date = new Date(1122334412);
        User u = new User("liming", date);
        User user = (User) u.clone();
        System.out.println(String.format("对象内存对比：%s", u == user));//false
        System.out.println(String.format("修改前   u：%s", u));
        System.out.println(String.format("修改前user：%s", user));
        date.setTime(444444444);
        System.out.println(String.format("对象birthday内存对比：%s", u.getBirthday() == user.getBirthday()));//true
        System.out.println(String.format("修改后   u：%s", u));
        System.out.println(String.format("修改后user：%s", user));
        System.out.println("==================cloneable浅克隆end======================");
        System.out.println();
    }

    protected static void testUser2() throws CloneNotSupportedException {
        System.out.println("==================cloneable深克隆start====================");
        Date date = new Date(1122334412);
        User2 u = new User2("liming", date);
        User2 user = (User2) u.clone();
        System.out.println(String.format("对象内存对比：%s", u == user));//false
        System.out.println(String.format("修改前   u：%s", u));
        System.out.println(String.format("修改前user：%s", user));
        date.setTime(444444444);
        System.out.println(String.format("对象birthday内存对比：%s", u.getBirthday() == user.getBirthday()));//false
        System.out.println(String.format("修改后   u：%s", u));
        System.out.println(String.format("修改后user：%s", user));
        System.out.println("==================cloneable深克隆end======================");
        System.out.println();
    }

    protected static void testUser3() throws Exception {
        System.out.println("==================serializable深克隆start====================");
        Date date = new Date(1122334412);
        User3 u = new User3("liming", date);
        User3 user = (User3) u.deepClone();
        System.out.println(String.format("对象内存对比：%s", u == user));//false
        System.out.println(String.format("修改前   u：%s", u));
        System.out.println(String.format("修改前user：%s", user));
        date.setTime(444444444);
        System.out.println(String.format("对象birthday内存对比：%s", u.getBirthday() == user.getBirthday()));//false
        System.out.println(String.format("修改后   u：%s", u));
        System.out.println(String.format("修改后user：%s", user));
        System.out.println("==================serializable深克隆end======================");
        System.out.println();
    }

    /**
     * 测试对象创建效率
     *
     * @throws Exception
     */
    protected static void testEfficiency() throws Exception {
        testNewEfficiency();//21034227
        testCloneEfficiency();//7601769
        testSerializableEfficiency();//1343759846
    }

    /**
     * 测试new创建对象
     *
     * @return
     * @throws Exception
     */
    private static void testNewEfficiency() throws Exception {
        long startTime = System.nanoTime();
        User user = new User("test", new Date());
        for (int i = 0; i < 100000; i++) {
            User u = new User(String.valueOf(i), new Date());
        }
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
    }

    /**
     * 测试clone创建对象
     *
     * @return
     * @throws Exception
     */
    private static void testCloneEfficiency() throws Exception {
        long startTime = System.nanoTime();
        User user = new User("test", new Date());
        for (int i = 0; i < 100000; i++) {
            User u = (User) user.clone();
        }
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
    }

    /**
     * 测试serializable创建对象
     *
     * @return
     * @throws Exception
     */
    private static void testSerializableEfficiency() throws Exception {
        long startTime = System.nanoTime();
        User3 user = new User3("test", new Date());
        for (int i = 0; i < 100000; i++) {
            User3 u = (User3) user.deepClone();
        }
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
    }

}
