package com.shylock.mapper;

import com.shylock.pojo.Airport;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: yk
 * @Date: 2019/4/16 11:36
 */
public interface AirportMapper {

    /**
     * 查询起飞机场
     * @return
     */
    @Select("select * from airport where id in (select distinct takeid from airplane)")
    List<Airport> selTakePort();

    /**
     * 查询降落机场
     * @return
     */
    @Select("select * from airport where id in (select distinct landid from airplane)")
    List<Airport> selLandPort();
}
