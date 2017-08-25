package kdata.statictest;

public class Marine {
	//인스턴스 필드
	//실행을 할때 만들어짐
	//new하면 heap에 만들어짐
	private int hp;
	
	//클래스 필드 - 클래스당 하나 만들어짐
	//클래스를 로드할때 클래스영역에 만들어짐
	//실행하기 직전에 만들어짐
	//객체 생성을 안해도 만들어짐
	//public이 아니라 private를 쓸라면 메소드를 만들어야함
	private static int level;
	
	//인스턴스 메소드
	void setHp(){
		hp = 100;
		this.level = 10;
	}
	
	//클래스 메소드
	//클래스 메소드에서 인스턴스 필드 접근 불가(존재를 모른다)
	//this를 쓸 수 없음
	//static멤버(클래스 멤버)들만 접근 할 수 있다.
	static void setLevel(){
		level = 10;
	
	}
}
