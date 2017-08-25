package kdata.manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentManager {
	
	/*사용 할때만 쓰고 지우기 위해 여기에 쓰지 않음
	 * 선언하는 위치가 매우 중요함 - 수명을 알려줌
	 *써먹고 연결을 끊는게 효율적
	private Connecion con;*/
	
	//학생정보추가
	//반환 해주기 위해 쉽게 student 클래스를 만들어줘야 함
	public int insert(Student s) throws SQLException {
		//메소드 호출할때만 생성(한번)
		Connection con = null;
		PreparedStatement pstmt = null;
		int result = 0;
		//2.db서버 연결
		//디비유틸의 갯커넥션
		con = DBUtil.getConnection();
	
		try {
		//3.4.입력받는것
		String sql = "insert into student values(?,?,?)";
		pstmt = con.prepareStatement(sql);
		
		//실행시키는것
		//?에 set을 해주는 것임
		//(1, s.) .뒤에는 값을 가져와야하니까 get
		pstmt.setString(1,s.getStuNum());
		pstmt.setString(2,s.getStuName());
		pstmt.setString(3,s.getStuGender());
		
		//5.
		//익스큐즈는 숫자로 반환됨 성공하면 1 실패하면 0;
		//int result = pstmt.executeUpdate();
		result = pstmt.executeUpdate();
		
		}finally{
		//6.
		//close호출 해줘햐 함
		DBUtil.close(pstmt,con);
		
		}
		return result;
	}
	
	
	//학생리스트출력
	public List<Student> selectAll() throws SQLException {
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;

		
		List<Student> list = new ArrayList<>();
		
		try {
		
		//2.
		con = DBUtil.getConnection();
		
		//3. 4.
		String sql = "select * from student order by stu_num";
		pstmt = con.prepareStatement(sql);
		
		rs = pstmt.executeQuery();
		
		//행갯수 만큼 담아야 함
		while(rs.next()) {
			Student s2 = new Student(rs.getString("stu_num"),rs.getString("stu_name"),rs.getString("stu_gender") );
			/*s.setStuNum(rs.getString("stunum"));
			s.setStuName(rs.getString("stuname"));
			s.setStuGender(rs.getString("stugender"));*/
			list.add(s2);
		}
		
		
		
		} finally {
			DBUtil.close(rs, pstmt, con);
			
		}
		
		//resultset이 클로즈 되었기때문에 rs를 리스트로 반환해서 가져와야함
		return list;
		
	}
	/**
	 * 
	 * @param name
	 * @throws SQLException 
	 */
	//와일문안쓰고 이프문 써도됨
	public Student selectByName(String name) throws SQLException {
		Connection con = null;
		ResultSet rs = null;
	
		String sql = "select * from student where name = ?";
		
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		rs = pstmt.executeQuery();
		
		Student s2 = new Student(rs.getString("stunum"),rs.getString("stuname"),rs.getString("stugender") );
		/*s.setStuNum(rs.getString("stu_num"));
		s.setStuName(rs.getString("stu_name"));
		s.setStuGender(rs.getString("stu_gender"));*/
		
		return s2;
	}

}
