package com.pro.sm.service.room;

import com.pro.sm.entity.Entity;

import java.util.List;
import java.util.Map;

/**
 * className:RoomTypeService
 * discription:
 * author:sjq
 * createTime:2018-11-23 08:53
 */
public interface RoomTypeService {

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
