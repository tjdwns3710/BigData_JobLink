package kdata.abstracttest;

public class TypeCastTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//����ȯ �׽�Ʈ
		//instanceof �׽�Ʈ(����ȯ�� ��������)
		Marine m = new Marine();
		
		//System.out.println(m instanceof Marine);
		//System.out.println(m instanceof Medic); //�޵�� ���� ������ �ȵ�
		//System.out.println(m instanceof Unit);
		//System.out.println(m instanceof Object);
		
		//�ڵ� ����ȯ
		//�ڽ��� �θ�� ����ȯ - ����ȯ ������ ��������
		//�������� ���� ����Ÿ���� ���·� ����
		//���� ��ü�� ��������� ������ ����Ű������
		Unit u = new Marine();
		u.move();
		
		Unit u2 = new Medic();
		u2.move();
		
		System.out.println(u instanceof Unit);
		//�θ��� u�� �ڽ��� �������� �ٲٷ��� ���� ����ȯ �ؾ��Ѵ�
		System.out.println(u instanceof Marine);
		
		//���� ����ȯ - ����ȯ ������ �����Ұ�
		//�θ� �ڽ����� �ٲٴ� ��
		Marine m3 = (Marine) u;
		
		
		Object o = new Marine();
		//����ȯ �� �� �ִ�
		System.out.println(o instanceof Marine);
		System.out.println(u instanceof Object);
		
		Object o2 = new Object();
		System.out.println(o2 instanceof Marine);
		
		m.attack(m2);

	}

}
