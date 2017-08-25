package kdata.api.object;

public class ObjectEqualsMethodTest {

	public static void main(String[] args) {
		
		//o1,o2,o3�� ���ؿ� ����
		//new 2���� ���� ����
		Object o1 = new Object();
		Object o2 = new Object();
		Object o3 = o1;
		
		//�ѻ����� ������ ����Ŵ - �׷��� false
		System.out.println(o1 == o2);
		System.out.println(o1 == o3);
		
		System.out.println(o1.equals(o2));
		System.out.println(o1.equals(o3));
		
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		//�ΰ��� ����� �ٸ���
		//==�� �ּҷ� ��
		//equals�� �ٸ������� stringŬ�������� �������̵��� �Ǿ�����
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		Car c1 = new Car(1,"red");
		Car c2 = new Car(1,"red");
		
		//���� ���� �Ȱ��� ����
		//car�� �������̵� ���ؼ� object�� equals�� ȣ��Ǽ� ����
		//object�� equals�� �ּҸ� ���ϴ� ��
		//car���� equals�� �������̵� ���ָ� ���� �������� ã�� �� ����
		System.out.println(c1==c2);
		System.out.println(c1.equals(c2));

	}

}
