package kdata.collections;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		
		//()���⿡�� object��ӹ����ֵ��� �� ���� �� ����
		//����Ʈ���ٰ� string Ÿ�Ը� ����ְڴ� <> - ���ʸ�
		//E�� �׶� �׶� ���¿����� ���°Ŷ�°�
		//1.8���� ���� �ڿ� <>�ȿ� �Ƚᵵ ��
		//ArrayList<String> list = new ArrayList<>();
		
		//�̷��Ե� ���� ����
		//�θ� ����Ʈ�̱⶧���� �ڵ� ����ȯ
		List<String> list = new ArrayList<>();
		
		//ù��° ĭ���� ����
		list.add("2");
		//�ι�° ĭ���� ���ڿ�
		list.add("Hello");
		list.add("Hello");
		
		
		//System.out.println(list);
		
		//object���·� �ϸ� �ȵǼ� ����ȯ�� ���� ��� ��
		/*Object o = list.get(0);
		
		Integer i = (Integer)o;*/	
		
		/*Object o2 = list.get(1);
		
		String i2 = (String)o2;
		
		System.out.println(list.size());*/
		
		//�̷��� �� �� ������ �ؿ� ó�� �� �� ����
		/*for(int i=0;i<=list.size();i++){
			String s = list.get(i);
			System.out.println(s);
			
			System.out.println(list.get(i).charAt(0));
		}*/
		
		//for(������ Ÿ��:�÷��� ��ü�̸�)
		//Ȯ�� for�� - �迭�ϰ� �÷��ǿ��� ���� ���
		/*for(String s:list)
			System.out.println(s);*/
		
	}

}
