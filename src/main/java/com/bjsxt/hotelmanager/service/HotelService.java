package com.bjsxt.hotelmanager.service;

import com.bjsxt.hotelmanager.pojo.Hotel;
import net.bytebuddy.agent.builder.AgentBuilder;

import java.util.List;

/**
 * @author xu
 * @DATE 2019 -09-12-17:07
 **/
public interface HotelService {
    public List<Hotel> findallHotels();

}
