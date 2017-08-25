package kdata.jdbc;

import java.sql.SQLException;

public class StudentInsertTest2 {

	public static void main(String[] args) {
		//	1,2번 동일
		
		//3. STATEMENT 객체 생성
		String sql = "insert int student values(?,?,?)";
		PrepareStatement pstmt = null;
		try{
			pstmt = con.prepareStatement(sql); 
		}catch (SQLException e){
			e.printStackTrace();
		}
		
	
		
		//  4.sql문 전송
		try{
			//매칭을 시켜줌(?가 3개 있으면 3번 매칭 시켜줌,순서를 기억,타입)
			pstmt.setString(1,id);//1번 물음표
			pstmt.setString(2,name);
			pstmt.setString(3,gender);
			
			int result = pstmt.executeUpdate();
			//pstmt.executeQuery();
		}catch (SQLException e){
			e.printStackTrace();
		}
		
		// 5. 결과처리
		if(result == 0)
			
		else
		
		
		// 6. 접속종료
		pstmt.close();
		con.close();
		
	}
	

}
