package kdata.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class StudentSelectTest {

	public static void main(String[] args) {
		
		try{
			//1.JDBC 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2.데이터베이스 서버 연결
			Connection con = DriverManager.getConnection("");
			
			//3.Statement 객체 생성
			String sql = "select * from student";
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			//4.SQL문 전송
			ResultSet rs = pstmt.excuteQuery();
			
				//행을 하나씩 가리켜야 함
				//cursor가 .next를 만나면 다음 행을 가리키게 됨
				//제대로 가리키면 true를 반환해줌
				//행이 안만들어 져있는데까지 가면 false가 반환됨
				//그래서 while문을 사용 해야함
				//컬럼 하나하나씩 접근 - rs.getString(index이나 컬럼이름 쓰는 방법)
				//""안에 컬럼 이름 - rs.getString("stu_num");
			//while(rs.next() == true) - boolean타입인경우 밑에처럼 쓸 수 있음
			while(rs.next())
				System.out.println(rs.getString("stu_num") + "\t" +
									rs.getString("stu_name") + "\t" + 
									rs.getString("stu_gender") + "\t"
									);
			
			//5.결과 처리
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			//6.데이터베이스 서버 연결 해제
			rs.close();
			pstmt.close();
			con.close();
		}

	}

}
