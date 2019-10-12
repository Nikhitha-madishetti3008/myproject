class one 
{
void show()
{
System.out.println("nikhitha");
}
}
class two extends one
{
void show()
{
System.out.println("laddu");
}
void display()
{
super.show();
show();
}
}
class method
{
public static void main(String args[])
{
two t=new two();
t.display();
}
}