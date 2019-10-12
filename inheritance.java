class one
{
int a=2,b=3;
void add()
{
System.out.println("sum="+(a+b));
}
}
class two extends one
{
void sub()
{
System.out.println("sub="+(a-b));
}
public static void main(String args[])
{
two t=new two();
t.add();
t.sub();
}
}