package kdata.api.object;

public class StringBufferTest {

	public static void main(String[] args) {
		
		//�޸𸮰� ���ε��� ������
		//�޸𸮸� ���� ���� ��������� append�� ���
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.hashCode());
		sb.append("Hello");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		sb.append("1");
		System.out.println(sb.hashCode());

	}

}
