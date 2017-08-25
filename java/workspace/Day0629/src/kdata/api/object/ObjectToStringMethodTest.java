package kdata.api.object;

public class ObjectToStringMethodTest {

	public static void main(String[] args) {
		
		
		//toString�� getclass.getName @ hashCode �� �����°�
		Object o = new Object();
		System.out.println(o.toString());
		System.out.println(o);
		
		Object o2 = new Object();
		System.out.println(o2.toString());
		System.out.println(o2);
		
		Car c = new Car(1,"red");
		System.out.println(c.toString());
		System.out.println(c);
		
		System.out.println(o.getClass());
		System.out.println(c.getClass());
		
		//10������ ����
		System.out.println(o.hashCode());
		System.out.println(c.hashCode());
		
		
		//stringŬ�������� �������̵��� �ؼ� �̷��� ������ ����������
		String s = new String("Hello");
		System.out.println(s.toString());
		System.out.println(s);
		
	}

}
