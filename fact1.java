import java.util.*;
class factorial
{
public static void main(String args[])
{
	int n;
	int fact=1;
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the value");
	n=sc.nextInt();
	for(int i=1;i<=n;i++)
	System.out.println(fact);
}
public static int fact(int x)
{
	int fact=1;
	fact=fact*x;
	return fact;
}
}

	
	