class multiplication
{
public static void main(String args[])
{
int a[][]=new int[][]{{1,2},{3,4}};
int b[][]=new int[][]{{5,6},{7,8}};
int c[][]=new int[2][2];
for(int i=0;i<a.length;i++)
{
for(int j=0;j<b.length;j++)
{
c[i][j]=0;
for(int k=0;k<a.length;k++)
{
c[i][j]+=a[i][k]*b[k][j];
}
}
}
for(int i=0;i<a.length;i++)
{
for(int j=0;j<b.length;j++)
{
System.out.print(c[i][j]);
}
System.out.println();
}
}
}