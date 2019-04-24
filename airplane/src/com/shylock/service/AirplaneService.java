package com.shylock.service;

import com.shylock.pojo.Airplane;

import java.util.List;

/**
 * @Author: yk
 * @Date: 2019/4/16 14:16
 */
public interface AirplaneService {
    List<Airplane> showPlane(int takeId, int landId);
}
