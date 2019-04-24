package com.shylock.service.impl;

import com.shylock.mapper.AirportMapper;
import com.shylock.pojo.Airport;
import com.shylock.service.AirportService;
import com.shylock.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @Author: yk
 * @Date: 2019/4/16 11:39
 */
public class AirportServiceImpl implements AirportService {


    @Override
    public List<Airport> showTakePort() {

        SqlSession sqlSession = MyBatisUtil.getSession();

        AirportMapper airportMapper = sqlSession.getMapper(AirportMapper.class);

        return airportMapper.selTakePort();
    }

    @Override
    public List<Airport> showLandPort() {
        SqlSession sqlSession = MyBatisUtil.getSession();

        AirportMapper airportMapper = sqlSession.getMapper(AirportMapper.class);

        return airportMapper.selLandPort();
    }
}
