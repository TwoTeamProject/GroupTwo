package com.pro.sm.dao.user;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserDao {

    /**
     * 查询用户信息
     * @param map
     * @return
     */
    List<Map> getUserList(Map map);

    /**
     * 用户添加
     * @param map
     * @return
     */
    int userAdd(Map map);
}
