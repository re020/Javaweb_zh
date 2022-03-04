package cn.itcast.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/requestDemo")
public class RequestDemo extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("asasdfasdf");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    //            //获取请求体的字节数，GET请求没有请求体，没有请求体返回-1；
    //            int getContentLength()
    //
    //    /*
    //        获取请求类型，如果请求是GET，那么这个方法返回null；如果是POST请求，那么默认
    //        为application/x-www-form-urlencoded，表示请求体内容使用了URL编码；
    //    */
    //            String getContentType()
    //
    //    //返回请求方法，例如：GET/POST
    //            String getMethod()
    //
    //    //返回当前客户端浏览器的Locale。java.util.Locale表示国家和言语，这个东西在国际化中很有用；
    //            Locale getLocale();
    //
    //    /*
    //        获取请求编码，如果没有setCharacterEncoding()，那么返回null，表示使用
    //        ISO-8859-1编码；
    //    */
    //            String getCharacterEncoding();
    //
    //    /*
    //        设置请求编码，只对请求体有效！注意，对于GET而言，没有请求体！！！所以此方法
    //        只能对POST请求中的参数有效！
    //    */
    //            void setCharacterEncoding(String code)(
    //
    //    //返回上下文路径，例如：/Dmoe1
    //            String getContextPath()
    //
    //    //返回请求URL中的参数，例如：username=zhangSan
    //            String getQueryString()
    //
    //    //返回请求URI路径，例如：/Demo1/ServletDemo1
    //            String getRequestURI()
    //
    //    /*
    //        返回请求URL路径，例如：http://localhost/Demo1/ServletDemo1即返回除了参数
    //        以外的路径信息；
    //    */
    //            StringBuffer getRequestURL()
    //
    //    //返回Servlet路径，例如：/ServletDemo1
    //            String getServletPath()
    //
    //    //返回当前客户端的IP地址
    //            String getRemoteAddr()
    //
    //    //返回当前客户端的主机名，但这个方法的实现还是获取IP地址
    //            String getRemoteHost()
    //
    //    //返回请求协议，例如：http
    //            String getScheme()
    //
    //    //返回主机名，例如：localhost
    //            String getServerName()
    //
    //    //返回服务器端口号，例如：8080
    //            int getServerPort()
    }
}
