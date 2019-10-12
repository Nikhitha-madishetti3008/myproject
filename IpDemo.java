import java.util.*;
import java.io.*;
import java.net.*;
class IpDemo
{
public static void main(String args[])
{
String str;
Scanner sc=new Scanner(System.in);
System.out.println("enter website name");
str=sc.nextLine();
try
{
InetAddress ip=InetAddress.getByName(str);
System.out.println("ip adress of"+str+"is"+ip);
}
catch(Exception e)
{
System.out.println(e);
}
}
}