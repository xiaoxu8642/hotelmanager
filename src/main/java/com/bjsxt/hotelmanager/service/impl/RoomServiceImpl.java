package com.bjsxt.hotelmanager.service.impl;

import com.bjsxt.hotelmanager.dao.RoomDao;
import com.bjsxt.hotelmanager.pojo.Room;
import com.bjsxt.hotelmanager.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xu
 * @DATE 2019 -09-12-10:43
 **/
@Service
@Transactional
public class RoomServiceImpl implements RoomService {
    @Autowired
private RoomDao roomDao;
    @Override
    public List<Room> findallRooms(String name) {
       Specification<Room> spec= new Specification<Room>(){
           List<Predicate> predicates= new ArrayList<Predicate>();
            @Override
            public Predicate toPredicate(Root<Room> root,
                                         CriteriaQuery<?> criteriaQuery,
                                         CriteriaBuilder cb) {
                if (!StringUtils.isEmpty(name)){
                    String param="%"+name+"%";
                    predicates.add(cb.like(root.get("hotel").get("name"),param));
                }
                return cb.and(predicates.toArray(new Predicate[] {}));
            }
        };
        return  roomDao.findAll(spec);
    }

    @Override
    public void addrooms(Room room) {
        roomDao.save(room);
    }

    @Override
    public void deleteRooms(Integer rid) {
        roomDao.deleteById(rid);
    }
}
