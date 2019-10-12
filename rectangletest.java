class rectangle
{
double width,height,area,perimeter;
rectangle()
{
	System.out.println("area and perimeter are");
}
rectangle(double w,double h)
{
width=w;
height=h;
System.out.println("width="+width+"\n height="+height);
}
void calculateA()
{
area=(width*height);
System.out.println("\n area="+area);
}
void calculateP()
{
perimeter=(2*(width+height));
System.out.println("\n perimeter="+perimeter);
}
}
class rectangletest
{
public static void main(String args[])
{
rectangle r=new rectangle(1,2);
r.calculateA();
r.calculateP();
}
}
