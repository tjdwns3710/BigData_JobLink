package kdata.api.object;

public class StringBufferTest {

	public static void main(String[] args) {
		
		//메모리가 따로따로 안잡임
		//메모리를 같은 곳을 쓰고싶으면 append를 사용
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.hashCode());
		sb.append("Hello");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		sb.append("1");
		System.out.println(sb.hashCode());

	}

}
