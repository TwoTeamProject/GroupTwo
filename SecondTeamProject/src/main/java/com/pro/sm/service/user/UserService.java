package com.pro.sm.service.user;

import java.util.List;
import java.util.Map;

public interface UserService {
    /**
     * 获取用户
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
