import java.rmi.*;
public class client111
{
public static void main(String args[])
{
try
{
MyRemote stub=(MyRemote)Naming.lookup("addsum");
stub.add(10,20);
stub.sub(20,5);
stub.display("smiley");
}
catch(Exception e)
{
System.out.println(e);
}
}
}