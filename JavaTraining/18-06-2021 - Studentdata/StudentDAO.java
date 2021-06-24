package com.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sun.jdi.connect.spi.Connection;

public class StudentDAO {
	private final static java.sql.Connection connection=NewSql.getConnection();
	public static boolean insert(Student s) {
		try {
			
			PreparedStatement preparedStatement=connection.prepareStatement("insert into student values(?,?,?)");
			preparedStatement.setInt(1, s.getSNO());
			preparedStatement.setInt(2, s.getSID());
			preparedStatement.setString(3, s.getNAME());
			preparedStatement.execute();
			return true;
		}
		catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
	} 
	
	public static List<Student> getStudent(){
		
		
try      {
	        List<Student> l=new ArrayList<Student>();
		    ResultSet rs=connection.createStatement().executeQuery("select * from student");
		    while(rs.next()) {
		    	Student s=new Student();
		    	s.setSNO(rs.getInt(1));
		    	s.setSID(rs.getInt(2));
		    	s.setNAME(rs.getString(3)); 	
		    	l.add(s);
		    }
		    
		    return l;
		}
		catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

}
