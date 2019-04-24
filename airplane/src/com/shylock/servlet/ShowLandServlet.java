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
 * @Date: 2019/4/16 13:33
 */
@WebServlet(name = "ShowLandServlet", urlPatterns = "/showland")
public class ShowLandServlet extends HttpServlet {

    private AirportService airportService = new AirportServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("landPortList", airportService.showLandPort());
        request.getRequestDispatcher("/showairplane").forward(request, response);
    }
}
