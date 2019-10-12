import java.io.*;
class iotest1
{
	public static void main(String args[])throws Exception
	{
		FileInputStream fis=new FileInputStream("abc.txt");
		FileOutputStream fos=new FileOutputStream("def.txt");
		int c=0;
		while((c!=-1))
		{
			c=fis.read();
			fos.write(c);
			System.out.println((char)c);
			}
		fis.close();
		fos.close();
	}
}
