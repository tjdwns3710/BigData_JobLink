package kdata.exceptions;

public class MyRuntimeExceptionTest {

	public static void main(String[] args) {
		
		
		//런타임 인셉션을 상속받았으니까 실행시간에 됨
		//런타임 인샙션이라 예외를 해도되고 안해도 됨
		MyRuntimeException r1 = new MyRuntimeException();
		MyRuntimeException r2 = new MyRuntimeException("두번째 예외");		
		MyRuntimeException r3 = new MyRuntimeException("세번째 예외");
		
		//jvm이 알려둠
		//e는 마이런타임익셉션 객체
		try{
			throw r1;
		}catch(MyRuntimeException e){
			System.out.println(e.getMessage());
			
			//상속을 해서 이렇게 씀
			e.printStackTrace();
		}
		
		//throw r1;
		//throw r2;
		
		//이건 객체이름이 없다
		//r1이 나옴
		//이렇게 쓰는 경우가 더 쉬워서 더 많이 씀
		//throw new MyRuntimeException();
		
	}

}
