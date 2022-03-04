package cn.itcast.web.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/*
  重定向：redirect
       1.地址栏路径发生变化
       2.可以访问其他前服务器下的资源
       3.两次请求，不能够使用request对象共享数据

 */

@WebServlet("/responseDemo1")
public class ResponseDemo1 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("demo1.....");

        //访问/responseDemo1会自动跳转到/responseDemo2
       /* //设置状态码
        resp.setStatus(302);
        //设置响应头
        resp.setHeader("location","/servlet/responseDemo2");*/

       req.setAttribute("msg","name");

       //获取动态虚拟目录
        String contextPath = req.getContextPath();

        resp.sendRedirect(contextPath+"/responseDemo2");
        //resp.sendRedirect("https://www.baidu.cn");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
