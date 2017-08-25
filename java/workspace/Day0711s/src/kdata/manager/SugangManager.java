package kdata.manager;
//3,4,5
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SugangManager {
	//수강 신청
	public int insert(Sugang s) throws SQLException {
	
		Connection con = null;
		PreparedStatement pstmt = null;
		int result = 0;
	
		con = DBUtil.getConnection();
	
		try {
		String sql = "insert into (select j1.sub_code, su.SUB_NAME, j1.stu_name, j1.sign_grade, j1.sign_date"+
" from subject su join (select si.sub_code, si.STU_NUM, st.STU_NAME, si.SIGN_GRADE, si.SIGN_DATE"+
" from sign si join student st on si.stu_num = st.stu_num) j1"+
" on j1.sub_code = su.sub_code) values(?,?,?,?,?,default)";
		pstmt = con.prepareStatement(sql);
		
		pstmt.setString(1,s.getSubCode());
		pstmt.setString(2,s.getSubName());
		pstmt.setString(3,s.getStuNum());
		pstmt.setString(4,s.getStuName());
		pstmt.setInt(5,s.getSignGrade());
		
	
		result = pstmt.executeUpdate();
		
		}finally{
		DBUtil.close(pstmt,con);
		
		}
		return result;
	}
	
	//수강리스트 출력
	public List<Sugang> selectAll() throws SQLException {
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;

		List<Sugang> list = new ArrayList<>();
		
		try {
	
		con = DBUtil.getConnection();
		
		String sql = "select su.sub_code, sub_name, si.stu_num, stu_name, sign_grade, sign_date from student st inner join sign si on st.stu_num = si.stu_num inner join subject su on si.sub_code = su.sub_code";
		//과목번호,과목명,학번,이름,성적,신청일 로 나오게 조인
		/*String sql = "select j1.sub_code, su.SUB_NAME, j1.stu_name, j1.sign_grade, j1.sign_date
from subject su join (select si.sub_code, si.STU_NUM, st.STU_NAME, si.SIGN_GRADE, si.SIGN_DATE
from sign si join student st on si.stu_num = st.stu_num) j1
on j1.sub_code = su.sub_code;";*/
		pstmt = con.prepareStatement(sql);
		
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			Sugang s = new Sugang(rs.getString("sub_code"),rs.getString("sub_Name"),rs.getString("stu_num"),
					rs.getString("stu_name"),rs.getInt("sign_grade"),rs.getDate(6));

			list.add(s);
		}
		
		
		} finally {
			DBUtil.close(rs, pstmt, con);
			
		}
		
		//resultset이 클로즈 되었기때문에 rs를 리스트로 반환해서 가져와야함
		return list;
		
	}
	
	//과목 리스트 
	public List<Sugang> selectList() throws SQLException {
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;

		List<Sugang> list = new ArrayList<>();
		
		try {
		con = DBUtil.getConnection();
		String sql = "select * from subject order by sub_code";
		
		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			Sugang s = new Sugang(rs.getString("sub_Code"),rs.getString("sub_Name"));
			list.add(s);
		}
		} finally {
			DBUtil.close(rs, pstmt, con);
		}
		return list;
	}
}
