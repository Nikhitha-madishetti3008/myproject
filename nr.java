import java.util.*;
class nr
{
public static void main(String args[])
{
int n,i,j,m;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int a[]=new int[n];
m=n+2;
int a11[]=new int[m];
for(i=0;i<n;i++)
{
a[i]=1;
System.out.print(" "+a[i]);
}
for(i=0,j=0;i<n && j<m;i++,j++)
{
if(a[i]==1 && j<5)
{
a11[j]=a[i];
}
else if(j==5)
{
a11[j]=0;
}
else if(a[i]==1 && j>5)
{
a11[i]=a[i];
}
else if(a[i]==1 && j==m)
{
a11[i]=0;
}
System.out.print(" "+a11[i]);
}
}
}


