package kdata.manager;

import java.util.Scanner;

public class StudentManagerTest {

	public static void main(String[] args) {
		//1.�л� ���� �߰�
		//2.�л� ����Ʈ 
		//3.�л� �̸� �˻�
		StudentManager sm = new StudentManager();
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("-----------�޴��� �����ϼ���.-----------");
			System.out.println("1.�л� ���� �߰�  2.�л� ����Ʈ 3.�л� �̸� �˻�");
			
			switch(sc.nextInt()){
			case 1:
				System.out.println("�й��� �Է��Ͻÿ�");
				String stu_num = sc.nextLine();
				sc.nextLine();
				
				System.out.println("�̸��� �Է��Ͻÿ�");
				String stu_name = sc.nextLine();
				
				System.out.println("������ �Է��Ͻÿ�");
				String stu_gender = sc.nextLine();
				
				sm.insert();
				break;
				
			case 2:
				System.out.println("--------���--------");
				System.out.println("�й�  / �̸� / ����");
				
				sm.SelectAll();
				break;
				
			case 3:
				System.out.println("�˻��� �̸��� �Է��ϼ���");
				sc.nextLine();
				String stu_name2 = sc.nextLine();
				
				sm.selectByName(stu_name2);
				
				break;
			}
		}
		

	}

}
