abstract class Shape
{
  protected String color;
  protected boolean filled;
  public Shape()
  {
    color="Green";
    filled=true;
  }
  public Shape(String color,boolean filled)
  {
    this.color=color;
    this.filled=filled;
  }
  String getColor()
  {
   return color;
  }
  void setColor(String color)
  {
   this.color=color;
  }
  Boolean isFilled()
  {
   return filled;
  }
  void setFilled(boolean filled)
  {
   this.filled=filled;
  }
  abstract double getArea();
  abstract double getPerimeter();
  //abstract double getRadius();
  //abstract double getLength();
  //abstract double getSide();
  public String toString()
  {
    return "A Shape with color of "+color+" ";
  }
}
class Circle extends Shape
  {
   double radius;
   public Circle()
   {
     super();
     radius= 1.0;
   }
   public Circle(double radius)
   {
     super();
     this.radius = radius;
   }
   public Circle(double radius,String color,boolean filled)
   {
     super(color,filled);
     this.radius=radius;
   }
  public double getRadius()
   {
    return radius;
   }
   double getArea(){
       return 3.14*radius*radius;
   }
   double getPerimeter(){
         return 2*3.14*radius;
   }
   void setRadius(double radius){
         this.radius = radius;
   }
   public String toString()
   {
    return "A Circle with radius="+radius+", which is a subclass of"+super.toString()+"";
   }
 }
class Rectangle extends Shape
  {
   protected double width,length;
   public Rectangle()
   {
      super();
      width=1.0;
      length=1.0;
   }
   public Rectangle(double width,double length)
   {
      super();
      this.width=width;
      this.length=length;
   }
   public Rectangle(double width,double length,String color,boolean filled)
   {
      super(color,filled);
      this.width=width;
      this.length=length;
   }
   void setWidth(double width)
   {
       this.width=width;
   }
   void setLength(double length)
   {
       this.length=length;
   }
   double getWidth()
   {
    return width;
   }
   double getLength()
   {
    return length;
   }
   double getArea()
   {
    return length*width;
   }
   double getPerimeter()
   {
    return 2*(length+width);
   }
   public String toString()
   {
    return "A Rectangle with width="+width+"and length="+length+",which is a subclass of"+super.toString()+"";
   }
}
class Square extends Rectangle
 {
   public Square(double side)
   {
     super(side,side);
   }
   public Square(double side,String color,boolean filled)
   {
     super(side,side,color,filled);
   }
   double getSide()
   { 
    return super.width;
   }
    void setSide(double side)
	{
		super.width = side;
		super.length = side;
	}
	void setWidth(double side)
	{
		super.width = side;
	}
	void setLength(double side)
	{
		super.length = side;
	}
   public String toString()
   {
    return "A square with side="+getSide()+",which is a subclass of"+super.toString()+"";
   }
 }
class TestSquare
 {
   public static void main(String args[])
   {
	Shape s1=new Circle(5.5, "RED", false);  // Upcast Circle to Shape
    System.out.println(s1);                    // which version?
	System.out.println(s1.getArea());          // which version?
	System.out.println(s1.getPerimeter());     // which version?
	System.out.println(s1.getColor());
	System.out.println(s1.isFilled());
	//System.out.println(s1.getRadius());
   
	Circle c1 = (Circle)s1;                   // Downcast back to Circle
	System.out.println(c1);
	System.out.println(c1.getArea());
	System.out.println(c1.getPerimeter());
	System.out.println(c1.getColor());
	System.out.println(c1.isFilled());
	System.out.println(c1.getRadius());
   
	//Shape s2 = new Shape();
   
	Shape s3 = new Rectangle(1.0, 2.0, "RED", false);   // Upcast
	System.out.println(s3);
	System.out.println(s3.getArea());
	System.out.println(s3.getPerimeter());
	System.out.println(s3.getColor());
	//System.out.println(s3.getLength());
   
	Rectangle r1 = (Rectangle)s3;   // downcast
	System.out.println(r1);
	System.out.println(r1.getArea());
	System.out.println(r1.getColor());
	System.out.println(r1.getLength());
   
	Shape s4 = new Square(6.6);     // Upcast
	System.out.println(s4);
	System.out.println(s4.getArea());
	System.out.println(s4.getColor());
	//System.out.println(s4.getSide());
  
// Take note that we downcast Shape s4 to Rectangle, 
//  which is a superclass of Square, instead of Square
	Rectangle r2 = (Rectangle)s4;
	System.out.println(r2);
	System.out.println(r2.getArea());
	System.out.println(r2.getColor());
	//System.out.println(r2.getSide());
	System.out.println(r2.getLength());
   
// Downcast Rectangle r2 to Square
	Square sq1 = (Square)r2;
	System.out.println(sq1);
	System.out.println(sq1.getArea());
	System.out.println(sq1.getColor());
	System.out.println(sq1.getSide());
	System.out.println(sq1.getLength());
  }
}