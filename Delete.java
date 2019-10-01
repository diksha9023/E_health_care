package healthsolver;
import java.sql.*;
import java.util.*;

public class Delete
{

 public void delete()
 {
 try
 {
  Class.forName("com.mysql.jdbc.Driver");
   Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/E_health_care?user=root&password=Diksha@07");
   String sql="DELETE FROM patient WHERE id=?";
   PreparedStatement st=conn.prepareStatement(sql);
   
   Scanner scan = new Scanner(System.in);
   System.out.println("Enter patient id");
   int id=scan.nextInt();
  st.setInt(1,id);
   st.executeUpdate();
   System.out.println("Record Deleted Successfully");
 }
 catch(Exception e)
 {
	 System.out.println(e);
 }
}
}