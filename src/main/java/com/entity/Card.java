package com.entity;

public class Card {

    private int uid;
    private String cname;

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Card() {
    }

    public Card(int uid, String cname) {
        this.uid = uid;
        this.cname = cname;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Card{" +
                "uid=" + uid +
                ", cname='" + cname + '\'' +
                '}';
    }
}
