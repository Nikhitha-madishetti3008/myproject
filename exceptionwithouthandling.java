class A
{
public static void main(String args[])
{
int a=10,b=0,c=0;
System.out.println("hi");
try{
c=a/b;
}
catch(ArithmeticException ae)
{
System.out.println(ae);
System.out.println("dont give denominator as zero");
}
System.out.println(c);
System.out.println("hello");
System.out.println("how are you");
}
}