package kdata.constructor;

public class Car {
	
	int num;
	String color;
	
	//생성자
	Car(){
		System.out.println("Car() 생성자");
		this.num = 0;
		this.color = "black";
	}
	
	Car(String color){
		this.color = color;
	}
	
	Car(int num, String color){
		this.num = num;
		this.color =color;
	}
	Car(String color, int num){
		this(num, color);
		//같은 클래스내에 생성자를 호출
	}


}
