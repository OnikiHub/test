package model;

import java.io.Serializable;

public class LogBean implements Serializable {
	private String user_id;
	private String member_id;
	private String day;

	public LogBean(String user_id, String member_id, String day) {
		super();
		this.user_id = user_id;
		this.member_id = member_id;
		this.day = day;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}



}
