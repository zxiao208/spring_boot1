package com.zhaoxiao.spring_boot1.entity;

import java.io.Serializable;

/**
 * @author zhaoxiao
 */
public class User implements Serializable {
    private long id;
    private String userName;
    private String passWord;
    private String userToken;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }
}
