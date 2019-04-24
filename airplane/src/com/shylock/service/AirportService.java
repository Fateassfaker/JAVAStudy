package com.shylock.service;

import com.shylock.pojo.Airport;

import java.util.List;

/**
 * @Author: yk
 * @Date: 2019/4/16 11:39
 */
public interface AirportService {

    /**
     * 显示所有起飞机场
     * @return
     */
    List<Airport> showTakePort();

    /**
     * 显示所有降落机场
     * @return
     */
    List<Airport> showLandPort();
}
