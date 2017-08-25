package kdata.manager;

public class Student {
	//프라이빗이라 이 클래스 에서밖에 못씀 - 그래서 퍼블릭한 애들을 만들어야함
	//그래서 게터세터 메소드를 만들어야 함
	//3개를 동시에 하려면 생성자로 만들어줘야 함
	private String stuNum;
	private String stuName;
	private String stuGender;
	
	public Student(String stuNum, String stuName, String stuGender) {
		super();
		this.stuNum = stuNum;
		this.stuName = stuName;
		this.stuGender = stuGender;
	}
	
	public String getStuNum() {
		return stuNum;
	}
	public void setStuNum(String stuNum) {
		this.stuNum = stuNum;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuGender() {
		return stuGender;
	}
	public void setStuGender(String stuGender) {
		this.stuGender = stuGender;
	}

	@Override
	public String toString() {
		return stuNum +"  ,  "+ stuName + "  ,  " + stuGender;
	}
	
	

}
