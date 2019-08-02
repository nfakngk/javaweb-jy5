package com.itdr.requsetresponse;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/qqq")
public class Requse extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //设置初始化值
      String name="wzm";
      String pasword="qwe";
      //获取前端数据参数值
        String zh = request.getParameter("zh");
        String password = request.getParameter("password");
        //比对数据
        //if (zh.)
        System.out.println(zh);
        System.out.println(password);
        response.getWriter().write("aaaaa");




    }
}
