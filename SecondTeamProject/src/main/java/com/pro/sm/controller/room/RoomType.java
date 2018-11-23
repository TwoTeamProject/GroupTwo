package com.pro.sm.controller.room;

import com.pro.sm.entity.Entity;
import com.pro.sm.service.room.RoomTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.pro.sm.util.pageUtil;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
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
     * 房型跳转
     * @return
     */
    @RequestMapping("/toType")
    public String toType(){
        return "room-type";
    }

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
     * 主页跳转
     * @return
     */
    @RequestMapping("/toRoom")
    public String toRoom(){
        return "room";
    }

    /**
     * 主页
     * @return
     */
    @ResponseBody
    @RequestMapping("allRoom")
    public Object room(@RequestParam Map map, Model model, HttpServletRequest request){
        Map m = new HashMap();
        map.put("pageSize",20);
        int pageNo = map.get("pageNo") == null ? 1 : Integer.valueOf(map.get("pageNo") + "");
        String stringPage = new pageUtil(pageNo,5,roomTypeService.getPageCount(map),request).getStringPage();
        /*model.addAttribute("stringPage",stringPage);*/
        m.put("stringPage",stringPage);
        m.put("list",roomTypeService.selectRoom(map));
        //System.out.println(m);
        return roomTypeService.selectRoom(map);
    }

        /**
         * 新增房间跳转
         * @return
         */
        @RequestMapping("/toAddroom")
        public String toAddroom(){
            return "room-add";
        }

        /**
         * 新增房间
         * @return
         */
        @ResponseBody
        @RequestMapping("/addroom")
        public int addroom(@RequestParam Map map){
            Object room_code = map.get("room_code");
            System.out.println(room_code);
            return roomTypeService.insertRoom(map);
        }

}
