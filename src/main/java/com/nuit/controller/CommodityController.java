package com.nuit.controller;

import com.nuit.domain.Commodity;
import com.nuit.service.CommodityService;
import com.nuit.service.Impl.CommodityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * TODO关于商品数据的Controller类
 */
@RestController
@RequestMapping("/commodity")
public class CommodityController {
    @Autowired
    private CommodityServiceImpl commodityService;

    /**
     * 查找单一商品
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Commodity findById(@PathVariable Integer id){
        System.out.println("成功");
        return commodityService.findCommodity(id);
    }

    /**
     * 查找所有商品
     * @return
     */
    @GetMapping
    public List<Commodity> findAll(){
        return commodityService.findAll();
    }

    /**
     * 通过前端传入的Commodity的json数据，添加商品
     * @param commodity
     */
    @PostMapping
    public void addCommodity(@RequestBody Commodity commodity){
        System.out.println("运行中");
        commodityService.addCommodity(commodity);
        System.out.println("添加成功--Controller");
    }

    /**
     * 通过前端传入的Commodity的json数据，完全修改商品
     * @param commodity
     */
    @PutMapping
    public void updateCommodity(@RequestBody Commodity commodity){
        commodityService.updateCommodity(commodity);
        System.out.println("修改成功--Controller");
    }

    /**
     * 通过前端传来的id，直接删除商品
     * @param id
     */
    @DeleteMapping("/{id}")
    public void deleteCommodity(@PathVariable Integer id){
        commodityService.deleteCommodity(id);
        System.out.println("删除成功--Controller");
    }
}
