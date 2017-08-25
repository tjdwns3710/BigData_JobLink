package kdata.api.object;

public class ObjectEqualsMethodTest {

	public static void main(String[] args) {
		
		//o1,o2,o3는 스텍에 저장
		//new 2개는 힙에 저장
		Object o1 = new Object();
		Object o2 = new Object();
		Object o3 = o1;
		
		//둘사이의 번지를 가리킴 - 그래서 false
		System.out.println(o1 == o2);
		System.out.println(o1 == o3);
		
		System.out.println(o1.equals(o2));
		System.out.println(o1.equals(o3));
		
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		//두개의 결과가 다르다
		//==는 주소로 비교
		//equals는 다른이유가 string클래스에서 오버라이딩이 되어있음
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		Car c1 = new Car(1,"red");
		Car c2 = new Car(1,"red");
		
		//둘의 값이 똑같이 나옴
		//car에 오버라이딩 안해서 object의 equals가 호출되서 같음
		//object의 equals는 주소를 비교하는 것
		//car에서 equals를 오버라이딩 해주면 값이 같은걸을 찾을 수 있음
		System.out.println(c1==c2);
		System.out.println(c1.equals(c2));

	}

}
