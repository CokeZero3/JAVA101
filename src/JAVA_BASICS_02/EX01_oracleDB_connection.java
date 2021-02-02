package JAVA_BASICS_02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EX01_oracleDB_connection {
	public static void main(String[] args) {
		//오라클DB서버 접근 기본 정보 
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
			
			//3) SQL문 작성 
			StringBuilder sql=new StringBuilder(); 
			String uname="박지성"; 
			
			int kor=50, eng=60, mat=65; 
			int tot=kor+eng+mat; 
			int aver=tot/3; 
			String addr="Suwon"; 
			sql.append(" INSERT INTO sungjuk(sno, uname, kor, eng, mat, tot, aver, addr, wdate) "); 
			sql.append(" VALUES(sungjuk_seq.nextval, ?, ?, ?, ?, ?, ?, ?, sysdate)"); 
			//4) SQL문 변환 
			
			pstmt=con.prepareStatement(sql.toString()); 
			pstmt.setString(1, uname);
			pstmt.setInt(2, kor); 
			pstmt.setInt(3, eng); 
			pstmt.setInt(4, mat); 
			pstmt.setInt(5, tot); 
			pstmt.setInt(6, aver); 
			pstmt.setString(7, addr); 
			
			//5) SQL문 실행 
			
			int cnt=pstmt.executeUpdate(); 
			if(cnt==0){ //cnt가 0이 됐다는 것은 행추가를 하지 못했다는 의미 
				
				System.out.println("행추가 실패TT"); 
				
			}else{
				
				System.out.println("~행추가 성공~"); }//if end 
			
			}catch(Exception e){ 
				System.out.println("!실패!" + e); 
			
			}finally{ //자원반납 
				try{ 
					if(rs!=null){rs.close();}
				}catch(Exception e){} 
				try{ 
					if(pstmt!=null){pstmt.close();} 
				}catch(Exception e){} 
				try{ 
					if(con!=null){con.close();} 
				}catch(Exception e){} }//try end 
		}//main() end 
	}//class end



