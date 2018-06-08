package model;

import java.io.Serializable;

public class TeamBean implements Serializable {
	private int team_id;
	private String team_name;
	private int group_id;

	public TeamBean(int team_id, String team_name, int group_id) {
		super();
		this.team_id = team_id;
		this.team_name = team_name;
		this.group_id = group_id;
	}


	public int getTeam_id() {
		return team_id;
	}


	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}


	public String getTeam_name() {
		return team_name;
	}


	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}


	public int getGroup_id() {
		return group_id;
	}


	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}




}
