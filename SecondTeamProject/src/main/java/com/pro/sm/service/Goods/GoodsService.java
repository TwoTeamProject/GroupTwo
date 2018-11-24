package com.pro.sm.service.Goods;

import java.util.List;
import java.util.Map;

/**
 * className:GoodsService
 * discription:
 * author:Ryb
 * createTime:2018-11-23 16:53
 */
public interface GoodsService {

    /**
     * 物品信息查询
     * @return
     */
    List<Map> getList();

    /**
     * 商品添加
     * @param map
     * @return
     */
    int add(Map map);

    /**
     * 根据id删除goods
     * @param id
     * @return
     */
    int delete(Integer id);

    /**
     * 根据GOODS_ID修改商品信息
     * @param map
     * @return
     */
    int update(Map map);
}
