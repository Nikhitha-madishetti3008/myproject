import java.util.*;
import java.net.*;
import java.io.*;
public class Client1
{
public static void main(String args[])
{
try
{
InetAddress ip=InetAddress.getByName("localhost");
Socket s=new Socket(ip,1089);
System.out.println("connected successfully");
InputStream is=s.getInputStream();
BufferedReader br=new BufferedReader(new InputStreamReader(is));
String num=br.readLine();
System.out.println("Message received to client is"+num);
s.close();
}
catch(UnknownHostException e)
{
	System.out.print("ip not found for"+e);
}
catch(IOException e)
{
	System.out.print("not found data for socket"+e);
}
}
}
