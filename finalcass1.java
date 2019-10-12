lass finalclass
{
void x()
{
System.out.println("x() of superclass");
}
}
class finalclass1 extends finalclass
{
void x()
{
System.out.println("x() of subclass");
}
}
class finalclasstest
{
public static void main(String a[])
{
finalclass1 f=new finalclass1();
f.x();
}
}
