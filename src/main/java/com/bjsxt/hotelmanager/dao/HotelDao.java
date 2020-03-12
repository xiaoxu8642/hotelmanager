package com.bjsxt.hotelmanager.dao;

import com.bjsxt.hotelmanager.pojo.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author xu
 * @DATE 2019 -09-12-10:41
 **/
public interface HotelDao  extends JpaRepository<Hotel,Integer>{
    /**
     * 查询全部酒店信息
     * @return
     */

    /**
     * 添加
     * 先查询酒店
     * 然后添加hotelDto的属性
     */


    //删除

}
