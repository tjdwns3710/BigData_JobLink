package kdata.exceptions;

public class RuntimeExceptionTest {

	public static void main(String[] args) {

		
		//�ڹٿ��� �������� �����ϴµ� ������ ����
		//�׷��� ��Ÿ���ͼ����� ���� ���Ѿ� ��
		//���ܰ� ����� ĳġ�� �Ѿ
		//������ ĳġ�� �ȳѾ�� Ʈ���� ���̳θ��� �����
		try{
			System.out.println("try ����");
			System.out.println(2/2);
			
			
			String s = null;
			
			System.out.println(s.charAt(1));
			
			System.out.println("try ��");
			//ĳġ�� ������ ��� ����
		}catch(ArithmeticException e){
			System.out.println("catch - arithmetic");
			
			//finally�� �׻� ������ ��
		}catch(NullPointerException e){
			System.out.println("catch - nullporinter");
		}catch(RuntimeException e){
			e.printStackTrace();
		}
			finally{
			System.out.println("finally");
		}
	}

}
