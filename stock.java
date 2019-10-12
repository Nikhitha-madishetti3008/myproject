class stock
{
String symbol,name;
double previousclosingprice,currentprice;
stock()
{
symbol=System.out.println("orcl");
name=System.out.println("oracle corporation");
{
void setValues(double prcp,double cp)
{
previousclosingprice=prcp;
currentprice=cp;
}
double getchangepercent()
{
return((previousclosingprice-currentprice)/previousclosingprice*100);
}
}
class change
{
public static void main(String a[])
{
stock st=new stock();
st.setValues(34.5,34.35);
System.out.println("orcl:oraclecorporation");
System.out.println(st.getchangepercent());
}
}


