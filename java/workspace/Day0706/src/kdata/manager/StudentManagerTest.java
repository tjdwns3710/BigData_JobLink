package kdata.manager;

import java.util.Scanner;

public class StudentManagerTest {

	public static void main(String[] args) {
		//1.학생 정보 추가
		//2.학생 리스트 
		//3.학생 이름 검색
		StudentManager sm = new StudentManager();
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("-----------메뉴를 선택하세요.-----------");
			System.out.println("1.학생 정보 추가  2.학생 리스트 3.학생 이름 검색");
			
			switch(sc.nextInt()){
			case 1:
				System.out.println("학번을 입력하시오");
				String stu_num = sc.nextLine();
				sc.nextLine();
				
				System.out.println("이름을 입력하시오");
				String stu_name = sc.nextLine();
				
				System.out.println("성별을 입력하시오");
				String stu_gender = sc.nextLine();
				
				sm.insert();
				break;
				
			case 2:
				System.out.println("--------목록--------");
				System.out.println("학번  / 이름 / 성별");
				
				sm.SelectAll();
				break;
				
			case 3:
				System.out.println("검색할 이름을 입력하세요");
				sc.nextLine();
				String stu_name2 = sc.nextLine();
				
				sm.selectByName(stu_name2);
				
				break;
			}
		}
		

	}

}
