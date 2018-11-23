package com.pro.sm.controller.room;

import com.pro.sm.entity.Entity;
import com.pro.sm.service.room.RoomTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * className:RoomTypeDao
 * discription:
 * author:sjq
 * createTime:2018-11-22 21:48
 */
@RequestMapping("room")
@Controller
public class RoomType {

    @Autowired
    private RoomTypeService roomTypeService;

    /**
     * 查询房型
     * @return
     */
    @ResponseBody
    @RequestMapping("/type")
    public Object roomType(){
        List<Map> list = roomTypeService.selectRoomType();
        System.out.println(list);
        return roomTypeService.selectRoomType();
    }

    /**
     * 主页
     * @return
     */
    @ResponseBody
    @RequestMapping("allRoom")
    public Object room(){
        return roomTypeService.selectRoom();
    }

    @RequestMapping("/toType")
    public String toType(){
        return "room-type";
    }

    @RequestMapping("/toRoom")
    public String toRoom(){
        return "room";
    }
}
