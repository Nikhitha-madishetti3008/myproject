interface arthimetic
{
void add(int a,int b);
void sub(int x,int y);
void mul(int c,int d);
void div(int e,int f);
}
abstract class arthimeticdef implements arthimetic 
{
public void add(int a, int b)
{
System.out.println(a+b);
}
public void sub(int x,int y)
{
System.out.println(x-y);
}
}
class arthidef extends arthimeticdef
{
public void mul(int c,int d)
{
System.out.println(c*d);
}
public void div(int e,int f)
{
System.out.println(e/f);
}
}
class interfacetest
{
public static void main(String args[])
{
arthimetic a=new arthidef();
a.add(10,5);
a.sub(10,5);
a.mul(10,5);
a.div(10,5);
}
}