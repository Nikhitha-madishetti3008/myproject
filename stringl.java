import java.util.*;
class stringlen
{
void speak()
{
String a;
Scanner s=new Scanner(System.in);
a=s.nextLine();
System.out.println(a+"!");
}
}
class slength
{
public static void main(String a[])
{
stringlen s=new stringlen();
System.out.println("enter");
s.speak();
}
}