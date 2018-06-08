package model;

import java.io.Serializable;

public class UserBean implements Serializable {
	private String user_id;
	private String user_password;
	private String user_name;
	private int vote_flag;
	private String authority;


	public UserBean(String user_id, String user_password, String user_name, int vote_flag, String authority) {
		super();
		this.user_id = user_id;
		this.user_password = user_password;
		this.user_name = user_name;
		this.vote_flag = vote_flag;
		this.authority = authority;
	}


	public String getUser_id() {
		return user_id;
	}


	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}


	public String getUser_password() {
		return user_password;
	}


	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}


	public String getUser_name() {
		return user_name;
	}


	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}


	public int getVote_flag() {
		return vote_flag;
	}


	public void setVote_flag(int vote_flag) {
		this.vote_flag = vote_flag;
	}


	public String getAuthority() {
		return authority;
	}


	public void setAuthority(String authority) {
		this.authority = authority;
	}

}
