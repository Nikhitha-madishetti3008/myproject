class a
{
void add(int a,int b)
{
System.out.println("add="+(a+b));
}
}
class b extends a
{
void sub(int a,int b)
{
System.out.println("sub="+(a-b));
}
}
class c extends b
{
void mul(int a,int b)
{
System.out.println("mul="+(a*b));
}
}
class multilevelinheritance
{
public static void main(String a[])
{
c t=new c();
t.add(2,3);
t.sub(2,3);
t.mul(2,3);
}
}