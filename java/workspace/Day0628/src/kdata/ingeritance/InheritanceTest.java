package kdata.ingeritance;

public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle v = new Vehicle();
		v.move();
		
		Car c = new Car();
		//c입장에서는 move가 두개가 보임(부모것과 자기것)
		//둘중에 하나를 선택해야하는데 실행시간에 결정나는게 동적바인딩
		c.move();

	}

}
