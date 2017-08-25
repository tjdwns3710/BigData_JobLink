package kdata.anonymous;

public class AnonymousTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//인터페이스는 객체생성이 불가능하지만 생성을 하면서 클래스 정의를 하면 가능함
		//이름이 없어서 또써먹을수가 없음
		// 클래스이름도 없고 객체이름도 없다
		//이 클래스는 한번 딱 쓰고 버려 지는데 계속쓰려면 m이라는 객체 이름을 가지게 해줌(29~40)
		//객체이름 없는것 - 한번 써먹음
		new Movable(){
			
			@Override
			public void move(){
				
				System.out.println("Anonymous");
				
			}
		}.move();
		
		

	}

}
		//객체이름 있는것 - 여러번 써먹음
		/*Movable m = new Movable(){

			@Override
			public void move() {
				// TODO Auto-generated method stub
				System.out.println("Anonymous");
		
			}
	
		};

		m.move();
	}*/
