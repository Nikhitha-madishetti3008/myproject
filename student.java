class student
{
String name;
int rollno;
public student(String s,int r)
{
name=s;
rollno=r;
}
public void showstudent()
{
System.out.println("name="+name+"roolno="+rollno);
}
}
class marks extends student 
{
int m1,m2;
public marks(String s,int r,int s1,int s2)
{
super(s,r);
m1=s1;
m2=s2;
}
public void showmarks()
{
System.out.println(m1);
System.out.println(m2);
}
}
class superexplicitcell
{
public static void main(String args[])
{
marks m=new marks("krishna",540,75,80);
m.showstudent();
m.showmarks();
}
}