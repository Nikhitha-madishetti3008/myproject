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
class c extends b
{
void mul(int x,int y)
{
System.out.println("mul="+(x*y));
}
}
class d extends b 
{
void div(int x,int y)
{
System.out.println("div="+(x/y));
}
}
class hybridinheritance
{
public static void main(String a[])
{
c s=new c();
s.add(2,3);
s.sub(2,3);
s.mul(2,3);
d s1=new d();
s1.add(2,3);
s1.sub(2,3);
s1.div(2,3);
}
}