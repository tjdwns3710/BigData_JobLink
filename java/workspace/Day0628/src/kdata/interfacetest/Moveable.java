package kdata.interfacetest;

//�������̽�
public interface Moveable {
	
	//���
	//����� public static final�� ������ ����ؼ� ��������
	/*public static final*/ int MAX_SPEED = 100;
	
	//�߻�޼ҵ�
	//�߻� �޼ҵ尡 �⺻�̶� ��������
	/*public abstract*/ void move();
	
	//����Ʈ�޼ҵ�
	//������ ���� ������ �ڹ�8���� ������ �ִ� ����Ʈ �޼ҵ� ��밡��
	//�������̵� ���ص���
	default void move2(){
		
	}
	
}
