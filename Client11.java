import java.io.*;
import java.net.*;
import java.util.*;
public class Client11
{
public static void main(String args[])throws Exception
{
	try
	{
Socket s=new Socket("localhost",1089);
//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//OutputStream os=s.getOutputStream();
//PrintWriter pwrite=new PrintWriter(os,true);
InputStream is=s.getInputStream();
DataInputStream din=new DataInputStream(is);
OutputStream os=s.getOutputStream();
DataOutputStream dout=new DataOutputStream(os);
//BufferedReader receiveRead=new BufferedReader(new InputStreamReader(is));

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("start the chat");
String recMessage=" ",sendMessage=" ";
while(!recMessage.equals("end"))
{
	recMessage=din.readUTF();
	System.out.println(recMessage);
	sendMessage=br.readLine();
	dout.writeUTF(sendMessage);
	dout.flush();
}
s.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}