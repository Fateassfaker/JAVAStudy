package com.shylock.servlet;

import com.shylock.service.AirportService;
import com.shylock.service.impl.AirportServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: yk
 * @Date: 2019/4/16 13:14
 */
@WebServlet(name = "ShowTakeServlet", urlPatterns = "/show")
public class ShowTakeServlet extends HttpServlet {


    private AirportService airportService = new AirportServiceImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("takePortList", airportService.showTakePort());
        req.getRequestDispatcher("/showland").forward(req, resp);

    }
}
