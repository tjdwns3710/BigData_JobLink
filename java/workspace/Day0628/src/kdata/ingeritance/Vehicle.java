//O <- V <- C <- S
//       <- B


package kdata.ingeritance;
//������ ������ �ʴ� object �޼ҵ� 11�� 
//������ ������ �ʴ� ������ super����
public class Vehicle {
	int door;
	String color;
	
	//�⺻ ������
	/*Vehicle(){
		//�θ� Ŭ������ �����ڸ� ȣ��
		super();
	}*/
	
	//�Ű����� ���� ������(overload)
	/*Vehicle(int door){
		super(); //�̰� ���� �Ǿ�����
		System.out.println("Vehicle()");
	}*/
	
	//�����ڰ� �ϳ��� ������ �⺻������ �ȸ������
	/*Vehicle(int door){
		this.door = door;
	}*/
	
	void move(){
		System.out.println("Vehicle move()");
	}

}
