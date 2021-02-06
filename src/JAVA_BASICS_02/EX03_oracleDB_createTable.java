package JAVA_BASICS_02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EX03_oracleDB_createTable  {
	final static String DRIVER = "";
	final static String DB = "";
	final static String createTable = 
			"";
	final static String DROPSQL = "DROP TABLE login";
	
	public static void main(String[] args) {
		try {
			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(DB);
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(DROPSQL);
			stmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
			

}
