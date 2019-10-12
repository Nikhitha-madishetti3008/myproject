class finallyex
{
public static void main(String args[])
{
int a[]=new int[]{1,2,3,4};
try{
int i=a[4];
}
catch(ArrayIndexOutOfBoundsException ae)
{
System.out.println("array limit exceeding");
}
finally
{
System.out.println("finally block executes");
}
System.out.println("programme ends here");
}
}