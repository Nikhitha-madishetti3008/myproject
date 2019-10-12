import java.io.*;
public class ReadFromFile2
{
 public static void main(String args[])   
 {
     FileReader fr=null;
     try{
         fr=new FileReader(args[0]);
         int c=fr.read();
         while(c!=-1)
         {
             System.out.print((char)c);
             c=fr.read();
     }
 }
         catch(FileNotFoundException fnfe)
         {
             System.out.print("specified file not found");
         }
         catch(IOException ioe)
         {
             System.out.print("some other problemin i/o operation");
         }
         finally
		 {
         try
         {
             if(fr!=null)
                 fr.close();
         }
         catch(Exception e){}
}
}
}