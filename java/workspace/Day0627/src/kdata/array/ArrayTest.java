package kdata.array;

public class ArrayTest {

	public static void main(String[] args) {
		// 142p
		
		int a;  
		// stack�� �Ҵ� , �⺻��
		
		int[] ar; 
		// stack�� �Ҵ� , ������ , ���� ���� ar�̶�� �θ���
		// c�� �����ϸ� int *ar�̶� ���� - �ּҸ� �����Ѵٰ� ����
		
		ar = new int[5];  
		//�޸� �Ҵ� - heap �޸𸮿� �Ҵ�
		
		ar[0]=10;
		ar[1]=20;
		ar[2]=30;
		ar[3]=40;
		ar[4]=50;
		
		/*System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar.length);*/
		
		for(int i=0;i<ar.length;i++)
			System.out.println(ar[i]);
	}

}
