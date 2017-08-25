package kdata.project.util;
//javadoc
/**
 * DB ���� ���� �����ϴ� Ŭ����(1,2,6)
 * @author cse
 *
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {
	//�����ϴ� ���� ����
	//jdbc�ε�� �ѹ��� �ε��ϸ� ��
	//static�� �� ���� �����̵�
	
	/*//�ε� �� �� �������--Ŭ����(�޼ҵ�)������ �޸� �������
	//private static int a;
	
	//new�Ҷ� ���� �������
	//private int b;*/
	
	private static final String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
	private static final String CON_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER_ID = "final";
	private static final String USER_PWD = "1234";
	
	//Ŭ���� �ε��Ҷ� �ѹ��� �����Ű�� ��
	//Ŭ������ �ϳ� ���鶧
	static {
		try {
			Class.forName(DRIVER_NAME);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	/**
	 * �����ͺ��̽� ���� �����ϴ� �޼ҵ�
	 * @return Connection ������ ���̽� ���� ���� ��ü ��ȯ
	 * @throws SQLException
	 */
	//��ü�� ���� ���� �ʾƵ� ��
	public static Connection getConnection() throws SQLException {
		/*Connection con = DriverManager.getConnection("","","");
		return con; ���� ���ٷ� ����*/
		//()���� ������ �ᵵ �ǰ� ����� ����� ����
		//static�پ������� Ŭ�����̸�.(DBUtil.CON_URL)���� ��� ��
		return DriverManager.getConnection(CON_URL,USER_ID,USER_PWD);
	}
	/**
	 * ������ ���̽� ����� ����� �ڿ� ����
	 * @param
	 * @return
	 * 
	 */
	//�ݴ� ���� ����
	//��ü�� ������ ������ ����
	//con�̶� pstmt�� �����ؾ��ϴµ� �Ŵ������� �����;� ��
	public static void close(PreparedStatement pstmt,Connection con) {
		if(pstmt != null)
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		if(con != null)
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	public static void close(ResultSet rs,PreparedStatement pstmt,Connection con) throws SQLException {
		if(rs != null) {
			rs.close();
		}
		if(pstmt != null) {
			pstmt.close();
		}
		if(con != null) {
			con.close();
		}
	}

}
