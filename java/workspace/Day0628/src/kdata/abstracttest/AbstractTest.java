package kdata.abstracttest;

public class AbstractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//추상클래스는 new되지 않음
		//Unit u = new Unit();
		
		Marine c = new Marine();
		c.move();
		
		Medic c2 = new Medic();
		c2.move();

	}

}
