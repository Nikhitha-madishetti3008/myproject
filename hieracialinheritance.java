class a
{
void add(int x,int y)
{
System.out.println("sum="+(x+y));
}
}
class b extends a
{
void sub(int x,int y)
{
System.out.println("sub="+(x-y));
}
}
class c extends a
{
void mul(int x,int y)
{
System.out.println("mul="+(x*y));
}
}
class hieracialinheritance
{
public static void main(String a[])
{
c s=new c();
s.add(2,3);
s.mul(2,3);
b s1=new b();
s1.add(2,3);
s1.sub(2,3);
}
}