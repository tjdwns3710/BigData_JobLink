package kdata.statictest;

public class Marine {
	//�ν��Ͻ� �ʵ�
	//������ �Ҷ� �������
	//new�ϸ� heap�� �������
	private int hp;
	
	//Ŭ���� �ʵ� - Ŭ������ �ϳ� �������
	//Ŭ������ �ε��Ҷ� Ŭ���������� �������
	//�����ϱ� ������ �������
	//��ü ������ ���ص� �������
	//public�� �ƴ϶� private�� ����� �޼ҵ带 ��������
	private static int level;
	
	//�ν��Ͻ� �޼ҵ�
	void setHp(){
		hp = 100;
		this.level = 10;
	}
	
	//Ŭ���� �޼ҵ�
	//Ŭ���� �޼ҵ忡�� �ν��Ͻ� �ʵ� ���� �Ұ�(���縦 �𸥴�)
	//this�� �� �� ����
	//static���(Ŭ���� ���)�鸸 ���� �� �� �ִ�.
	static void setLevel(){
		level = 10;
	
	}
}
