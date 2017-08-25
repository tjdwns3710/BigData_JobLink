package kdata.collections;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		
		//()여기에는 object상속받은애들은 다 넣을 수 있음
		//리스트에다가 string 타입만 집어넣겠다 <> - 제너릭
		//E는 그때 그때 형태에따라서 쓰는거라는것
		//1.8버전 부터 뒤에 <>안에 안써도 됨
		//ArrayList<String> list = new ArrayList<>();
		
		//이렇게도 많이 쓴다
		//부모가 리스트이기때문에 자동 형변환
		List<String> list = new ArrayList<>();
		
		//첫번째 칸에는 정수
		list.add("2");
		//두번째 칸에는 문자열
		list.add("Hello");
		list.add("Hello");
		
		
		//System.out.println(list);
		
		//object형태로 하면 안되서 형변환을 시켜 줘야 함
		/*Object o = list.get(0);
		
		Integer i = (Integer)o;*/	
		
		/*Object o2 = list.get(1);
		
		String i2 = (String)o2;
		
		System.out.println(list.size());*/
		
		//이렇게 쓸 수 있지만 밑에 처럼 쓸 수 있음
		/*for(int i=0;i<=list.size();i++){
			String s = list.get(i);
			System.out.println(s);
			
			System.out.println(list.get(i).charAt(0));
		}*/
		
		//for(꺼내올 타입:컬랙션 객체이름)
		//확장 for문 - 배열하고 컬랙션에서 많이 사용
		/*for(String s:list)
			System.out.println(s);*/
		
	}

}
