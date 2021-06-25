package Sqll;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertRows {
   private static String name;

public static void main(String n[]) {
	   Connection connection= NewSql.getConnection();
   	try {
			
   	        Scanner sc=new Scanner(System.in);	
		    PreparedStatement ps= connection.prepareStatement("insert into student values(?,?,?)");
   		    do {
   		  
            System.out.println("Enter sno");
            int sno=Integer.parseInt(sc.next());
            if(sno<=0)
            	break;
            System.out.println("Enter id");
            int id=Integer.parseInt(sc.next());
            System.out.println("Enter name");
            String city=sc.next();
            ps.setInt(1, sno);
            ps.setInt(2, id);
          
			ps.setString(3, name);
            ps.execute();
   		    }while(true);
            
   	}
   	catch(SQLException e) {
   		e.printStackTrace();
   	}
   	
   }
}
