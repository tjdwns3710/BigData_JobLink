package kdata.exceptions;

public class MyRuntimeExceptionTest {

	public static void main(String[] args) {
		
		
		//��Ÿ�� �μ����� ��ӹ޾����ϱ� ����ð��� ��
		//��Ÿ�� �λ����̶� ���ܸ� �ص��ǰ� ���ص� ��
		MyRuntimeException r1 = new MyRuntimeException();
		MyRuntimeException r2 = new MyRuntimeException("�ι�° ����");		
		MyRuntimeException r3 = new MyRuntimeException("����° ����");
		
		//jvm�� �˷���
		//e�� ���̷�Ÿ���ͼ��� ��ü
		try{
			throw r1;
		}catch(MyRuntimeException e){
			System.out.println(e.getMessage());
			
			//����� �ؼ� �̷��� ��
			e.printStackTrace();
		}
		
		//throw r1;
		//throw r2;
		
		//�̰� ��ü�̸��� ����
		//r1�� ����
		//�̷��� ���� ��찡 �� ������ �� ���� ��
		//throw new MyRuntimeException();
		
	}

}
