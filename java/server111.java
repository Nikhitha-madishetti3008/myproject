import java.rmi.*;
import java.rmi.registry.*;
public class server111
{
public static void main(String args[])
{
try
{
MyRemote stub=new MyRemote();
Naming.bind("addsub",stub);
}
catch(Exception e)
{
System.out.println(e);
}
}
}
