package kdata.exceptions;

//���� ó���� �ص��ǰ� ���ص� ��
//��Ÿ�� Ÿ�� �ͼ���
//jvm�� ��
public class MyRuntimeException extends RuntimeException {
	
	public MyRuntimeException(){
		super("MyRuntimeException ������#1");
	}
	
	
	public MyRuntimeException(String msg){
		super(msg);
	}

}
