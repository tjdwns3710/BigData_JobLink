package kdata.jdbc;

public class SugangSelectTest {

	public static void main(String[] args) {
		//�й�		�̸�		�����		����
		//�����ϴ°��� 3.Statement ��ü ����
		String sql = "select st.stu_num,st.stu_name,su.sub_name,si.sign_grade"
				+ " from student st join "
				+ "(select si.stu_num, si.sign_grade, su.sub_name"
				+ " from sign si join subject su on si.sub_code = su.sub_code"
				+ ") j1 on st.stu_num = j1.stu_num;";

	}

}
