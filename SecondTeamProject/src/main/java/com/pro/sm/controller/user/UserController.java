package com.pro.sm.controller.user;

import com.pro.sm.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * className:UserController
 * discriptoin:
 * author:张晓峰
 * createTime:2018-11-23 09:28
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/list")
    @ResponseBody
    public Object getUserList(@RequestParam Map map){
        Map tempMap = new HashMap();
        tempMap.put("code",0);
        tempMap.put("msg","");
        tempMap.put("data",userService.getUserList(map));

        List<Map> user = userService.getUserList(map);
        System.out.println(user);
        return tempMap;
    }
    @RequestMapping("/toList")
    public String toList(Map map){

        return "user";
    }

    /**
     * 用户添加
     * @param map
     * @return
     */
    @ResponseBody
    @RequestMapping("/add")
    public Object userAdd(@RequestParam Map map){
        System.out.println(map);
        int result = userService.userAdd(map);
        Map tempMap = new HashMap();
        if (result==-1){
            tempMap.put("issuc",false);
        }else{
            tempMap.put("issuc",true);
        }
        return tempMap;
    }



}
