package kdata.constructor;

public class Car {
	
	int num;
	String color;
	
	//������
	Car(){
		System.out.println("Car() ������");
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
		//���� Ŭ�������� �����ڸ� ȣ��
	}


}
