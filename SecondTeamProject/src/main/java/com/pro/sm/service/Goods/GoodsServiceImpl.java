package com.pro.sm.service.Goods;

import com.pro.sm.dao.Goods.GoodsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * className:GoodsServiceImpl
 * discription:
 * author:Ryb
 * createTime:2018-11-23 16:55
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsDao goodsDao;

    @Override
    public List<Map> getList() {
        return goodsDao.getList();
    }

    @Override
    public int add(Map map) {
        return goodsDao.add(map);
    }

    @Override
    public int delete(Integer id) {
        return goodsDao.delete(id);
    }

    @Override
    public int update(Map map) {
        return goodsDao.update(map);
    }
}
