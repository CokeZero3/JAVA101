package JAVA_BASICS_02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EX02_oracleDB_insert {

	public static void main(String[] args) {
		String url ="jdbc:oracle:thin:@localhost:1521:orcl"; //포트번호 1521, 본인지칭 아이피 : 27.0.0.1 이나 localhost 
		String user ="c##cokezero"; 
		String password="1234"; 
		String driver ="oracle.jdbc.driver.OracleDriver";
		
		Connection con=null; //DB연결 
		PreparedStatement pstmt=null; //SQL변환 
		ResultSet rs=null;

		try{ 
			//1) 드라이버 로딩 
			Class.forName(driver); 
			
			//2) DB연결 
			con= DriverManager.getConnection(url, user, password); 
			System.out.println("~오라클DB서버 연결 성공~"); 
			
			//3) 실행할 쿼리 정의
			String sql = "insert into person"
					+ "(idx, lastname, firstname)"
					+ "values"
					+ "(idx_tmp_seq.NEXTVAL, ?, ?)";
			
			//4) 쿼리를 데이터 베이스로 전송하는 PreparedStatement 객체 획득하기
			pstmt = con.prepareStatement(sql);
					
			}catch(Exception e){ 
				System.out.println("!실패!" + e); 
			
			}finally{ //자원반납 
				try{ 
					if(rs!=null){rs.close();}
				}catch(Exception e){} 
				try{ 
					if(pstmt != null){pstmt.close();} 
				}catch(Exception e){} 
				try{ 
					if(con!=null){con.close();} 
				}catch(Exception e){} }//try end 
		}//main() end 
	}//class end