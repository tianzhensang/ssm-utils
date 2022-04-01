package com.hou.pojo;

import lombok.Data;

@Data
public class User {
    private String user_id;
    private String user_name;
    private String user_pass;
    private String user_nickname;
    private String user_email;
    private String user_url;
    private String user_avatar;
    private String user_last_login_ip;
    private String user_register_time;
    private String user_last_login_time;
    private String user_status;
    private String user_role;

    @Override
    public String toString() {
        return "User{" +
                "user_id='" + user_id + '\'' +
                ", user_name='" + user_name + '\'' +
                ", user_pass='" + user_pass + '\'' +
                ", user_nickname='" + user_nickname + '\'' +
                ", user_email='" + user_email + '\'' +
                ", user_url='" + user_url + '\'' +
                ", user_avatar='" + user_avatar + '\'' +
                ", user_last_login_ip='" + user_last_login_ip + '\'' +
                ", user_register_time='" + user_register_time + '\'' +
                ", user_last_login_time='" + user_last_login_time + '\'' +
                ", user_status='" + user_status + '\'' +
                ", user_role='" + user_role + '\'' +
                '}';
    }
}
