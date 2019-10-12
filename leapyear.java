class leap
{
public static void main(String args[])
{
double year=1954;
if(year%4==0||year%100!=0||year%400==0)
{
System.out.println("it is a leap year");
}
else
{
System.out.println("not a leap year");
}
}
}