class methodoverloading
{
void sum(int a,int b)
{
System.out.println(+(a+b));
}
void sum(int a,int b,int c)
{
System.out.println(+(a+b+c));
}
void sum(float x,int y)
{
System.out.println(+(x+y));
}
int sum(int a,int b,int c,int d)
{
return a+b+c+d;
}
}
class overloadingtest
{
public static void main(String args[])
{
methodoverloading m=new methodoverloading();
m.sum(10,5);
m.sum(10,5,2);
m.sum(10.2f,10);
System.out.println(m.sum(10,10,10,10));
}
}
