package cn.itcast.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/requestDemo8")
public class RequestDemo8 extends HttpServlet {
/*
    @Override
    public void init() throws ServletException {

        System.out.println("初始化");
    }*/

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("request8888被访问了。。。。。。。。");

        //跳转
        /*
        转发：forward
            1.地址栏路径不变
            2.只能访问当前服务器下的资源
            3.只是一次请求，能够使用request对象共享数据
         */
        req.setAttribute("msg","image");

        req.getRequestDispatcher("/requestDemo9").forward(req,resp);

        //System.out.println(1111);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*System.out.println("request8888被访问了。。。。。。。。");

        req.getRequestDispatcher("/requestDemo9").forward(req,resp);*/
        this.doPost(req,resp);
    }
}
