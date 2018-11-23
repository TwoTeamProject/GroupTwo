package com.pro.sm.service.user;

import com.pro.sm.dao.user.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * className:UserServiceImpl
 * discriptoin:
 * author:张晓峰
 * createTime:2018-11-23 09:25
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
    @Override
    public List<Map> getUserList(Map map) {
       return userDao.getUserList(map);
    }

    @Override
    public int userAdd(Map map) {
        return userDao.userAdd(map);
    }
}
