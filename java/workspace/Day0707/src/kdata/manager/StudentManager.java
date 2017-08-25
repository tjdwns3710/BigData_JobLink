package kdata.manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentManager {
	
	/*��� �Ҷ��� ���� ����� ���� ���⿡ ���� ����
	 * �����ϴ� ��ġ�� �ſ� �߿��� - ������ �˷���
	 *��԰� ������ ���°� ȿ����
	private Connecion con;*/
	
	//�л������߰�
	//��ȯ ���ֱ� ���� ���� student Ŭ������ �������� ��
	public int insert(Student s) throws SQLException {
		//�޼ҵ� ȣ���Ҷ��� ����(�ѹ�)
		Connection con = null;
		PreparedStatement pstmt = null;
		int result = 0;
		//2.db���� ����
		//�����ƿ�� ��Ŀ�ؼ�
		con = DBUtil.getConnection();
	
		try {
		//3.4.�Է¹޴°�
		String sql = "insert into student values(?,?,?)";
		pstmt = con.prepareStatement(sql);
		
		//�����Ű�°�
		//?�� set�� ���ִ� ����
		//(1, s.) .�ڿ��� ���� �����;��ϴϱ� get
		pstmt.setString(1,s.getStuNum());
		pstmt.setString(2,s.getStuName());
		pstmt.setString(3,s.getStuGender());
		
		//5.
		//�ͽ�ť��� ���ڷ� ��ȯ�� �����ϸ� 1 �����ϸ� 0;
		//int result = pstmt.executeUpdate();
		result = pstmt.executeUpdate();
		
		}finally{
		//6.
		//closeȣ�� ������ ��
		DBUtil.close(pstmt,con);
		
		}
		return result;
	}
	
	
	//�л�����Ʈ���
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
		
		//�హ�� ��ŭ ��ƾ� ��
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
		
		//resultset�� Ŭ���� �Ǿ��⶧���� rs�� ����Ʈ�� ��ȯ�ؼ� �����;���
		return list;
		
	}
	/**
	 * 
	 * @param name
	 * @throws SQLException 
	 */
	//���Ϲ��Ⱦ��� ������ �ᵵ��
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
