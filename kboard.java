import java.io.*;
class ReadFromKeyBoard 
{
public static void main(String args[])throws IOException
{
	DataInputStream dis=new DataInputStream(System.in);
	System.out.println("enter details");
	System.out.println("name=");
	String name=dis.readLine();
	System.out.println("age=" );
	int age=Integer.parseInt(dis.readLine());
	System.out.println("percentage=");
	double perc=Double.parseDouble(dis.readLine());
	System.out.println("your details are");
	System.out.println("name="+name);
	System.out.println("age="+age);
	System.out.println("percentage="+perc);
	dis.close();
}
}