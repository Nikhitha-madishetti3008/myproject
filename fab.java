import java.util.*;
class fib
{
public static void main(String args[])
{
int a;
Scanner sc=new Scanner(System.in);
System.out.println("enter value");
a=sc.nextInt();
for(int i=0;i<a;i++)
System.out.println(fib(i));
}
public static int fib(int x)
{
if(x==0||x==1)
return x;
else
return fib(x-1)+fib(x-2);
}
}


