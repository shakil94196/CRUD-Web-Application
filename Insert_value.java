package jdbc_1;





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



public class Insert_value {

	public static void main(String[] args) throws Exception {


		String url = "jdbc:mysql://localhost:3306/eee";
		String uname = "root";
		String pass = "shakil**";
		
		String id = "CE20046";
		String name = "Faiza";
		String dept = "CSE";
		String balance ="20000";
		
		String query = "insert into student1 values ('"+ id + "','" + name + "','" + dept + "','" + balance + "')";
		

		Connection con = DriverManager.getConnection(url,uname,pass);
		
		Statement st = con.createStatement();
		
		int count = st.executeUpdate(query);
		
		System.out.println(count + " row's affected");
		
		//Statement st1 = con.createStatement();
		//st.executeQuery(query);
		
		//ResultSet rs = st.executeQuery(query);
		//ResultSet rs1 = st1.executeQuery(query);
		
		st.close();
		con.close();
		
		
		
	}

}
