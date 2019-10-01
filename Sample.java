package healthsolver;
import java.util.*;
import java.sql.*;


public class Sample {
	public void sample()
	{
		try
		{
		  Class.forName("com.mysql.jdbc.Driver");
		  Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/E_health_care?user=root&password=Diksha@07");
		  Statement st=conn.createStatement();
		  
		    
		  String sql="SELECT a_id,pass FROM admin";
		  ResultSet rs=st.executeQuery(sql);
		  Scanner scan=new Scanner(System.in);
		  boolean flag=false;
		  System.out.println("enter username of admin");
        	 String userd=scan.next();
        	 System.out.println("enter password");
        	 String passd=scan.next();
         	 while(rs.next())
         	 {
         		 String u=rs.getString("a_id");
             	 String p=rs.getString("pass");
             	 
         	if(u.equals(userd)&&p.equals(passd))
         	{
         		flag=true;
                System.out.println("Admin login Successfully");  
                System.out.println("How can I help you");
                   System.out.println("Choose disease name");
                   System.out.println("1: Headache");
                   System.out.println("2: Cough ");
                   System.out.println("3: Fever");
                   System.out.println("4: Cold");
                  int n=scan.nextInt();
                  switch(n)
                  {
                  case 1: System.out.println("Take xyz medicine");
                           break;
                  case 2: System.out.println("Take Rapitus plus syrup");
                           break;
                  case 3 :System.out.println("Take sinocold tablet");
                           break;
                  case 4:System.out.println("Take sinarest tablet");
                          break;
                  default:System.out.println("Meet with best doctor for treatment");
                  }        
         	}
         	 }
         	 if(flag==false)
         	 {
         		 System.out.println("incorrect username and password");
         	 }
		st.close();
		conn.close();
		}
	catch(Exception e) 
	{
		System.out.println(e);
	}
}
}
