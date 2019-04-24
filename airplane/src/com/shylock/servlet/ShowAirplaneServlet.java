package com.shylock.servlet;

import com.shylock.pojo.Airplane;
import com.shylock.service.AirplaneService;
import com.shylock.service.impl.AirplaneServiceImpl;
import org.apache.ibatis.annotations.Insert;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Author: yk
 * @Date: 2019/4/16 14:18
 */
@WebServlet(name = "ShowAirplaneServlet", urlPatterns = "/showairplane")
public class ShowAirplaneServlet extends HttpServlet {

    private AirplaneService airplaneService = new AirplaneServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int takeId = 0;
        String takeIdStr = request.getParameter("takeid");
        if (takeIdStr != null && !takeIdStr.equals("")) {
            takeId = Integer.valueOf(takeIdStr);
        }

        int landId = 0;
        String landidStr = request.getParameter("landid");
        if (landidStr != null && !landidStr.equals("")) {
            landId = Integer.valueOf(landidStr);
        }

        List<Airplane> airplanes = airplaneService.showPlane(takeId, landId);

        request.setAttribute("airplaneList", airplanes);

        request.getRequestDispatcher("/index.jsp").forward(request, response);

    }
}
