package kdata.ingeritance;

//vehicle(����Ŭ����,�θ�Ŭ����)
//���⿡�� ������������ vehicle�� �ʵ� 2���� �ִ�
//������������ 11���� object��
public class Car extends Vehicle {
	String name;
	
	//�⺻������(��� �ڵ����� ����� ��)
	/*Car(){
		//�θ� Ŭ������ �����ڸ� ȣ��(�Ű������� ���¾�)
		//vehicle�� �������߿� �Ű������� ���°� ����ų�(overload)
		//�� Ŭ������ �����ڸ� ����� ���� vehicle�� ȣ�� ���ִ� ������ ��������
		super();
	}*/
	
	//super�� �����־ �θ�Ŭ������ �����ڸ� ȣ���ϰ� ���ִ�
	/*Car(int door){
		super(door);
		System.out.println("Car()");
	}*/
	
	/*Car(){
		super(1); //�̰� ���� �Ǿ�����
		System.out.println("Car()");
	}*/
	
	
	//���� ����� �ٸ��� �ϰ� �̸��� ���� �ϴ°�
	@Override
	void move(){
		//�θ��� override�� ���� ��ɿ� +�ϴ� ���� super.move();
		//��Ȳ�� ���� ��
		super.move();
		System.out.println("Car move()");
	}
	
}
