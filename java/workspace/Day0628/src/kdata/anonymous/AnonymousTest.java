package kdata.anonymous;

public class AnonymousTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�������̽��� ��ü������ �Ұ��������� ������ �ϸ鼭 Ŭ���� ���Ǹ� �ϸ� ������
		//�̸��� ��� �ǽ�������� ����
		// Ŭ�����̸��� ���� ��ü�̸��� ����
		//�� Ŭ������ �ѹ� �� ���� ���� ���µ� ��Ӿ����� m�̶�� ��ü �̸��� ������ ����(29~40)
		//��ü�̸� ���°� - �ѹ� �����
		new Movable(){
			
			@Override
			public void move(){
				
				System.out.println("Anonymous");
				
			}
		}.move();
		
		

	}

}
		//��ü�̸� �ִ°� - ������ �����
		/*Movable m = new Movable(){

			@Override
			public void move() {
				// TODO Auto-generated method stub
				System.out.println("Anonymous");
		
			}
	
		};

		m.move();
	}*/
