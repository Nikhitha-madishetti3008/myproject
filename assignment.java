abstract class shape
{
String color;
boolean filled;
public shape()
{
color="green";
filled =true;
}
public shape(String c,boolean f)
{
color=c;
filled=f;
}
void setcolor(String s)
{
color=s;
}
String getcolor()
{
return color;
}
void setfilled(boolean b)
{
filled=b;
}
boolean isfilled()
{
return filled;
}
public String toString()
{
return "shapecolor="+color+"filled="+filled;
}
abstract double getarea();
abstract double getperimeter();
}
class circle extends shape
{
double radius;
public circle()
{
super();
radius=1.0;
}
public circle(double r)
{
super();
radius=r;
}
public circle(double r,String c,boolean f)
{
super(c,f);
radius=r;
}
void setradius(double r)
{
radius=r;
}
double getradius()
{
return radius;
}
double getarea()
{
return	3.14*radius*radius;
}
double getperimeter()
{
return 	2*3.14*radius;
}
public String toString()
{
return "circle:subclass of"+super.toString()+"radius="+radius;
}
}
class rectangle extends shape
{
double width,length;
public rectangle()
{
super();
width=1.0;
length=1.0;
}
public rectangle(double w,double l)
{
super();
width=w;
length=l;
}
public rectangle(double w,double l,String s,boolean f)
{
super(s,f);
width=w;
length=l;
}
void setwidth(double w)
{
width=w;
}
double getwidth()
{
return width;
}
void setlength(double l)
{
length=l;
}
double getlength()
{
return length;
}
double getarea()
{
	return length*width;
}
double getperimeter()
{
	return 2*(length+width);
}
public String toString()
{
return "rectangle:subclassof"+super.toString()+"width="+width;
}
}
class square extends rectangle
{
public square()
{
super();
}
public square(double s)
{
super();
double width=s;
}
public square(double s,double w,double l)
{
super(w,l);
double width=s;
}
void setside(double s)
{
double width=s;
}
double getside()
{
return width;
}
void setwidth(double w)
{
width=w;
}
void setlength(double l)
{
length=l;
}
public String toString()
{
return "square:subclass of"+super.toString()+"width="+width;
}
double getarea()
{
return length*width;
}
double getperimeter;
{
return 2*(length+width);
}
}
class testclass
{
public static void main(String args[])
{
shape s1 = new circle(5.5, "RED", false);  
System.out.println(s1);                    
System.out.println(s1.getarea());         
System.out.println(s1.getperimeter());     
System.out.println(s1.getcolor());
System.out.println(s1.isfilled());
System.out.println(s1.getradius());
circle c1 = (circle)s1;                   
System.out.println(c1);
System.out.println(c1.getarea());
System.out.println(c1.getperimeter());
System.out.println(c1.getcolor());
System.out.println(c1.isfilled());
System.out.println(c1.getradius());   
shape s2 =new shape();   
shape s3 =new rectangle(1.0, 2.0, "RED", false);  
System.out.println(s3);
System.out.println(s3.getarea());
System.out.println(s3.getperimeter());
System.out.println(s3.getcolor());
System.out.println(s3.getlength());  
rectangle r1 = (rectangle)s3;   
System.out.println(r1);
System.out.println(r1.getarea());
System.out.println(r1.getcolor());
System.out.println(r1.getlength());   
shape s4 =new square(6.6);     
System.out.println(s4);
System.out.println(s4.getarea());
System.out.println(s4.getcolor());
System.out.println(s4.getside()); 
rectangle r2 = (rectangle)s4;
System.out.println(r2);
System.out.println(r2.getarea());
System.out.println(r2.getcolor());
System.out.println(r2.getside());
System.out.println(r2.getlength());  
square sq1 = (square)r2;
System.out.println(sq1);
System.out.println(sq1.getarea());
System.out.println(sq1.getcolor());
System.out.println(sq1.getside());
System.out.println(sq1.getlength());
}
}