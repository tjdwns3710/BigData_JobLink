package kdata.project.dto;

import java.io.Serializable;
import java.sql.Date;

//�ø������������ �������̵��� �޼ҵ尡 ����
public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7446302464355111595L;
	private String id;
	private String pwd;
	private String name;
	private String profile;
	private Date regDate;
	
	
	public User() {
		super();
	}

	public User(String id, String pwd, String name) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
	}
	/*
	public User(String id, String pwd, String name, String fileName, Date regDate) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.fileName = fileName;
		this.regDate = regDate;
	}*/
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
}
