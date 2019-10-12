class Testgarbage
{
public static void main(String a[])
{
Testgarbage t1=new Testgarbage();
Testgarbage t2=new Testgarbage();
t1=null;
t2=null;
System.gc();
}
public void finalize()
{
System.out.println("object is garbage collected");
}
}