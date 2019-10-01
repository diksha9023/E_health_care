package healthsolver;
import java.sql.*;
import java.util.*;
public class Update 
       {
           public void update()
           {
            	try
            	{
            		String sql="UPDATE patient SET password=?,CPASS=? WHERE id=?";
            		Class.forName("com.mysql.jdbc.Driver");
            		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/E_health_care?user=root&password=Diksha@07&useSSL=false");
            		PreparedStatement st=conn.prepareStatement(sql);
            		int rs= st.executeUpdate();
                      Scanner scan=new Scanner(System.in);
                    	System.out.println("enter patient id");
                    	int id=scan.nextInt();
                    	System.out.println("enter new password");
                    	String password=scan.next();
                    	System.out.println("repeat password");
                    	String rpwd=scan.next();
                    	st.setString(1,password);
                    	st.setString(2,rpwd);
                    	st.setInt(3,id);
            		    if(password.contentEquals(rpwd))
            		    {
            		    	System.out.println("Password updated");
            		    }
            		    else
            		    {
            		    	System.out.println("mismatch");
            		    }		
                    	
            	}
            	
            	catch(Exception e)
            	{
            		System.out.println(e);
            		
            	}
            	
            	
            	
            	
            	
            	
            }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
        }
