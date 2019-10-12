class Employee
{
int empno;
String name;
float salary;
void setDetails(int e,String n,float sal)
{
empno=e;
name=n;
salary=sal;
}
void getDetails()
{
System.out.println(empno);
System.out.println(name);
System.out.println(salary);
}
}
class EmpTest
{
public static void main(String[] args)
{
Employee e=new Employee();
e.setDetails(544,"shreya",40000);
e.getDetails();
}
}