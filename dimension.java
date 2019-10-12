class dimenstionException extends Exception
{
dimenstionException()
{
System.out.println("Invalid dimenstion");
}
}
class dimenstionTest
{
static void displaydimension(int dimenstion)throws dimenstionException
{
	if(dimenstion<0)
		throw new dimenstionException();
	else
		System.out.println("+d");
}
}
class dimenstionExceptions
{
	public static void main(String args[])
	{
		try{
			displayTest dc1=new  displayTest(-7);
		}
		catch(dimenstionException e)
		{
			//e.printStackTrace();
			System.out.println("enter positive value");
		}
	}
}
