package com.bjsxt.hotelmanager.service;

import com.bjsxt.hotelmanager.pojo.Room;

import java.util.List;

/**
 * @author xu
 * @DATE 2019 -09-12-10:43
 **/
public interface RoomService {

    public List<Room> findallRooms(String name);
    public void addrooms(Room room);
    public void deleteRooms(Integer rid);
}
