class one 
{
int x=19;
}
class two extends one
{
int x=11;
void show()
{
System.out.println("value of superclass="+super.x);
System.out.println("value of x="+x);
}
}
class introvert
{
public static void main(String a[])
{
two t=new two();
t.show();
}
}
