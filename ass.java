class DimensionException extends Exception
{
DimensionException()
{
System.out.println("cannot give negative value for dimension");
}
}
class DimensionTest
{
DimensionTest(int d)throws DimensionException
{
if(d<=0)
throw new DimensionException();
else 
System.out.println("d="+d);
}
}
class customException
{
public static void main(String a[])
{
try
{
DimensionTest de1=new DimensionTest(-4);
}
catch(DimensionException e)
{
System.out.println("please enter positive value");
}
}
}