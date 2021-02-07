package JAVA_BASICS_02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class EX03_oracleDB_read  {
    public static void main(String[] args) {
        // 1. 데이터베이스 연동 클래스 로드
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            //프로그램 정상 종료
            System.exit(0);
        }
         
        //2. 데이터베이스에 접속해서 test1 테이블의 데이터 읽기
         
        //데이터베이스에 접속하기 위한 변수
        Connection con =null;
        //SQL 구문을 실행하기 위한 변수
        Statement stmt =null;
        //Select 구문 실행했을 때 결과를 저장하기 위한 변수
        ResultSet rs =null;
         
        //삽입을 위한 Statement 변수 선언
        PreparedStatement pstmt =null;
        try{
            con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@127.0.0.1:1521:orcl",
                    "id","password");
             
            //sql 문장을 가지고 PreparedStatement 객체 생성
            pstmt = con.prepareStatement(
                    "insert into test1 values(id_sequence.nextval, ?)");
            //?에 데이터를 바인딩
            pstmt.setString(1,"이순신");
            //실행
            int result = pstmt.executeUpdate();
            System.out.println("영향 받은 행의 개수:" + result);
             
            //sql 구문을 실행할 수 있는 객체 생성
            stmt = con.createStatement();
            //select 구문을 실행
            rs = stmt.executeQuery("select * from test1");
            //데이터가 있을 때
            if(rs.next()){
                do{
                    System.out.println(rs.getInt(1) +":" +
                            rs.getString(2));
                }while(rs.next());
            }
            else{
                System.out.println("읽은 데이터가 없습니다.");
            }
             
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            try{
                if(rs !=null)rs.close();
                if(stmt !=null)stmt.close();
                if(con !=null)con.close();
            }
            catch(Exception e){}
        }
 
    }
}