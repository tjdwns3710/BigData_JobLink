package kdata.object;

import java.lang.String;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ����
		Car c;
		// c�� ���� ����, ���ؿ� �������
		
		c = new Car();
		//heap�� ������� - num�ϰ� color�� ����� �غ� �ȴ�.
		
		c.num = 1;
		c.color = "red";
		//String�� ���� �ؿ� ó�� �ؾߵǴµ� ���־��� ������ �⺻��ó�� �̷��� �ص���
		//c.color = new String();
		//��������� �޸𸮴� �ΰ��� �ٸ�
		
		//System.out.println(c.color);
		c.print();
		
		Car c2 = new Car();
		
		c2.num = 2;
		c2.color = "white";
		
		//System.out.println(c2.color);
		c2.print();
		
		c2.setColor("black");
		System.out.println(c2.color);

		Car c3 = new Car();
		//System.out.println(c3.color);
		c3.setColor("blue");
		System.out.println(c3.color);
		String s = c3.getColor();
		System.out.println(s);
		
		c3.setNum(3);
		int n = c3.getNum();
		System.out.println(n);
	}

}
