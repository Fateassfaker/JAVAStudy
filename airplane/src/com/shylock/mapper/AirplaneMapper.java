package com.shylock.mapper;

import com.shylock.pojo.Airplane;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: yk
 * @Date: 2019/4/16 13:45
 */
public interface AirplaneMapper {

    /**
     * 根据两个id查询✈飞机航班，可以没有
     * @param takeId
     * @param landId
     * @return
     */
    List<Airplane> selByTakeIdLandId(@Param("takeId") int takeId,@Param("landId") int landId);

}
