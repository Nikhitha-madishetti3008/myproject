class tapedeck
{
boolean canrecord=true;
void playtape()
{
System.out.println("tape playing");
}
void recordtape()
{
System.out.println("tape recording");
}
}
class tape
{
public static void main(String args[])
{
	tapedeck t=new tapedeck();
t.canrecord=true;
t.playtape();
if(t.canrecord=true)
{
t.recordtape();
}
}
}