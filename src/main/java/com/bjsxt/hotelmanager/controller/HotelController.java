package com.bjsxt.hotelmanager.controller;

import com.bjsxt.hotelmanager.pojo.Hotel;
import com.bjsxt.hotelmanager.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author xu
 * @DATE 2019 -09-12-17:10
 **/
@Controller
public class HotelController {
    @Autowired
    private HotelService hotelService;
    @RequestMapping("/room")
    public  String findAllHotels(Model model){
        List<Hotel> hotellist = hotelService.findallHotels();
        model.addAttribute("hotellist",hotellist);
        return "room";
    }
}
