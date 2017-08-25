package kdata.exceptions;

public class CompileTimeExceptionTest {

	public static void main(String[] args) {
		
		//직접할거면 try, 귀찮으면 throws
		try {
			
			//a라는 클래스를 찾으라는데 없으니까 캐치문 실행
			Class.forName("a");
		} catch (ClassNotFoundException e) {

			//e의 객체에 담아오니까 e.을 사용할 수 있음
			//어떤에러가 났는지 나오는지 알려 주는것임
			//e.printStackTrace();
		}

	}

}
