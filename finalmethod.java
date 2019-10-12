class finalmethod
{
void x()
{
System.out.println("x() is superclass");
}
}
class finalmethod2 extends finalmethod
{
void x()
{
System.out.println("x() is a subclass");
}
}
class finalmethodcheck
{
public static void main(String a[])
{
finalmethod2 f=new finalmethod2();
f.x();
}
}