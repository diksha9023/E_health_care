package healthsolver;
import java.sql.*;
import java.util.*;
public class Login
{
         public void login() throws Exception
         {
            	
            	try {
            	 boolean flag=false;
            
	           String sql=" select username,password from patient";
            	Class.forName("com.mysql.jdbc.Driver");
            	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/E_health_care?user=root&password=Diksha@07&useSSL=false");
            	PreparedStatement st=conn.prepareStatement(sql);
            	ResultSet rs=st.executeQuery();
            	Scanner scan=new Scanner(System.in);
            	System.out.println("enter username");
           	 String username=scan.nextLine();
           	 System.out.println("enter password");
           	 String password=scan.nextLine();
           	 String u;
    		 String p;
            	 while(rs.next())
            	 {
            		
            		 u=rs.getString("USERNAME");
                	 p=rs.getString("password");
                	 
            	if(u.equals(username)&&p.equals(password))
            	{
            		flag=true;
                   System.out.println("Loggin successfully");           		
            	}
            	
            	 }
            	 if(flag==false)
            	 {
            		 System.out.println("Incorrect username and password");
            	 }
            	 st.close();
            	 conn.close();
            	}
               catch(Exception e)
            		   {
	                        e.printStackTrace();
                        }
      	}
            	}
            		


