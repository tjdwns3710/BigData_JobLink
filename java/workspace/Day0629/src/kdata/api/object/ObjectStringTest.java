package kdata.api.object;

public class ObjectStringTest {

	public static void main(String[] args) {

		String s1 = "hello";
		String s2 = "hello";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String s3 = new String("hello");
		String s4 = new String("hello");
		
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		//�޸𸮰� ���ε��� ����
		//�׷��� string���۶� string������ ���
		System.out.println(s4.hashCode());
		s4 = s4 + "1";
		System.out.println(s4.hashCode());
		
	}

}
