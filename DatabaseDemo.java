import java.sql.*;  

class DatabaseDemo
{  
	public static void main(String ar[])
	{  
 	try
	{  
   		String url="jdbc:odbc:student";  
   		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  
   		Connection c=DriverManager.getConnection(url);  
   		Statement st=c.createStatement();  
   		ResultSet rs=st.executeQuery("select * from StudentData");  
    
   		while(rs.next())
		{  
    			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));  
			System.out.println(rs.getString(3));  
   		}  
  
	}
	catch(Exception ee)
	{
		System.out.println(ee);
	}  
  	}
}  