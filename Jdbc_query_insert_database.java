

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



public class Jdbc_query_insert_database {

	public static void main(String[] args) throws Exception {


		String url = "jdbc:mysql://localhost:3306/eee";
		String uname = "root";
		String pass = "shakil**";
		String query = "select * from student1";
		

		
		st.close();
		con.close();
		
		
		
	}

}
