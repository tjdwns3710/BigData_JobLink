package kdata.object;

//클래스 정의 - 접근제한자 class 이름 {}
public class Car {
	
	//필드 선언
	int num;
	String color;
	//멤버변수, new를 할때 메모리가 만들어짐
	
	//메소드 정의
	void print(){
		
		System.out.println("자동차 클래스 출력");
		
		System.out.println(this.num);
		System.out.println(this.color);
	//this는 현재 실행되고 있는 객채를 나타내는 것
	}
	
	void setColor(String color){
		//여기 color는 메소드를 호출할때 만들어짐
		this.color = color;
		
	}
	
	String getColor(){
		return this.color;
	}
	
	void setNum(int num){
		this.num = num;
	}
	int getNum(){
		return this.num;
	}
	

}
//클래스는 틀이기 때문에 