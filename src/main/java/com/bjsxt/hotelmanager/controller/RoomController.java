package com.bjsxt.hotelmanager.controller;

import com.bjsxt.hotelmanager.pojo.Room;
import com.bjsxt.hotelmanager.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author xu
 * @DATE 2019 -09-12-16:15
 **/
@Controller
public class RoomController {
    @Autowired
    private RoomService roomService;
    @RequestMapping("/rooms")
    public String findAllRomms(String name,Model model){
        List<Room> list = roomService.findallRooms(name);
        model.addAttribute("list",list);
        model.addAttribute("name",name);
        return "show";
    }
    @RequestMapping("/add")
    public String saveRooms(Room room){
            roomService.addrooms(room);
        return "redirect:rooms";
    }

    @RequestMapping("/delete")
    public String deleteRooms(Integer rid){
        roomService.deleteRooms(rid);
        return "redirect:rooms";
    }
}
