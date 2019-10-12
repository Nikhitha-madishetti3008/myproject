import java.net.*;
import java.io.*;
import java.util.*;
public class serverfile
{
public static void main(String args[])throws Exception
{
ServerSocket ss=new ServerSocket(1089);
System.out.println("server ready for connection");
Socket s=ss.accept();
System.out.println("connection is successful");
InputStream is=s.getInputStream();
BufferedReader fileRead=new BufferedReader(new InputStreamReader(is));
String fname=fileRead.readLine();
BufferedReader contentRead=new BufferedReader(new FileReader(fname));
OutputStream os=s.getOutputStream();
PrintWriter pwrite=new PrintWriter(os,true);
String str;
while((str=contentRead.readLine())!=null)
{
pwrite.println(str);
}
s.close();
ss.close();
pwrite.close();
fileRead.close();
contentRead.close();
}
}
