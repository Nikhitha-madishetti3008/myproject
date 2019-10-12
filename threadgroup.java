class ThreadGroupDemo implements Runnable
{
public void run()
{
	Thread t=new Thread();
System.out.println("Thread name:"+t.getName());
}
public static void main(String args[])
{
ThreadGroupDemo r=new ThreadGroupDemo();
ThreadGroup tg1=new ThreadGroup("parentThreadGroup");
Thread t1=new Thread(tg1,r,"one");
Thread t2=new Thread(tg1,r,"two");
Thread t3=new Thread(tg1,r,"three");
t1.start();
t2.start();
t3.start();	
System.out.println("ThreadGroupName:"+tg1.getName());
tg1.list();
}
}