package cn.itcast.web.request;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 演示Request对象请求行数据
 */

@WebServlet("/requestDemo1")
public class RequestDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        /**
         *      1.获取请求方法GET:
         *          * String getMethod()
         *      2.获取虚拟目录：/servlet
         *          * String getContextPath()
         *      3.获取Servlet路径：/s_demo1
         *          * String getServletPath()
         *      4.获取get方式请求参数：name = zhangsan
         *          * String getQueryString()
         *      5.（*）获取请求URI：/servlet/s_demo1
         *          * String getRequestURI()         统一资源标识符
         *          * StringBuffer getRequestURL()   统一资源定位符
         *      6.获取协议及版本：HTTP/1.1
         *          * String getProtocol()
         *      7.获取客户机的IP地址：
         *          * String getRemoteAddr()
         *
         */
        //1.获取请求方法GET:
        //       * String getMethod()
        String Method = request.getMethod();
        System.out.println(Method);

        //（*）2.获取虚拟目录：/servlet
        String Context = request.getContextPath();
        System.out.println(Context);

        //3.获取Servlet路径：/requestDemo1
        String Servlet = request.getServletPath();
        System.out.println(Servlet);

        //4.获取get方式请求参数：name=zhangsan
        String Query = request.getQueryString();
        System.out.println(Query);

        //5.（*）获取请求URI：/servlet/requestDemo1
        String URI = request.getRequestURI();
        System.out.println(URI);   //   /servlet/requestDemo1
        StringBuffer URL = request.getRequestURL();
        System.out.println(URL);   //   http://localhost/servlet/requestDemo1

        //6.获取协议及版本：HTTP/1.1
        String Protocol = request.getProtocol();
        System.out.println(Protocol);

        //7.获取客户机的IP地址：
        String RemoteAddr = request.getRemoteAddr();
        System.out.println(RemoteAddr);

    }
}
