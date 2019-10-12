import java.io.*;
public class ReadFromFileBuffered
{
public static void main(String args[])throws Exception
{
BufferedReader br=new BufferedReader(new FileReader("ReadFromFile.java"));
BufferedWriter bw=new BufferedWriter(new FileWriter("abc.txt"));
String c;
while((c=br.readLine())!=null)
{
bw.write(c);
System.out.println((String)c);
}
bw.close();
br.close();
}
}
