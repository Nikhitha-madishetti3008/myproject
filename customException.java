class VotingException extends Exception
{
VotingException()
{
System.out.println("Invalid age");
}
}
class VotingTest
{
static void displayEligibility(int age)throws VotingException
{
	if(age<19)
		throw new VotingException();
	else
		System.out.println("eligible to vote");
}
}
public class customException
{
	public static void main(String args[])
	{
		try{
			VotingTest.displayEligibility(10);
		}
		catch(VotingException e)
		{
			//e.printStackTrace();
			System.out.println();
		}
	}
}
