package kdata.api.object;

public class WrapperClassTest {

	public static void main(String[] args) {
		
		//i는 객체가 아니라서 i.을 쓸 수 없음
		int i = 10;
		//boxing
		Integer i2 = new Integer(i);
		
		i2.intValue();
		
		Integer i3 = 10;
		
		String s1 = "10";
		String s2 = "20";
		System.out.println(s1+s2);
		
		//parserInt는 스태틱
		//trycatch문 안써도 되니까 런타임 익셉션
		//문자열이 숫자가 아니고 문자나 널일때 익셉션발생
		/*int a1 = Integer.parseInt(s1);
		int a2 = Integer.parseInt(s2);
		
		System.out.println(a1+a2);*/
		
		//이렇게 한줄에 쓸 수 있음
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
		
		//Double.parseDouble(s)
	}

}
