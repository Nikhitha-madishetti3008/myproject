class first
{
synchronized public void display(String msg)
{
System.out.print("["+msg);
try
{
Thread.sleep(1000);
}
catch(InterruptedException ie)
{
}
System.out.print("]");
}
}
class second extends Thread
{
String msg;
first fobj;
second(first fp,String str)
{
fobj=fp;
msg=str;
start();
}
public void run()
{
	synchronized(fobj)
	{
fobj.display(msg);
}
}
}
class synchro
{
public static void main(String args[])
{
first fnew=new first();
second ss=new second(fnew,"welcome");
second ss1=new second(fnew,"cse");
second ss2=new second(fnew,"A");
}
}
