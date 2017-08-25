package kdata.exceptions;

//예외 처리를 해도되고 안해도 됨
//런타임 타입 익셉션
//jvm이 모름
public class MyRuntimeException extends RuntimeException {
	
	public MyRuntimeException(){
		super("MyRuntimeException 생성자#1");
	}
	
	
	public MyRuntimeException(String msg){
		super(msg);
	}

}
