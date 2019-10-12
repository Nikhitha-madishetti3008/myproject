class stock
{
double previousclosingprice,currentprice;
void setValues(double p,double c)
{
previousclosingprice=p;
currentprice=c;
}
double getchangepercentage()
{
return((previousclosingprice-currentprice)/previousclosingprice)*100;
}
}
class change
{
public static void main(String a[])
{
stock st=new stock();
st.setValues(34.5,34.35);
System.out.println("orcl:oraclecorporation");
System.out.println(st.getchangepercentage());
}
}
