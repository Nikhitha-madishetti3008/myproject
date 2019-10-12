import java.sql.*;
class MysqlExp
{
public static void main(Strings args[])
{
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"nikki","root","root");
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("Select * from stud1");
while(rs.next())
System.out.println(rs.getString(1)+" "+rs.getString(2));
con.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}