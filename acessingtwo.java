interface one 
{
void show();
}
interface two
{
void display();
}
class three implements one,two
{
public void show()
{
System.out.println("cse");
}
public void display()
{
System.out.println("btech");
}
}
class test
{
public static void main(String args[])
{
three t=new three();
t.show();
t.display();
}
}