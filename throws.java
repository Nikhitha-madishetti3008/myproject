class throwsex
{
public static void main(String args[])
{
One o=new One();
o.y();
}
}
class One 
{
void y()
{
try{
x();
}
catch(Exception e)
{
System.out.println(e);
}
}
void x() throws Exception
{
System.out.println("the method which throws exception");
}
}
