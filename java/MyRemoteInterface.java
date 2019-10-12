import java.util.*;
import java.net.*;
import java.io.*;
import java.rmi.*;
import java.rmi.server.*;
public interface MyRemoteInterface extends Remote
{
public int add(int x,int y)throws RemoteException;
public int sub(int a,int b)throws RemoteException;
public String display(String s)throws RemoteException;
}
