package healthsolver;
import java.sql.*;
import java.util.*;
public class View
{
	public void view()
	{
		try
		{
		    	Class.forName("com.mysql.jdbc.Driver");
		    	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/E_health_care?user=root&password=Diksha@07&useSSL=false");
		    	
		    	 String sql="select id,name,gender,age,email,phone_no,city from patient where id=?";
		    	 PreparedStatement st=conn.prepareStatement(sql);
		          Scanner scan=new Scanner(System.in);
		          System.out.println("enter your patient_id");
		          int id=scan.nextInt();
				 st.setInt(1,id);
				 ResultSet rs=st.executeQuery();
		    	 while(rs.next())
		    	 {
		    		  
		    		 System.out.println("Patient Id is :="+id);
		    		 String name=rs.getString("name");
		    		 System.out.println("Name :="+ name);
		    		 String gender=rs.getString("gender");
		    		 System.out.println("Gender :="+gender);
		    		 int age=rs.getInt("age");
		    		 System.out.println("Age :="+age);
		    		 String email=rs.getString("email");
		    		 System.out.println("Email address :="+email);
		    		 String number=rs.getString("phone_no");
		    		 System.out.println("Mob number:="+number);
		    		 String city=rs.getString("city");
		    		 System.out.println("City :="+city);
		    		
		    		 System.out.println();
		    		 System.out.println();
		    		 System.out.println();
		    		 
		    	 }
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
