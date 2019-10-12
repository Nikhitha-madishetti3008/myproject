class Method
{
void max(int a,int b)
{
if(a>b)
System.out.println("max="+a);
else
System.out.println("max="+b);
}
void max(int a,int b,int c)
{
if(a>b && a>c)
System.out.println("max="+a);
else if(b>a && b>c)
System.out.println("max="+b);
else
System.out.println("max="+c);
}
void max(double a,double b)
{
if(a>b)
System.out.println("max="+a);
else
System.out.println("max="+b);
}
void max(double a,double b,double c)
{
if(a>b && a>c)
System.out.println("max="+a);
else if(b>a && b>c)
System.out.println("max="+b);
else
System.out.println("max="+c);
}
}
class MethodTest
{
public static void main(String args[])
{
Method m=new Method();
m.max(12,45);
m.max(12,45,56);
m.max(1.2,4.5);
m.max(1.2,4.5,5.6);
}
}