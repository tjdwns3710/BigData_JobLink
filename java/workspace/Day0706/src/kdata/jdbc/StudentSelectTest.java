package kdata.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class StudentSelectTest {

	public static void main(String[] args) {
		
		try{
			//1.JDBC ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2.�����ͺ��̽� ���� ����
			Connection con = DriverManager.getConnection("");
			
			//3.Statement ��ü ����
			String sql = "select * from student";
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			//4.SQL�� ����
			ResultSet rs = pstmt.excuteQuery();
			
				//���� �ϳ��� �����Ѿ� ��
				//cursor�� .next�� ������ ���� ���� ����Ű�� ��
				//����� ����Ű�� true�� ��ȯ����
				//���� �ȸ���� ���ִµ����� ���� false�� ��ȯ��
				//�׷��� while���� ��� �ؾ���
				//�÷� �ϳ��ϳ��� ���� - rs.getString(index�̳� �÷��̸� ���� ���)
				//""�ȿ� �÷� �̸� - rs.getString("stu_num");
			//while(rs.next() == true) - booleanŸ���ΰ�� �ؿ�ó�� �� �� ����
			while(rs.next())
				System.out.println(rs.getString("stu_num") + "\t" +
									rs.getString("stu_name") + "\t" + 
									rs.getString("stu_gender") + "\t"
									);
			
			//5.��� ó��
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			//6.�����ͺ��̽� ���� ���� ����
			rs.close();
			pstmt.close();
			con.close();
		}

	}

}
