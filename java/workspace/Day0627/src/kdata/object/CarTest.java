package kdata.object;

import java.lang.String;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 선언
		Car c;
		// c는 참조 변수, 스텍에 만들어짐
		
		c = new Car();
		//heap에 만들어짐 - num하고 color가 저장될 준비가 된다.
		
		c.num = 1;
		c.color = "red";
		//String은 원래 밑에 처럼 해야되는데 자주쓰기 때문에 기본형처럼 이렇게 해도됨
		//c.color = new String();
		//만들어지는 메모리는 두개가 다름
		
		//System.out.println(c.color);
		c.print();
		
		Car c2 = new Car();
		
		c2.num = 2;
		c2.color = "white";
		
		//System.out.println(c2.color);
		c2.print();
		
		c2.setColor("black");
		System.out.println(c2.color);

		Car c3 = new Car();
		//System.out.println(c3.color);
		c3.setColor("blue");
		System.out.println(c3.color);
		String s = c3.getColor();
		System.out.println(s);
		
		c3.setNum(3);
		int n = c3.getNum();
		System.out.println(n);
	}

}
