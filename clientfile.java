import java.net.*;
import java.io.*;
import java.util.*;
public class clientfile
{
public static void main(String args[])throws Exception
{
Socket s=new Socket("localhost",1089);
System.out.println("enter the file name:");
BufferedReader keyRead=new BufferedReader(new InputStreamReader(System.in));
String fname=keyRead.readLine();
OutputStream os=s.getOutputStream();
PrintWriter pwrite=new PrintWriter(os,true);
pwrite.println(fname);
InputStream is=s.getInputStream();
BufferedReader socketRead=new BufferedReader(new InputStreamReader(is));
String str;
while((str=socketRead.readLine())!=null)
{
	System.out.println(str);
}
pwrite.close();
socketRead.close();
keyRead.close();
}
}