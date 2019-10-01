package healthsolver;
import java.sql.*;
import java.util.Scanner;
public class Insert {
public void insert()
{
		try
		{
			 String sql=("INSERT INTO PATIENT(id,name,gender,age,email,phone_no,city,USERNAME,password,CPASS)"+"VALUES(?,?,?,?,?,?,?,?,?,?)");
		String query=" select *from patient;";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/E_health_care?user=root&password=Diksha@07&useSSL=false");
		System.out.println("Databse connectivity successful");
		PreparedStatement st=con.prepareStatement(sql);
		
	     Scanner scan =new Scanner(System.in);
	    int id = 0;
	     System.out.println("enter name of patient");
	     String name= scan.next();
	     System.out.println("enter gender");
	     String gender= scan.next();
	     System.out.println("enter age");
	     int age=scan.nextInt();
	     System.out.println("enter email");
	     String email=scan.next();
	     System.out.println("enter mobile number");
	     String phone_no=scan.next();
	     System.out.println("enter your city");
	     String city=scan.next();
	     System.out.println("enter username");
	     String USERNAME=scan.next();
	     System.out.println("enter password");
	     String password=scan.next();
	     System.out.println("confirm password");
	     String CPASS=scan.next();
	    

		st.setInt(1,id);
	     st.setString(2,name);
	     st.setString(3,gender);
	     st.setInt(4,age);
	     st.setString(5,email);
		st.setString(6,phone_no);
		st.setString(7,city);
		st.setString(8,USERNAME);
	     st.setString(9,password);
	     st.setString(10,CPASS);
	    
	   int rs= st.executeUpdate();
	    System.out.println("Information updated successfully"); 
	
	     st.close();
		con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	private static int setInt(int i, int age) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static String setString(int i, String name) {
		// TODO Auto-generated method stub
		return null;
	}
		}