package kdata.anonymous;
//필요할때마다 계속 써먹을 수 있다.
public class TypeCastTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//형변환
		//Unit u = new Unit();
		
		Movable m = new Unit();
		
		//실행 할때 unit의 move를 호출함
		//컴파일할때는 movable의 move를 호출함
		//이게 동적바인딩
		m.move();
	}

}
