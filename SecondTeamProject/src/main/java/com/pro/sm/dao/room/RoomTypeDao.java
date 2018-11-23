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
    List<Map> selectRoom(Map map);

    /**
     * 分页总数量
     * @param map
     * @return
     */
    int getPageCount(Map map);

    /**
     * 添加房间
     * @param map
     * @return
     */
    int insertRoom(Map map);
}
