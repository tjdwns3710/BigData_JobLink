package kdata.array;

public class ArrayTest {

	public static void main(String[] args) {
		// 142p
		
		int a;  
		// stack에 할당 , 기본형
		
		int[] ar; 
		// stack에 할당 , 참조형 , 참조 변수 ar이라고도 부른다
		// c로 생각하면 int *ar이랑 같다 - 주소를 저장한다고 생각
		
		ar = new int[5];  
		//메모리 할당 - heap 메모리에 할당
		
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
