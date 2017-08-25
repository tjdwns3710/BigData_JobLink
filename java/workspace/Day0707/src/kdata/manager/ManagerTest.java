package kdata.manager;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class ManagerTest {

	public static void main(String[] args) throws SQLException {
		
		StudentManager manager = new StudentManager();
		SugangManager smanager = new SugangManager();
		String stuNum = null;
		String stuName = null;
		String stuGender = null;
		String subCode = null;
		String subName = null;
		String stuNum2 = null;
		String stuName2 = null;
		Integer signGrade = 0;
		Date signDate = null;
		//이 방법이 생성자를 만들어서 사용하는 것
		

		//이 방법이 게터세터를 써서 만드는 것
		/*Student s = new Student();
		s.setStuNum(stuNum);
		s.setStuName(stuName);
		s.setStuGender(stuGender);*/
		
		//manager.insert(s);
		
		//입력이 안되면 에러매세지 뜨게
		//null이거나 제대로 입력 안되면 -> 학번을 제대로 입력하시오
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("-----------메뉴를 선택하세요.-----------");
			System.out.println("1.학생 정보 추가  2.학생 리스트 3.학생 이름 검색");
			System.out.println("4.과목 리스트      5.수강 신청   6.수강 리스트    ");
			System.out.println("7.성적 입력        8.수강 취소");
			System.out.println("-----------------------------------");
			int menu = sc.nextInt();
			sc.nextLine();
			switch(menu) {
			case 1:
				Student s = new Student(stuNum,stuName,stuGender);
				System.out.println("학번을 입력하세요");
				stuNum = sc.nextLine();
				/*if(stuNum.length() != 7) {
					System.out.println("경고 : 학번을 제대로 입력하세요");
					continue;
				}*/
				System.out.println("이름을 입력하세요");
				stuName = sc.nextLine();
				System.out.println("성별을 입력하세요");
				stuGender = sc.nextLine();
				
				
				int result = manager.insert(s); 
				if(result == 1)
					System.out.println("정보가 추가 되었습니다.");
				else
					System.out.println("정보가 추가 되지 않았습니다.");
				
				break;
			case 2://학생 리스트
				System.out.println("--------학생리스트--------");
				List<Student> list = manager.selectAll();
				
				for(Student s2:list) {
					System.out.println(s2);
				}
				
				break;
			case 3:
				
				
				break;
				
			case 4://과목 리스트
				System.out.println("--------과목리스트--------");
				List<Sugang> list2 = smanager.selectList();
				
				for(Sugang s4:list2) {
					System.out.println(s4);
				}
				
				break;
				
			case 5:
				Sugang s3 = new Sugang(subCode, subName, stuNum2, stuName2, signGrade, signDate);
				System.out.println("이름을 입력하세요.");
				stuNum2 = sc.nextLine();
				System.out.println("과목코드를 입력하세요.");
				subCode = sc.nextLine();
				
				int result2 = smanager.insert(s3);
				
				break;
				
			case 6:
				
				break;
				
			case 7:
				
				break;
				
			case 8:
				
				break;
				
			}
			
			
		}
		

	}

}
