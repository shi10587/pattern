package com.shi.creation.prototype;

import lombok.Getter;
import lombok.Setter;

import java.io.*;
import java.util.Date;

/**
 * serializable深克隆,引用对象也需实现Serializable接口
 *
 * @author shichao
 * @date 2018/1/10 上午10:14
 */
public class User3 implements Serializable {

    public User3(String username, Date birthday) {
        this.username = username;
        this.birthday = birthday;
    }

    /**
     * 用户名
     */
    @Setter
    @Getter
    private String username;
    /**
     * 生日
     */
    @Setter
    @Getter
    private Date birthday;

    public Object deepClone() throws Exception {
        //将对象写入流中
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        //将对象从流中取出
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }

    @Override
    public String toString() {
        return "User3{" +
                "username='" + username + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
