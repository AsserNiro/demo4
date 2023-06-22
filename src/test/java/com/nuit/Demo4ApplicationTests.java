package com.nuit;

import com.nuit.dao.CommodityDao;
import com.nuit.service.CommodityService;
import com.nuit.service.Impl.CommodityServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

class Demo4ApplicationTests {

    @Autowired
    private CommodityDao commodityDao;
    @Test
    void contextLoads() {
        CommodityService commodityService = new CommodityServiceImpl();
        System.out.println(commodityService.findCommodity(1));
//        commodityDao.selectCommodity(1)
    }

}
