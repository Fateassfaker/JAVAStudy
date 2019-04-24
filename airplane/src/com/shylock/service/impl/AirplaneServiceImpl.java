package com.shylock.service.impl;

import com.shylock.mapper.AirplaneMapper;
import com.shylock.pojo.Airplane;
import com.shylock.service.AirplaneService;
import com.shylock.util.MyBatisUtil;

import java.util.List;

/**
 * @Author: yk
 * @Date: 2019/4/16 14:17
 */
public class AirplaneServiceImpl implements AirplaneService {
    @Override
    public List<Airplane> showPlane(int takeId, int landId) {
        return MyBatisUtil.getSession().getMapper(AirplaneMapper.class).selByTakeIdLandId(takeId, landId);
    }
}
