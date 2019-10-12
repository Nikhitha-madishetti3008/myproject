interface GeometricObject
{
	 double getPerimeter();
	 double getArea();
}
class Circle implements GeometricObject
{
	 double radius = 1.0;
	Circle()
	{
    }
    Circle(double newRadius)
	{
          radius = newRadius;
    }
    public double getArea()
	{
       return 3.14*radius*radius;
    }
  public double getPerimeter()
    {
         return 2*3.14*radius;
    }
   void setRadius(double newRadius)
    {
         radius = newRadius;
    }
 }
  interface Resizable
 {
	//public double resize();
	 double resize(int percent);
 }
  class ResizableCircle extends Circle implements Resizable
 {
	 public ResizableCircle(double radius)
	 {
		 super.setRadius(radius);
	 }
	 public double resize(int percent)
	 {
		return radius= radius*percent;
	 }
 }
 class TestResizableCircle
 {
	 public static void main(String args[]){
	 Circle c1=new Circle();
     System.out.println("Circle 1...");
     System.out.println("Area :"+c1.getArea());
     System.out.println("Perimeter :"+c1.getPerimeter());
     Circle c2=new Circle(25.0);
     System.out.println("Circle 2...");
     System.out.println("Area :"+c2.getArea());
     System.out.println("Perimeter :"+c2.getPerimeter());  
     Circle c3=new Circle(125.0);
     System.out.println("Circle 3...");
     System.out.println("Area :"+c3.getArea());
     System.out.println("Perimeter :"+c3.getPerimeter());
	 ResizableCircle r1=new ResizableCircle(5.0);
	// ResizableCircle r2=new resize(5);
 }
	 
 }