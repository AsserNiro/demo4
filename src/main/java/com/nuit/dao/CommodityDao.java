package com.nuit.dao;

import com.nuit.domain.Commodity;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * TODO--商品的数据库的直接增删改查
 */
@Mapper
public interface CommodityDao {
    /**
     * 通过商品的id查找商品
     * @param id
     * @return
     */
    @Select("select * from commodity where id = #{id}")
    public Commodity findCommodity(int id);

    /**
     * 插入语句，增添新商品
     * @param commodity
     */
    @Insert("insert into commodity(name, price, img, introduction) values (#{name},#{price},#{img},#{introduction})")
    public void addCommodity(Commodity commodity);

    /**
     * 通过商品id的查找，更改当前商品的所有数据
     * @param commodity
     */
    @Update("update commodity set name=#{name},price=#{price},img=#{img},introduction=#{introduction} where id=#{id}")
    public void updateCommodity(Commodity commodity);

    /**
     * 通过商品的id，删除当前商品
     * @param id
     */
    @Delete("delete  from commodity where id=#{id}")
    public void deleteCommodityById(int id);

    /**
     * 查找全部商品
     * @return
     */
    @Select("select * from commodity")
    public List<Commodity> findAll();
}
