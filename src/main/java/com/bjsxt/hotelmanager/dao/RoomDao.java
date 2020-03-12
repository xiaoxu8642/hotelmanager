package com.bjsxt.hotelmanager.dao;

import com.bjsxt.hotelmanager.pojo.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author xu
 * @DATE 2019 -09-12-10:41
 **/
public interface RoomDao extends JpaRepository<Room,Integer>,
        JpaSpecificationExecutor<Room>{



}
