package kdata.exceptions;


//������ Ÿ�� �ͼ���
public class MyExceptionTest {

	public static void main(String[] args) {
		
		MyException r1 = new MyException("ù��° ����");
		
		try {
			throw new MyException("ù��° ����");
		} catch (MyException e) {
			
			e.printStackTrace();
		}
	}

}
