package kdata.interfacetest;

//인터페이스
public interface Moveable {
	
	//상수
	//상수는 public static final을 무조건 써야해서 생략가능
	/*public static final*/ int MAX_SPEED = 100;
	
	//추상메소드
	//추상 메소드가 기본이라 생략가능
	/*public abstract*/ void move();
	
	//디폴트메소드
	//몸통을 쓰고 싶으면 자바8부터 몸통이 있는 디폴트 메소드 사용가능
	//오버라이드 안해도됨
	default void move2(){
		
	}
	
}
