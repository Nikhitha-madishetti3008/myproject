import java.io.*;
public class ReadFromFile1
{
public static void main(String args[])throws Exception
{
FileReader fr=new FileReader("ReadFromFile2.java");
FileWriter fw=new FileWriter("ReadFromFile3.java");
int c;
while((c=fr.read())!=-1)
{
fw.write(c);
System.out.print((char)c);
}
fw.close();
fr.close();
}
}