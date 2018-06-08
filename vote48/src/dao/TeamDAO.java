package dao;

import java.util.ArrayList;

import model.TeamBean;

public class TeamDAO extends DaoBase {

	public int getTeamid(String tname){
		int id = 0;
		try{
			super.DbOpen();

			String sql ="select * from team where team_name= ? ";
			stmt = con.prepareStatement(sql);
			stmt.setString(1, tname);
			rs = stmt.executeQuery();


			rs.next();
			id = rs.getInt("team_id");
		}catch(Exception e){
			id=0;
		}finally{
			try{
				//エラー字はclose処理
				super.DbClose();
			}catch(Exception e){
				System.out.println("error");
			}
		}
		return id;
	}

	public ArrayList<TeamBean> getList(){
		//格納用List
		ArrayList<TeamBean> list = new ArrayList<TeamBean>();
		try {
			super.DbOpen();

			System.out.println(1);

			String sql ="select * from team";
			System.out.println(2);
			stmt = con.prepareStatement(sql);
			System.out.println(3);
			rs = stmt.executeQuery();
			System.out.println(4);

			while(rs.next()){
				TeamBean teamBean = new TeamBean(rs.getInt("team_id"),rs.getString("team_name"),rs.getInt("group_id"));
				System.out.println(5);

				list.add(teamBean);
            }
		} catch(Exception e) {

		} finally {

			try {
				//エラー時はclose処理
				super.DbClose();
			} catch (Exception e) {
				System.out.println("error");
			}
		}
		return list;
	}



}
