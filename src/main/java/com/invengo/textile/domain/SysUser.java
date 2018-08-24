package com.invengo.textile.domain;

/**
 * Created By IntelliJ IDEA
 * User:Administrator
 * Date:2018/08/24
 * Time:15:42
 */
public class SysUser {
    private String user_id;
    private String user_name;

    public SysUser() {
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
}
