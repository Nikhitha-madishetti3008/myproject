class PrintTable implements Runnable
{
int num,num1;
PrintTable(int num,int num1)
{
this.num=num;
this.num1=num1;
}
public void run()
{
for(int i=0;i<=10;i++)
{
System.out.println("  " +num+"."+i+"="+(num*i));
try
{
	Thread.sleep(1000);
}catch(InterruptedException ie){}
}
for(int j=0;j<=10;j++)
{
System.out.println("  " +num1+"."+j+"="+(num1*j));
try
{
Thread.sleep(1000);
}catch(InterruptedException ie){}
}
}
}
class Test
{
public static void main(String args[])throws Exception
{
PrintTable p=new PrintTable(2,3);
Thread t=new Thread(p);
t.start();
}
}