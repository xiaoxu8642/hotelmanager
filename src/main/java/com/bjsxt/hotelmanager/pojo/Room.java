package com.bjsxt.hotelmanager.pojo;

import lombok.Data;

import javax.persistence.*;

/**
 * @author xu
 * @DATE 2019 -09-12-10:13
 **/
@Data
@Entity(name = "t_room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer rid;
    @Column
    private Integer type;
    @Column
    private Double price;
    @Column
    private String info;
    @ManyToOne
    @JoinColumn(name ="hid" )
    private Hotel hotel;

}
