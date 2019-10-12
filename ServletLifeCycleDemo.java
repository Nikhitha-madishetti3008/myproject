import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class ServletLifeCycleDemo extends GenericServlet
{
public void init(ServletConfig config)throws ServletException
{
System.out.println("In init() Method");
}
public void service(ServletRequest request,ServletResponse response)throws IOException,ServletException
{
response.setContentType("text/html");
printWriter pw=response.getWriter();
pw.println("<h1>Hello World!<h1>");
pw.close();
}
public void destory()
{
System.out.println("In destroy() Method");
}
}