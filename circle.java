class circle
{
double radius;
double area;
double perimeter;
void readValues(double r)
{
radius=r;
}
void calculateArea()
{
area=(3.14)*radius*radius;
}
void calculatePerimeter()
{
perimeter=2*(3.14)*radius;
}
void printValues()
{
System.out.println(area);
System.out.println(perimeter);
}
}
class AreaPerimeter
{
public static void main(String args[])
{
circle c=new circle();
c.readValues(14);
c.calculateArea();
c.calculatePerimeter();
c.printValues();
}
}