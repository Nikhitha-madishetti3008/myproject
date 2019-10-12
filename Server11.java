import java.util.*;
import java.net.*;
import java.io.*;
public class Server11
{
public static void main(String args[])
{
try
{
ServerSocket ss=new ServerSocket(1089);
System.out.println("client has  connected");
Socket s=ss.accept();
DataInputStream din=new DataInputStream(s.getInputStream());
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String recMessage=" ",sendMessage=" ";
while(!recMessage.equals("end"))
{
	//recMessage=din.readUTF();
	//System.out.println(recMessage);
	sendMessage=br.readLine();
	dout.writeUTF(sendMessage);
	recMessage=din.readUTF();
System.out.println(recMessage);
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}
