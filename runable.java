class MyRunnable implements Runnable
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
MyRunnable r=new MyRunnable();
Thread t=new Thread(r);
t.start();
int i;
for(i=0;i<10;i++)
System.out.println("main thread");
}
}
