package cn.itcast.web.request;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/* * 处理登录请求的Servlet
 *
 * Servlet是sun公司制定的标准。Tomcat(web应用服务器、Servlet容器)实现了这些标准。
 *
 * HttpServlet*/

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    /*
     *
     * 常用的方法：doGet doPost service
     *
     * 第一种方法  重写
     *  doGet:处理客户端的get方式的请求
     *  doPost:处理客户端的post方式的请求
     *
     *  第二种方法  重写
     *  service：根据具体的请求方法去调用对应的doGet、doPost方法
     *
     */


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

}