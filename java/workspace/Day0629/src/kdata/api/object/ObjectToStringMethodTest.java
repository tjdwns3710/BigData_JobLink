package kdata.api.object;

public class ObjectToStringMethodTest {

	public static void main(String[] args) {
		
		
		//toString은 getclass.getName @ hashCode 로 나오는것
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
		
		//10진수로 나옴
		System.out.println(o.hashCode());
		System.out.println(c.hashCode());
		
		
		//string클래스에서 오버라이딩을 해서 이렇게 나오게 만들어놓은것
		String s = new String("Hello");
		System.out.println(s.toString());
		System.out.println(s);
		
	}

}
