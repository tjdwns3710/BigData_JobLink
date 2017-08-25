package kdata.exceptions;


//컴파일 타임 익셉션
public class MyExceptionTest {

	public static void main(String[] args) {
		
		MyException r1 = new MyException("첫번째 예외");
		
		try {
			throw new MyException("첫번째 예외");
		} catch (MyException e) {
			
			e.printStackTrace();
		}
	}

}
