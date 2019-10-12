import java.rmi.*;
import java.rmi.server.*;
import java.util.*;
import java.io.*;
public class MyRemote extends UnicastRemoteObject implements MyRemoteInterface
{
MyRemote()throws RemoteException 
{
	super();
}
public int add(int x,int y)
{
return(x+y);
}
public int sub(int a,int b)
{
return(a-b);
}
public String display(String s)
{
return(s);
}
}

