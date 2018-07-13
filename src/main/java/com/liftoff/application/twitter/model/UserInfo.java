package com.liftoff.application.twitter.model;


import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String userName;


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

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String[] getFriendsid() {
        return friendsid;
    }

    public void setFriendsid(String[] friendsid) {
        this.friendsid = friendsid;
    }

    private String userEmail;
    private String[] friendsid;
    private int userId;

    public UserInfo(String userName,int id, String userEmail, String[] friendsid) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.friendsid = friendsid;
        this.userId=id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public UserInfo() {

    }

}
