import java rmi.*;
import java rmi.registry.*;
public class server111
{
public static void main(String args[])
{
try
{
myremote mri=new myremote();
Naming.bind("addsub",mri);
}
catch(Exception e)
{
System.out.println(e);
}
}
}
