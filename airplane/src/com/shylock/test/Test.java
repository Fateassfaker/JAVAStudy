package com.shylock.test;

import com.shylock.mapper.AirplaneMapper;
import com.shylock.pojo.Airplane;
import com.shylock.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @Author: yk
 * @Date: 2019/4/16 14:06
 */
public class Test {

    public static void main(String[] args) {

        SqlSession sqlSession = MyBatisUtil.getSession();

        AirplaneMapper airplaneMapper = sqlSession.getMapper(AirplaneMapper.class);

        List<Airplane> airplanes = airplaneMapper.selByTakeIdLandId(1, 0);

        System.out.println(airplanes);
    }
}
