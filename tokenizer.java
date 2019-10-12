import java.util.*;
class StringTokenizerDemo
{
public static void main(String args[])
{
String str="S R Engineering college";
StringTokenizer st=new StringTokenizer(str," ");
System.out.println("the total no of tokens are:"+st.countTokens());
System.out.println("the tokens are:");
while(st.hasMoreTokens())
{
System.out.println(st.nextToken());
}
}
}  