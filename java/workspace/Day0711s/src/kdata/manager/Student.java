package kdata.manager;

public class Student {
	//�����̺��̶� �� Ŭ���� �����ۿ� ���� - �׷��� �ۺ��� �ֵ��� ��������
	//�׷��� ���ͼ��� �޼ҵ带 ������ ��
	//3���� ���ÿ� �Ϸ��� �����ڷ� �������� ��
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
