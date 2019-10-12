class A
{
int a;
protected float b;
public long c;
double d;
}
class test
{
public static void main(String args[])
{
A obj=new A();
obj.a=10;
obj.b=20;
obj.c=30;
obj.d=40;
System.out.println(obj.a);
System.out.println(obj.b);
System.out.println(obj.c);
System.out.println(obj.d);
}
}