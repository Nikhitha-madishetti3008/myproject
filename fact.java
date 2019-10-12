import java.util.*;
class fact
{
public static void main(String args[])
{
int n;
int fact=1;
Scanner sc=new Scanner(System.in);
System.out.print("enter any value");
n=sc.nextInt();
for(int i=1;i<=n;i++)
{
	fact=fact*i;
}
System.out.println(fact);
}
}