class circle
{
double radius,area,perimeter;
void readValues(double r)
{
radius=r;
}
void calculateA()
{
area=(3.14*(radius*radius));
}
void calculateP()
{
perimeter=(2*(3.14)*radius);
}
void printValues() 
{
System.out.println(radius);
System.out.println(area);
System.out.println(perimeter);
}
}
class circletest
{
public static void main(String args[])
{
circle s=new circle();
s.readValues(1);
s.calculateA();
s.calculateP();
s.printValues();
circle s1=new circle();
s1.readValues(25);
s1.calculateA();
s1.calculateP();
s1.printValues();
circle s2=new circle();
s2.readValues(125);
s2.calculateA();
s2.calculateP();
s2.printValues();
}
}