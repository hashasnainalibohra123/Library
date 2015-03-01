import java.sql.*;
import java.sql.Connection.*;
import java.sql.DriverManager.*;
class prepareStatement
{
public static void main(String args[])
{
	prepareStatement p=new prepareStatement();
	p.create();

}
public void create()
{
try
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	
	
	}
	catch(Exception e1)
	{
		System.out.println("Failed To Load Driver Due To"+e1 );
	
	}
	
	try
	{
		
		Connection con=DriverManager.getConnection("jdbc:odbc:Library","","");
		System.out.println("test");
	//	String s2="create table student (id varchar(20),name varchar(70),Fname varchar(70),branch varchar(20));";
	
		String s="insert into student(id,name,Fname,branch)"+"values (?,?,?,?);";
		PreparedStatement pstmt=con.preparetatement(s);
		pstmt.setString(1,"cs01");
		pstmt.setString(2,"hasnain");
		pstmt.setString(3,"yunus hussain");
		pstmt.setString(4,"computer science");
		pstmt.addBatch();
		
		pstmt.setString(1,"cs02");
		pstmt.setString(2,"garvit");
		pstmt.setString(3,"jaikant ");
		pstmt.setString(4,"it");
		pstmt.addBatch();
		
		int count[]=pstmt.executeBatch();
		
		con.close();
		}



	catch(Exception e1)
	{
		System.out.println("Failed To Load Driver Due To"+e1 );
	
	}

}


}