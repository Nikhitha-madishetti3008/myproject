import java.rmi.*;
public class client111
{
public static void main(String args[])
{
try
{
myremote mri=(myremote)Naming.lookup("addsum");
mri.add(10,20);
mri.sub(20,5);
mri.display("kothi");
}
catch(Exception e)
{
System.out.println(e);
}
}
}