class stringlength
{
String greeting1,greeting2;
void print(String g1)
{
greeting1=g1;
System.out.println(greeting1);
}
void print1(String g2)
{
greeting2=g2;
System.out.println(greeting2);
}
}
class slength
{
public static void main(String a[])
{
stringlength s=new stringlength();
s.print("goodmorning world");
s.print1("goodevening world");
}
}
