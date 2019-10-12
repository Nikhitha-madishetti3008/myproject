class MyThread extends Thread
{
public void run()
{
	int i;
for(i=0;i<10;i++)
System.out.println("child thread");
}
}
class ThreadDemo
{
public static void main(String args[])throws Exception
{
MyThread t=new MyThread();
t.start();
int i;
for(i=0;i<10;i++)
System.out.println("main thread");
}
}