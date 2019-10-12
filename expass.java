class Calculator
{
public static void main(String args[])
{
System.out.println("program starts here");
int a=Integer.parseInt(args[0]);
String  b=args[1];
int c=Integer.parseInt(args[2]);
System.out.println("length:"+args.length);
if(args.length==3)
{
if(b.equals("+"))
System.out.println("  "+a+"+"+c+"="+(a+c));
else if(b.equals("-"))
System.out.println("  "+a+"-"+c+"="+(a-c));
else if(b.equals("."))
System.out.println("  "+a+"."+c+"="+(a*c));
else if(b.equals("/"))
System.out.println("  "+a+"/"+c+"="+(a/c));
}
else
{
System.exit(1);
}
}
}
