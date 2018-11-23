package com.pro.sm.service.room;

import com.pro.sm.dao.room.RoomTypeDao;
import com.pro.sm.entity.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * className:RoomTypeServiceImpl
 * discription:
 * author:sjq
 * createTime:2018-11-23 08:54
 */
@Service
public class RoomTypeServiceImpl implements RoomTypeService {

    @Autowired
    private RoomTypeDao roomTypeDao;

    /**
     * 查询房型
     * @param
     * @return
     */
    @Override
    public List<Map> selectRoomType() {
        return roomTypeDao.selectRoomType();
    }

    /**
     * 主页
     * @param
     * @return
     */
    @Override
    public List<Map> selectRoom() {
        return roomTypeDao.selectRoom();
    }
}
