package kdata.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kdata.project.dto.User;
import kdata.project.util.DBUtil;

public class UserDAO {
	//싱글턴 패턴----------------------------
	private static UserDAO dao = new UserDAO();
	private User u;
	
	//new할때 생성되는 것을 막아줌 
	private UserDAO() {

	}
	
	public static UserDAO getInstance() {
		return dao;
	}
	// ------------------------------------
	
	//회원가입
	public int insert(User user) throws SQLException {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		int result = 0;
		
		con = DBUtil.getConnection();
		
		try {
			String sql = "insert into clients values(?,?,?,?,default)";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1,user.getId());
			pstmt.setString(2,user.getPwd());
			pstmt.setString(3,user.getName());
			pstmt.setString(4,user.getProfile());
			
			result = pstmt.executeUpdate();
		}finally {
			DBUtil.close(pstmt,con);
		}
		return result;
	}
	
	//회원리스트
	public List<User> selectAll() throws SQLException {
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		
		List<User> list = new ArrayList<>();
		
		try {
			con = DBUtil.getConnection();
			
			String sql = "select * from clients order by id";
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				User u = new User();
				
				u.setId(rs.getString("id"));
				u.setName(rs.getString("name"));
				u.setProfile(rs.getString("profile"));
				u.setRegDate(rs.getDate("reg_date"));
				
				list.add(u);
			}
			
		} finally {
			DBUtil.close(rs, pstmt, con);
		}
		
		return list;
	}
	
	//회원상세정보
	public User selectById(String id) throws SQLException {
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		User u = new User();
		
		try {
			con = DBUtil.getConnection();
			
			String sql = "select * from clients where id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,id);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				
				u.setId(rs.getString("id"));
				u.setPwd(rs.getString("pwd"));
				u.setName(rs.getString("name"));
				u.setProfile(rs.getString("profile"));
				u.setRegDate(rs.getDate("reg_date"));
				
			}
			
		} finally {
			DBUtil.close(rs, pstmt, con);
		}
		
		return u;
	}
	
	//로그인
	public void login() {
		
	}
	
	//회원정보 삭제
	public void delete() {
		
	}
	
	//중복체크
	public int idcheck(String id) throws SQLException{
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		
		try {
			String sql = "select * from clients where id = ?";
			
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1,id);
			rs = pstmt.executeQuery();
			
			//중복됨 사용불가
			if(rs.next()) {
				return 0;
			}
			//중복안됨 사용가능
			else {
				return 1;
			}
			
		} finally {
			DBUtil.close(rs, pstmt, con);
		}
		
	}
	
}
