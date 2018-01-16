package com.shi.creation.prototype;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * clone方式深克隆
 *
 * @author shichao
 * @date 2018/1/10 上午10:14
 */
public class User2 implements Cloneable {

    public User2(String username, Date birthday) {
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
        User2 u = (User2) super.clone();
        u.birthday = (Date) this.birthday.clone();
        return u;
    }

    @Override
    public String toString() {
        return "User2{" +
                "username='" + username + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
