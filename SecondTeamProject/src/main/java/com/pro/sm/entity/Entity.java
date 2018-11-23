package com.pro.sm.entity;

/**
 * className:Entity
 * discription:
 * author:sjq
 * createTime:2018-11-23 11:07
 */
public class Entity {

    private Integer room_typeid;
    private String room_typename;
    private Integer room_typerice;
    private String room_info;
    private String room_img;
    private Integer room_deposit;

    public Integer getRoom_typeid() {
        return room_typeid;
    }

    public void setRoom_typeid(Integer room_typeid) {
        this.room_typeid = room_typeid;
    }

    public String getRoom_typename() {
        return room_typename;
    }

    public void setRoom_typename(String room_typename) {
        this.room_typename = room_typename;
    }

    public Integer getRoom_typerice() {
        return room_typerice;
    }

    public void setRoom_typerice(Integer room_typerice) {
        this.room_typerice = room_typerice;
    }

    public String getRoom_info() {
        return room_info;
    }

    public void setRoom_info(String room_info) {
        this.room_info = room_info;
    }

    public String getRoom_img() {
        return room_img;
    }

    public void setRoom_img(String room_img) {
        this.room_img = room_img;
    }

    public Integer getRoom_deposit() {
        return room_deposit;
    }

    public void setRoom_deposit(Integer room_deposit) {
        this.room_deposit = room_deposit;
    }
}
