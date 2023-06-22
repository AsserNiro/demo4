package com.nuit.service;

import com.nuit.dao.CommodityDao;
import com.nuit.domain.Commodity;

import java.util.List;

/**
 * TODO--有关对商品数据进行操作的service层
 */
public interface CommodityService {
    /**
     * 通过id查找商品
     * @param id
     * @return
     */
    public Commodity findCommodity(int id);

    /**
     * 直接查找全部商品信息
     * @return
     */
    public List<Commodity> findAll();

    /**
     * 添加商品
     * @param commodity
     */
    public void addCommodity(Commodity commodity);

    /**
     * 通过传入Commodity实体，对对应的商品数据进行彻底的修改
     * @param commodity
     */
    public void updateCommodity(Commodity commodity);

    /**
     * 通过商品的id，将对应的商品直接删除
     * @param id
     */
    public void deleteCommodity(int id);
}
