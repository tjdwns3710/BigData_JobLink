package kdata.object;

//Ŭ���� ���� - ���������� class �̸� {}
public class Car {
	
	//�ʵ� ����
	int num;
	String color;
	//�������, new�� �Ҷ� �޸𸮰� �������
	
	//�޼ҵ� ����
	void print(){
		
		System.out.println("�ڵ��� Ŭ���� ���");
		
		System.out.println(this.num);
		System.out.println(this.color);
	//this�� ���� ����ǰ� �ִ� ��ä�� ��Ÿ���� ��
	}
	
	void setColor(String color){
		//���� color�� �޼ҵ带 ȣ���Ҷ� �������
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
//Ŭ������ Ʋ�̱� ������ 