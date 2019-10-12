class a
{
void display()
{
System.out.println("x");
}
}
class b extends a
{
void show()
{
System.out.println("y");
}
public static void main(String args[])
{
b t=new b();
t.display();
t.show();
}
}