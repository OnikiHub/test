package dao;

import java.util.ArrayList;

import model.GroupBean;

public class GroupDAO extends DaoBase {

	public int getGroupid(String gname){
		int id=0;

		try{
			super.DbOpen();

			String sql ="select * from group1 where group_name= ? ";
			stmt = con.prepareStatement(sql);
			stmt.setString(1, gname);
			rs = stmt.executeQuery();


			rs.next();
			id = rs.getInt("group_id");
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

	public ArrayList<GroupBean> getList(){
		System.out.println("lk");
		//格納用List
		ArrayList<GroupBean> list = new ArrayList<GroupBean>();
		System.out.println("kk");
		try {
			System.out.println("gg");
			super.DbOpen();
			System.out.println(1);


			String sql ="select * from group1";
			System.out.println(2);
			stmt = con.prepareStatement(sql);
			System.out.println(3);
			rs = stmt.executeQuery();
			System.out.println(4);

			while(rs.next()){
				GroupBean groupBean = new GroupBean(rs.getInt("group_id"),rs.getString("group_name"));

				list.add(groupBean);
            }

			System.out.println(1);


			System.out.println(rs.getString("Group_name"));
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
