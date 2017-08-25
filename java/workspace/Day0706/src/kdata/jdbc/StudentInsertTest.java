package kdata.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentInsertTest {

	public static void main(String[] args) {
		
		//1. JDBC 로드
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("JDBC 드라이버 로드 성공");
		} catch(SQLException e){
			e.printStackTrace();
			System.out.println("JDBC 드라이버 로드 실패");
		}
	
		//2. 데이터베이스 서버 연결
		Connection con = null;
		try{
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost",");
			System.out.println("데이터베이스 서버 연결 성공");
		} catch (SQLException e){
			e.printStackTrace();
			System.out.println("데이터베이스 서버 연결 실패");
		}
		
		//3. Statement 객체 생성
		Statement st = null;
		try{
			st = com.createStatement();
		}catch(SQLExeption e){
			e.printStackTrace();
		}
		
		
		//4. SQL문 전송
		int result = 0;
		try{
			String sql = 
		}
		
		//5.결과처리
		
		//6.접속종료
		st.close();
		con.close();

	}

}
