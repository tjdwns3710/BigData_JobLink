package kdata.abstracttest;

//보이지않지만 유닛의 추상메소드도 포함 되어있음
//그래서 이 클래스를 추상클래스를 만들던지 오버라이드를 해야함
public class Marine extends Unit{
	int attackPower;
	
	//오버라이드는 머리가 똑같아야 하지만 접근 범위는 더 크게 해도됨
	@Override
	public void move(){
		System.out.println("Marine move()");
		
		
		void attack(Unit u){
			
		}
	}

}
