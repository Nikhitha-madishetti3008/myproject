class compare
{
public static void main(String args[])
{
int a[]=new int[]{0,1,2,3,4};
int big=a[0];
for(int i=0;i<a.length;i++)
{
if(a[i]>=big)
big=a[i];
}
System.out.println(big);
int small=a[0];
for(int i=0;i<a.length;i++)
{
if(small>=a[i])
small=a[i];
}
System.out.println(small);
}
}