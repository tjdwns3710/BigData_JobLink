package kdata.exceptions;

public class CompileTimeExceptionTest {

	public static void main(String[] args) {
		
		//�����ҰŸ� try, �������� throws
		try {
			
			//a��� Ŭ������ ã����µ� �����ϱ� ĳġ�� ����
			Class.forName("a");
		} catch (ClassNotFoundException e) {

			//e�� ��ü�� ��ƿ��ϱ� e.�� ����� �� ����
			//������� ������ �������� �˷� �ִ°���
			//e.printStackTrace();
		}

	}

}
