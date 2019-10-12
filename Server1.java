import java.util.*;
import java.net.*;
import java.io.*;
public class Server1
{
public static void main(String args[])
{
try
{
ServerSocket ss=new ServerSocket(1089);
System.out.println("waiting for response");
Socket s=ss.accept();
System.out.println("request accepted");
PrintStream ps=new PrintStream(s.getOutputStream());
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("input the data at  server");
ps.print(br.readLine());
s.close();
ss.close();
}
catch(Exception e)
{
System.out.println("not found socket"+e);
}
}
}