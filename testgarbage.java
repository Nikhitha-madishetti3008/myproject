class testgarbage
{
public static void main(String a[])
{
testgarbage t1=new testgarbage();
testgarbage t2=new testgarbage();
t1=null;
t2=null;
System.gc();
}
public void finalize()
{
System.out.println("object is garbage collected");
}
}