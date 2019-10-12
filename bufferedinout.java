import java.io.*;
class iotest4
{
	public static void main(String args[])throws Exception
	{
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("ReadFromFile.java"));
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("mno.txt"));
		int c;
		while((c=bis.read())!=-1)
		{
			bos.write(c);
			System.out.print((char)c);
		}
		bis.close();
		bos.close();
	}
}
