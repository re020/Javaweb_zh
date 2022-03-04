package cn.itcast.web.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/responseDemo3")
public class ResponseDemo3 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //获取流对象前。设置流的默认编码：ISO-8859-1设置为：GBK
        //resp.setCharacterEncoding("GBK");

        //告诉浏览器，服务器发送的消息数据编码，建议浏览器使用该编码解码
        //resp.setHeader("content-type","text/html;charset=utf-8");

        //简单的形式
        resp.setContentType("text/html;charset=utf-8");

        //获取字符输出流
        PrintWriter pw = resp.getWriter();

        //输出数据
        //pw.write("<h1>hello response</h1>");
        pw.write("你好啊 response");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
