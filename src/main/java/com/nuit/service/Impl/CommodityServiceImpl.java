package com.nuit.service.Impl;

import com.nuit.dao.CommodityDao;
import com.nuit.domain.Commodity;
import com.nuit.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommodityServiceImpl implements CommodityService {

    @Autowired
    private CommodityDao commodityDao;
    @Override
    public Commodity findCommodity(int id) {
        return commodityDao.findCommodity(id);
    }

    @Override
    public List<Commodity> findAll() {
        return commodityDao.findAll();
    }

    @Override
    public void addCommodity(Commodity commodity) {
        System.out.println("添加的商品类实体数据"+commodity);
        commodityDao.addCommodity(commodity);
        System.out.println("添加成功--service");
    }

    @Override
    public void updateCommodity(Commodity commodity) {
        System.out.println("该商品修改前的数据"+findCommodity(commodity.getId()));
        System.out.println("修改的数据"+commodity);
        commodityDao.updateCommodity(commodity);
        System.out.println("修改成功--service");
    }

    @Override
    public void deleteCommodity(int id) {
        System.out.println("要删除的商品信息："+commodityDao.findCommodity(id));
        commodityDao.deleteCommodityById(id);
        System.out.println("删除成功--service");
    }
}
