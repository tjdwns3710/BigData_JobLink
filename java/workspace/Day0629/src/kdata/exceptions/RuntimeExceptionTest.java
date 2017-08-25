package kdata.exceptions;

public class RuntimeExceptionTest {

	public static void main(String[] args) {

		
		//자바에서 컴파일을 실행하는데 오류가 없다
		//그래서 런타임익셉션을 실행 시켜야 함
		//예외가 생기면 캐치로 넘어감
		//없으면 캐치로 안넘어가고 트라이 파이널리로 실행됨
		try{
			System.out.println("try 시작");
			System.out.println(2/2);
			
			
			String s = null;
			
			System.out.println(s.charAt(1));
			
			System.out.println("try 끝");
			//캐치는 여러개 사용 가능
		}catch(ArithmeticException e){
			System.out.println("catch - arithmetic");
			
			//finally는 항상 실행이 됨
		}catch(NullPointerException e){
			System.out.println("catch - nullporinter");
		}catch(RuntimeException e){
			e.printStackTrace();
		}
			finally{
			System.out.println("finally");
		}
	}

}
