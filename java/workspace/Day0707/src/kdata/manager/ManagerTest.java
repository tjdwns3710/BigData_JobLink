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
		//�� ����� �����ڸ� ���� ����ϴ� ��
		

		//�� ����� ���ͼ��͸� �Ἥ ����� ��
		/*Student s = new Student();
		s.setStuNum(stuNum);
		s.setStuName(stuName);
		s.setStuGender(stuGender);*/
		
		//manager.insert(s);
		
		//�Է��� �ȵǸ� �����ż��� �߰�
		//null�̰ų� ����� �Է� �ȵǸ� -> �й��� ����� �Է��Ͻÿ�
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("-----------�޴��� �����ϼ���.-----------");
			System.out.println("1.�л� ���� �߰�  2.�л� ����Ʈ 3.�л� �̸� �˻�");
			System.out.println("4.���� ����Ʈ      5.���� ��û   6.���� ����Ʈ    ");
			System.out.println("7.���� �Է�        8.���� ���");
			System.out.println("-----------------------------------");
			int menu = sc.nextInt();
			sc.nextLine();
			switch(menu) {
			case 1:
				Student s = new Student(stuNum,stuName,stuGender);
				System.out.println("�й��� �Է��ϼ���");
				stuNum = sc.nextLine();
				/*if(stuNum.length() != 7) {
					System.out.println("��� : �й��� ����� �Է��ϼ���");
					continue;
				}*/
				System.out.println("�̸��� �Է��ϼ���");
				stuName = sc.nextLine();
				System.out.println("������ �Է��ϼ���");
				stuGender = sc.nextLine();
				
				
				int result = manager.insert(s); 
				if(result == 1)
					System.out.println("������ �߰� �Ǿ����ϴ�.");
				else
					System.out.println("������ �߰� ���� �ʾҽ��ϴ�.");
				
				break;
			case 2://�л� ����Ʈ
				System.out.println("--------�л�����Ʈ--------");
				List<Student> list = manager.selectAll();
				
				for(Student s2:list) {
					System.out.println(s2);
				}
				
				break;
			case 3:
				
				
				break;
				
			case 4://���� ����Ʈ
				System.out.println("--------���񸮽�Ʈ--------");
				List<Sugang> list2 = smanager.selectList();
				
				for(Sugang s4:list2) {
					System.out.println(s4);
				}
				
				break;
				
			case 5:
				Sugang s3 = new Sugang(subCode, subName, stuNum2, stuName2, signGrade, signDate);
				System.out.println("�̸��� �Է��ϼ���.");
				stuNum2 = sc.nextLine();
				System.out.println("�����ڵ带 �Է��ϼ���.");
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
