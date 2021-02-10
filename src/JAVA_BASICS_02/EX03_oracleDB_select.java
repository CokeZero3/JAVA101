package JAVA_BASICS_02;

import java.sql.*;

public class EX03_oracleDB_select  {
    public static void main(String[] args) {
    	String driver = "oracle.jdbc.driver.OracleDriver";
    	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
    	String user = "c##cokezero" ;
    	String password ="1234";
  	
		Connection conn = null; //DB연결 
		PreparedStatement pstmt = null; //매개 변수를 이용한 SQL문장
		ResultSet rs = null; // SELECT 결과 저장 Result Set 변수
    	Statement stmt = null; // 테이블 생성 SQL문장
    	Statement stmt2 = null; // SELECT 문
    	
    	String SQL = "SELECT * from member";
    	
    	// SQL 관련 메소드 사용시 SQLException 예외를 처리해야 함
        try {
        	//1) 드라이버 로딩 
			Class.forName(driver); 
			//2) DB연결
        	conn= DriverManager.getConnection(url, user, password); 
			System.out.println("~오라클DB서버 연결 성공~"); 
        	
			//3) SQL문
			
			pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
			}
			
			
			
        } catch (Exception e) {
            System.out.println(e.getMessage());

          // 예외와 상관없이 메모리에서 해제하기 위해 finally문에 작성
        } finally {
            // close() 역시 예외 처리가 필요함
            try {
                // 메모리 해제
                rs.close();
                stmt2.close();
                pstmt.close();
                stmt.close();
                conn.close();

            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }
}