import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Helloworld extends HttpServlet
{
    public void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException
{
    PrintWriter out = response.getWriter();
      out.println("Hello world");
}
}
    
