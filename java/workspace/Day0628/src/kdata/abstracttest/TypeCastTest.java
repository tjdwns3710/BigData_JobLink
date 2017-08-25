package kdata.abstracttest;

public class TypeCastTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//형변환 테스트
		//instanceof 테스트(형변환이 가능한지)
		Marine m = new Marine();
		
		//System.out.println(m instanceof Marine);
		//System.out.println(m instanceof Medic); //메딕과 전혀 상관없어서 안됨
		//System.out.println(m instanceof Unit);
		//System.out.println(m instanceof Object);
		
		//자동 형변환
		//자식을 부모로 형변환 - 형변환 연산자 생략가능
		//마린으로 만들어서 유닛타입의 형태로 만듬
		//마린 객체가 만들어져서 유닛이 가리키고있음
		Unit u = new Marine();
		u.move();
		
		Unit u2 = new Medic();
		u2.move();
		
		System.out.println(u instanceof Unit);
		//부모인 u를 자식인 마린으로 바꾸려면 강제 형변환 해야한다
		System.out.println(u instanceof Marine);
		
		//강제 형변환 - 형변환 연산자 생략불가
		//부모를 자식으로 바꾸는 것
		Marine m3 = (Marine) u;
		
		
		Object o = new Marine();
		//형변환 할 수 있다
		System.out.println(o instanceof Marine);
		System.out.println(u instanceof Object);
		
		Object o2 = new Object();
		System.out.println(o2 instanceof Marine);
		
		m.attack(m2);

	}

}
