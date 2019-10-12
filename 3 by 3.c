#include<stdio.h>
main()
{
int a[3][3],b[3][3],c[3][3],i,j;
printf("\n enter  elements into a");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
scanf("%d",&a[i][j]);
printf("\n a[%d][%d]=%d",i,j,a[i][j]);
}
}
printf("\n enter second matrix");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
scanf("%d",&b[i][j]);
printf("b[%d][%d]=%d\n",i,j,b[i][j]);
}
}
printf("the resultant matrix");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
c[i][j]=a[i][j]+b[i][j];
printf("%5d",c[i][j]);
}
printf("\n");
}
}

