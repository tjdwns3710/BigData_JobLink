package kdata.ingeritance;

public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle v = new Vehicle();
		v.move();
		
		Car c = new Car();
		//c���忡���� move�� �ΰ��� ����(�θ�Ͱ� �ڱ��)
		//���߿� �ϳ��� �����ؾ��ϴµ� ����ð��� �������°� �������ε�
		c.move();

	}

}
