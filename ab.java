interface one 
{
void show();
}
interface two extends one
{
void display();
}
class three implements two
{
void show()
{
System.out.println("cse");
}
void display()
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