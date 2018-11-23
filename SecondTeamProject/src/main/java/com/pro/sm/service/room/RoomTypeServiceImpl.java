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
    public List<Map> selectRoom(Map map) {
        int pageNo = map.get("pageNo") == null ? 1 : Integer.valueOf(map.get("pageNo") + "");
        int pageSize = map.get("pageSize") == null ? 10 : Integer.valueOf(map.get("pageSize") + "");
        //计算分页的开始值和结束值
        map.put("start",(pageNo-1)*pageSize);
        map.put("end",pageNo*pageSize+1);
        return roomTypeDao.selectRoom(map);
    }

    /**
     * 总数量
     * @param map
     * @return
     */
    @Override
    public int getPageCount(Map map) {
        return roomTypeDao.getPageCount(map);
    }

    /**
     * 添加房间
     * @param map
     * @return
     */
    @Override
    public int insertRoom(Map map){
        return roomTypeDao.insertRoom(map);
    }
}
