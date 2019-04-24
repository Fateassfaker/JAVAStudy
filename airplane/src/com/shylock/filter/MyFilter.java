package com.shylock.filter;

import com.shylock.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @Author: yk
 * @Date: 2019/4/14 16:09
 */
@WebFilter(filterName = "MyFilter", urlPatterns = "/*")
public class MyFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        SqlSession session = MyBatisUtil.getSession();
        try {
            chain.doFilter(req, resp);
            session.commit();
        } catch (IOException | ServletException e) {
            session.rollback();
            e.printStackTrace();
        } finally {
            MyBatisUtil.closeSession();
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
