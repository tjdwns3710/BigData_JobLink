package kdata.jdbc;

import java.sql.SQLException;

public class StudentInsertTest2 {

	public static void main(String[] args) {
		//	1,2�� ����
		
		//3. STATEMENT ��ü ����
		String sql = "insert int student values(?,?,?)";
		PrepareStatement pstmt = null;
		try{
			pstmt = con.prepareStatement(sql); 
		}catch (SQLException e){
			e.printStackTrace();
		}
		
	
		
		//  4.sql�� ����
		try{
			//��Ī�� ������(?�� 3�� ������ 3�� ��Ī ������,������ ���,Ÿ��)
			pstmt.setString(1,id);//1�� ����ǥ
			pstmt.setString(2,name);
			pstmt.setString(3,gender);
			
			int result = pstmt.executeUpdate();
			//pstmt.executeQuery();
		}catch (SQLException e){
			e.printStackTrace();
		}
		
		// 5. ���ó��
		if(result == 0)
			
		else
		
		
		// 6. ��������
		pstmt.close();
		con.close();
		
	}
	

}
