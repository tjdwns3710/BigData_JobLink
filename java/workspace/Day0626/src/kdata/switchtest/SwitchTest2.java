package kdata.switchtest;

public class SwitchTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=62;
		
		switch(a/10){
		case 10:
		case 9:
			System.out.println("A"); break;
		case 8:
			System.out.println("B"); break;
		case 7:
			System.out.println("C"); break;
		case 6:
			System.out.println("D"); break;
		default:
			System.out.println("F");
		}

	}

}
