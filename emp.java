class emp
{
int empno;
String name;
float sal;
void setdata()
{
empno=1001;
name="sunny";
sal=50000;
}
void displaydata()
{
System.out.println("emp details");
System.out.println(+empno);
System.out.println(name);
System.out.println(+sal);
}
}
class test
{
public static void main(String args[])
{
emp e=new emp();
e.setdata();
e.displaydata();
emp e1=new emp();
e1.name="smiley";
e1.empno=1002;
e1.sal=10000;
e1.displaydata();
}
}