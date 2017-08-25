package kdata.access;

public class Car extends Object {
	//object는 부모고 car는 자식이다
	//object를 상속 받은것이다.
	
	//접근 제어자
	private int num;
	private String color;
	private static double cc;
	
	public Car(int num){
		this.num = num;
	}
	
	public int getNum(){
		return num;
	}
	
	public void setNum(int num){
		this.num = num;
	}
	
	public String getColor(){
		return color;
	}
	
	public void setColor(String color){
		this.color = color;
	}

	public double getCc() {
		return cc;
	}

	public void setCc(double cc) {
		this.cc = cc;
	}
	
	public void test(){
		this.equals("");
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	
	/*@Override
	public boolean equals(Object o){
		return false;
	}*/
	//object부모의 것을 재정의 한것이 override한 것이다.
}
