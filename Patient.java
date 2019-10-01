package healthsolver;
import java.util.Scanner;
import java.lang.*;
public class Patient {
	public static void main(String args[]) throws Exception 
	{
		while(true) {
       Scanner scan=new Scanner(System.in);
          System.out.println("Choose Approriate Option ");
          System.out.println();
            System.out.println("1 :  Login OR Create New Account");
            System.out.println();
            System.out.println("2 :  View Profile");
            System.out.println();
            System.out.println("3 :  Update password");
            System.out.println();
            System.out.println("4 : Chat With Admin ");
            System.out.println();
            System.out.println("5 :  Delete Profile");
            System.out.println();
            System.out.println("6 : Exit");
            
            int var = scan.nextInt();
            switch(var)
            {
            case 1:
            	    System.out.println("Choose proper option");
            	    System.out.println("a :Login");
            	    System.out.println("b :Create New Account");
            	    char r=scan.next().charAt(0);
            	      switch(r)
            	      {
            	      case 'a' :Login m=new Login();
            	                m.login();
            	                break;
            	      case 'b' :Insert i=new Insert();
            	                i.insert();
            	                break;
            	      default: System.out.println("Invalid option");
            	      }
            	      break;
            case 2:   View v=new View();
                      v.view();
                      break;
            case 3:   Update u=new Update();
                      u.update();
                      break;
            case 4:   Sample s=new Sample();
                      s.sample();
                      break;
            case 5:   Delete d=new Delete();
                      d.delete();
                      break;
            case 6:  Exit f=new Exit();
                      f.exit();
            }	      
		}	      	
        }
            
 	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


