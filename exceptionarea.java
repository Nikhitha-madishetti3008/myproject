class VotingException extends Exception
{
VotingException()
{
System.out.println("invalid age");
}
}
class VotingTest
{
static void displayEligibility(int radius)throws VotingException
{
if(radius<0)
throw new VotingException();
else
System.out.println(+(3.14*radius*radius));
}
}
class customException
{
public static void main(String args[])
{
try{
VotingTest.displayEligibility(2);
}
catch(VotingException e)
{
System.out.println();
}
}
}