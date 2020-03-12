package com.bjsxt.hotelmanager.pojo;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xu
 * @DATE 2019 -09-12-10:10
 **/

@Entity(name = "t_hotel")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer hid;
    @Column
    private String name;
    @Column
    private String address;
    @Column
    private String mobile;
    @OneToMany(mappedBy = "hotel")
    private List<Room> roomList=new ArrayList<>();

    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }

    public Hotel() {
    }

    public Hotel(String name, String address, String mobile, List<Room> roomList) {
        this.name = name;
        this.address = address;
        this.mobile = mobile;
        this.roomList = roomList;

    }
}
