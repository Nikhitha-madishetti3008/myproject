class multicatch
{
public static void main(String a[])
{
System.out.println("programme starts here");
int n1=Integer.parseInt(a[0]);
int n2=Integer.parseInt(a[1]);
int q;
try{
q=n1/n2;
System.out.println(+q);
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println("programme ends");
}
}