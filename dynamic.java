class  a
{
void show()
{
System.out.println("show() of a class");
}
}
class b extends a
{
void show()
{
System.out.println("show() of b class");
}
}
class dmd
{
public static void main(String args[])
{
a c=new b();
c.show();
}
}