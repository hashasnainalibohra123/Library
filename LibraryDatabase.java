 import java.sql.*;
 import java.sql.Connection.*;
 import java.sql.DriverManager.*;


public class LibraryDatabase
{
	public static  void main(String args[])
	{
	
		LibraryDatabase l=new LibraryDatabase();
		l.create();
	
	}
public void create()
{
	
	
	String s1="create table BOOK (id varchar(40),Book_Title varchar(40),Author1 varchar(40),Author2 varchar(40),Author3 varchar(40),publisher varchar(20),issue  varchar(20) );";
	String s2="create table student (id varchar(20),name varchar(70),Fname varchar(70),branch varchar(20));";
	String s3="create table faculty (id varchar(20),name varchar(70),mobile varchar(70),branch varchar(20));";
	String s4="create table loan (id varchar(20),student_id varchar(20),book_id varchar(20)); ";
	int i=0;
	System.out.println(s1);
	System.out.println(s3);
	System.out.println(s2);
	System.out.println(s4);
	while(i<4)
	{	i=i+1;
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
		Statement S=con.createStatement();
	System.out.println("test1");
	
		if(i==0)
		{
			S.executeQuery(s1);
		
		}
	
	if(i==1)
		{
			S.executeQuery(s2);
		}
	if(i==2)
		{
			S.executeQuery(s3);
		}
	if(i==3)
		{
			S.executeQuery(s4);
		}

	con.close();
	
	}
	
	catch(Exception e2)
	{
		System.out.println("Failed to create table "+e2);
	
	
	}
	}//while
	}//create


} 





