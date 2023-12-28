package spring_java_1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.sql.*;


import com.mysql.cj.jdbc.DatabaseMetaData;



public class Jdbc_1 {

	public static void main(String[] args) throws Exception {


		String url = "jdbc:mysql://localhost:3306/eee";
		String uname = "root";
		String pass = "shakil**";
		String query = "select * from student1";
		
		//Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		
		Statement st = con.createStatement();
		//Statement st1 = con.createStatement();
		//st.executeQuery(query);
		
		ResultSet rs = st.executeQuery(query);
		//ResultSet rs1 = st1.executeQuery(query);
		
		
		String userdata;
		rs.next();
		userdata = rs.getString(1) + ":" + rs.getString(2) + ":" + rs.getString(3);
		System.out.println(userdata);
		
		rs.next();
		userdata = rs.getString(1) + ":" + rs.getString(2) + ":" + rs.getString(3);
		System.out.println(userdata);
		
		
		/*while(rs.next()) {
			String name = rs.getString("ID") + ":" + rs.getString("Name") + ":" + rs.getString("Dept");
			System.out.println(name);
		}
		
		while(rs.next()) {
		//rs.next();
			String name = rs.getString("ID");
			
			//String name1 = rs.getString("Name");
			
			System.out.println(name);
			//System.out.println(name1);
		
		}
		
		while(rs.next()) {
			//rs.next();
				//String name = rs.getString("ID");
				
				String name1 = rs.getString("Name");
				
				//System.out.println(name);
				System.out.println(name1);
			
			}
		*/
		
		st.close();
		con.close();
		
		
		
	}

}
