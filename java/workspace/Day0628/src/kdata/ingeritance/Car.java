package kdata.ingeritance;

//vehicle(상위클래스,부모클래스)
//여기에는 보이지않지만 vehicle의 필드 2개가 있다
//보이지않지만 11개의 object꺼
public class Car extends Vehicle {
	String name;
	
	//기본생성자(없어도 자동으로 생기는 것)
	/*Car(){
		//부모 클래스의 생성자를 호출(매개변수가 없는애)
		//vehicle의 생성자중에 매개변수가 없는걸 만들거나(overload)
		//이 클래스에 생성자를 만들어 보되 vehicle를 호출 해주는 생성자 만들어야함
		super();
	}*/
	
	//super가 먼저있어서 부모클래스의 생성자를 호출하게 되있다
	/*Car(int door){
		super(door);
		System.out.println("Car()");
	}*/
	
	/*Car(){
		super(1); //이게 생략 되어있음
		System.out.println("Car()");
	}*/
	
	
	//안의 기능을 다르게 하고 이름을 같게 하는것
	@Override
	void move(){
		//부모의 override된 것의 기능에 +하는 것이 super.move();
		//상황에 따라서 씀
		super.move();
		System.out.println("Car move()");
	}
	
}
