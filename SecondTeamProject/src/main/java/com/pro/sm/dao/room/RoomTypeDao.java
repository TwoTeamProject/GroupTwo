package com.pro.sm.dao.room;

import com.pro.sm.entity.Entity;

import java.util.List;
import java.util.Map;

/**
 * className:RoomTypeDao
 * discription:
 * author:sjq
 * createTime:2018-11-23 08:47
 */
public interface RoomTypeDao {

    /**
     * 查询房型
     * @param
     * @return
     */
    List<Map> selectRoomType();

    /**
     * 主页
     * @return
     */
    List<Map> selectRoom();
}
