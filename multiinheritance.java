class a
{
void display()
{
System.out.println("x");
}
}
class b
{
void display()
{
System.out.println("y");
}
}
class c extends a,b
{
public static void main(String args[])
{
c t=new c();
t.display();
}
}