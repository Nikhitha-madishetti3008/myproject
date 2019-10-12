abstract class vechile
{
abstract void speed();
void milage()
{
System.out.println("VECHILE MILAGE IS 60KMPH");
}
}
class bike extends vechile
{
void milage()
{
System.out.println("60kmph");
}
void speed()
{
System.out.println("50kmph");	
}
}
class car extends vechile
{
void milage()
{
System.out.println("20kmpl");
}
void speed()
{
System.out.println("140 kmph");
}
}
class abstracttest
{
public static void main(String args[])
{
vechile v=new bike();
v.speed();
v.milage();
vechile v2=new car();
v2.speed();
v2.milage();
}
}