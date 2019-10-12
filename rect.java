class rect
{
int breadth,length,area,perimeter;
void readValues(int breadth,int length)
{
breadth=breadth;
length=length;
}
void calculate()
{
area=breadth*length;
perimeter=2*(length+breadth);
}
void printValues()
{
System.out.println("length="+length);
System.out.println("breadt="+breadth);
System.out.println("area="+area);
System.out.println("perimeter="+perimeter);
}
}
class rectTest
{
public static void main(String args[])
{
Rectangle r=new Rectangle();
r.readValues(10,5);
r.calculateValues();
r.printValues();
}
}