import java.io.*;
public class ReadFromFile
{
public static void main(String args[])throws IOException
{
FileInputStream fis=new FileInputStream("ReadFromFile.java");
int c=0;
while(c!=-1)
{
c=fis.read();
System.out.print((char)c);
}
fis.close();
}
}