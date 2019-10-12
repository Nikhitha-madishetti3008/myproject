class PrintChar implements Runnable
{
char ch;
int times;
int times1;
char ch1;
PrintChar(char ch,int times,char ch1,int times1)
{
this.ch=ch;
this.times=times;
this.ch1=ch1;
this.times1=times1;
}
public void run()
{
for(int i=0;i<times;i++)
{
System.out.println(ch);
try
{
	Thread.sleep(1000);
}catch(InterruptedException ie){}
}
for(int j=0;j<times1;j++)
{
System.out.println(ch1);
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
PrintChar p=new PrintChar('n',10,'m',20);
Thread t=new Thread(p);
t.start();
}
}