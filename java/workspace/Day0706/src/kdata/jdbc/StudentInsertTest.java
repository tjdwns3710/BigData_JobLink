package kdata.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentInsertTest {

	public static void main(String[] args) {
		
		//1. JDBC �ε�
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("JDBC ����̹� �ε� ����");
		} catch(SQLException e){
			e.printStackTrace();
			System.out.println("JDBC ����̹� �ε� ����");
		}
	
		//2. �����ͺ��̽� ���� ����
		Connection con = null;
		try{
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost",");
			System.out.println("�����ͺ��̽� ���� ���� ����");
		} catch (SQLException e){
			e.printStackTrace();
			System.out.println("�����ͺ��̽� ���� ���� ����");
		}
		
		//3. Statement ��ü ����
		Statement st = null;
		try{
			st = com.createStatement();
		}catch(SQLExeption e){
			e.printStackTrace();
		}
		
		
		//4. SQL�� ����
		int result = 0;
		try{
			String sql = 
		}
		
		//5.���ó��
		
		//6.��������
		st.close();
		con.close();

	}

}
