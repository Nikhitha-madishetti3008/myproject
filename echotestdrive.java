class echo
{
int count;
void hello()
{
System.out.println("helloo...");
}
}
public class echotestdrive
{
public static void main(String a[])
{
echo e1=new echo();
echo e2=new echo();
int x=0;
while(x<10)
{
e1.hello();
e1.count=e1.count+1;
if(x==9)
{
e2.count=e2.count+e1.count;
}
x=x+1;
}
System.out.println(e2.count);
}
}