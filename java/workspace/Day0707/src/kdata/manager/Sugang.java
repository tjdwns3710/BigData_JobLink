package kdata.manager;

import java.sql.Date;

//���� �� �� ���� �����ؼ� �ʵ� ��������
/**
 * 
 * @author cse
 *
 */
public class Sugang {
	//�����ȣ,�����, �й�, �̸�, ����, ��û��
	private String subCode;
	private String subName;
	private String stuNum;
	private String stuName;
	private int signGrade = 0;
	private int signDate;
	
	public String getSubCode() {
		return subCode;
	}
	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
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
	public int getSignGrade() {
		return signGrade;
	}
	public void setSignGrade(int signGrade) {
		this.signGrade = signGrade;
	}
	public int getSignDate() {
		return signDate;
	}
	public void setSignDate(int signDate) {
		this.signDate = signDate;
	}
	
	public Sugang(String subCode, String subName, String stuNum, String stuName, int signGrade, int signDate) {
		super();
		this.subCode = subCode;
		this.subName = subName;
		this.stuNum = stuNum;
		this.stuName = stuName;
		this.signGrade = signGrade;
		this.signDate = signDate;
	}
	public Sugang(String subCode, String subName) {
		super();
		this.subCode = subCode;
		this.subName = subName;
		
	}
	@Override
	public String toString() {
		return subCode + " , " + subName + " , " + stuNum + " , " + stuName
				+ " , " + signGrade + " , " + signDate;
	}
	
	
	

	
}
