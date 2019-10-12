class Evennumber extends Thread
{
public void run()
{
	System.out.println("even numbers are:");
for(int i=0;i<50;i+=2)
{
System.out.println(+i);
}
}
}
class Oddnumber extends Thread
{
public void run()
{
	System.out.println("odd numbers are");
for(int i=1;i<50;i+=2)
{
System.out.println(+i);
}
}
}
class ThreadDemo
{
public static void main(String args[])throws Exception
{
Evennumber e=new Evennumber();
e.start();
Oddnumber o=new Oddnumber();
o.start();
}
}