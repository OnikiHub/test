package model;

import java.io.Serializable;

public class ContentsBean implements Serializable {
	private int member_id;
	private String member_name;
	private String birthday;
	private String birthplace;
	private String bloodtype;
	private int group_id;
	private int team_id;
	private String img_pass;
	private int vote_counts;

	public ContentsBean(int member_id, String member_name, String birthday, String birthplace, String bloodtype,
			int group_id, int team_id, String img_pass, int vote_counts) {
		super();
		this.member_id = member_id;
		this.member_name = member_name;
		this.birthday = birthday;
		this.birthplace = birthplace;
		this.bloodtype = bloodtype;
		this.group_id = group_id;
		this.team_id = team_id;
		this.img_pass = img_pass;
		this.vote_counts = vote_counts;
	}


	public ContentsBean() {
		// TODO 自動生成されたコンストラクター・スタブ
	}


	public int getMember_id() {
		return member_id;
	}
	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}
	public String getMember_name() {
		return member_name;
	}
	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getBirthplace() {
		return birthplace;
	}
	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}
	public String getBloodtype() {
		return bloodtype;
	}
	public void setBirthtype(String bloodtype) {
		this.bloodtype = bloodtype;
	}
	public int getGroup_id() {
		return group_id;
	}
	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}
	public int getTeam_id() {
		return team_id;
	}
	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}
	public String getImg_pass() {
		return img_pass;
	}
	public void setImg_pass(String img_pass) {
		this.img_pass = img_pass;
	}
	public int getVote_counts() {
		return vote_counts;
	}
	public void setVote_counts(int vote_counts) {
		this.vote_counts = vote_counts;
	}
}
