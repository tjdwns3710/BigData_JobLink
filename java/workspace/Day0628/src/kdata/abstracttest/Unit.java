package kdata.abstracttest;

//추상클래스에서 일반 메소드도 들어갈 수 있다.
public abstract class Unit {
	
	//생성자
	Unit(){
		System.out.println("Unit()");
	}
	
	//일반 메소드
	void run(){
		
	}
	
	//추상 메소드
	abstract void move();

}
