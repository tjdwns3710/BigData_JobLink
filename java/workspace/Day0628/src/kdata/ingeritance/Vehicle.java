//O <- V <- C <- S
//       <- B


package kdata.ingeritance;
//눈으로 보이지 않는 object 메소드 11개 
//눈으로 보이지 않는 생성자 super있음
public class Vehicle {
	int door;
	String color;
	
	//기본 생성자
	/*Vehicle(){
		//부모 클래스의 생성자를 호출
		super();
	}*/
	
	//매개변수 없는 생성자(overload)
	/*Vehicle(int door){
		super(); //이게 생략 되어있음
		System.out.println("Vehicle()");
	}*/
	
	//생성자가 하나라도 있으면 기본생성자 안만들어짐
	/*Vehicle(int door){
		this.door = door;
	}*/
	
	void move(){
		System.out.println("Vehicle move()");
	}

}
