package cn.itcast.web.servletContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/contextDemo5")
public class contextDemo5 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /*
        ServletContext功能
            1.获取MIME类型
               *MIME类型：在互联网通信中定义的一种文件数据类型
                    *格式  ：大类型/小类型   text/html      image/jpeg

            获取：String getMimeType(String file)
            2.域对象：共享数据
            3.获取文件真实（服务器）路径

         */

        ServletContext sc = this.getServletContext();

        String b = sc.getRealPath("./b.txt");//web目录下
        System.out.println(b);

        String c = sc.getRealPath("/WEB-INF/c.txt");//web-inf目录下
        System.out.println(c);

        String a = sc.getRealPath("/WEB-INF/classes/a.txt");//src目录下
        System.out.println(a);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
