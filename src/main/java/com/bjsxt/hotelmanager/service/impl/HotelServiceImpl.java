package com.bjsxt.hotelmanager.service.impl;

import com.bjsxt.hotelmanager.dao.HotelDao;
import com.bjsxt.hotelmanager.pojo.Hotel;
import com.bjsxt.hotelmanager.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xu
 * @DATE 2019 -09-12-17:09
 **/
@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
    private HotelDao hotelDao;
    @Override
    public List<Hotel> findallHotels() {

        return hotelDao.findAll();
    }
}
