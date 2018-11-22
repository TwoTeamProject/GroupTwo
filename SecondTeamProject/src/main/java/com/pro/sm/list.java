package com.pro.sm;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * className:list
 * discriptoin:
 * author:张晓峰
 * createTime:2018-11-21 11:09
 */
@RequestMapping("/list")
@Controller
public class list {
    @RequestMapping("/toList")
    public String toList(){
        return "index";
    }

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }
}
