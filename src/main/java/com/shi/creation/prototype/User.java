package com.shi.creation.prototype;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * clone浅克隆
 *
 * @author shichao
 * @date 2018/1/10 上午10:14
 */
public class User implements Cloneable {

    public User(String username, Date birthday) {
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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
