package cn.itcast.web.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/s_demo2")
public class ServletDemo2 extends GenericServlet {

    @Override
    //默认将Servlet中其他的方法做了默认空实现，只将Servlet()方法作为抽象
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("GenericServlet");
    }


    //其他方法可以通过复写来调用
    //\\\
    public void init() throws ServletException {

    }

}
