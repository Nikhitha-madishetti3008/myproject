abstract class xphone
{
void call()
{
System.out.println("calling");
}
void message()
{
System.out.println("message");
}
abstract void mediaplay();
abstract void browse();
}
abstract class yphone extends xphone
{
void mediaplay()
{
System.out.println("mediaplay");
}
}
class zphone extends yphone
{
void browse()
{
System.out.println("browse");
}
}
class abstractclasscheck
{
public static void main(String a[])
{
zphone z=new zphone();
z.message();
z.mediaplay();
z.browse();
z.call();
}
}