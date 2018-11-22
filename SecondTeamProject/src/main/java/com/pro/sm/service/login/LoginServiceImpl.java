package com.pro.sm.service.login;

import com.pro.sm.dao.LoginDao;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * className:LoginServiceImpl
 * discription:
 * author:sjq
 * createTime:2018-11-22 10:04
 */
@Service
public class LoginServiceImpl implements LoginService{

    /*依赖注入*/
    private LoginDao loginDao;

    @Override
    public List<Map> userLogin(Map map) {
        return loginDao.userLogin(map);
    }
}
