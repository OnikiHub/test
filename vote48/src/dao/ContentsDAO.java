package dao;

import java.util.ArrayList;

import model.ContentsBean;

public class ContentsDAO extends DaoBase {


	public void inputContents(String name,String bday,String bplace,String btype,int gid,int tid,String img) {
		System.out.println(name);
		try{
			super.DbOpen();

			String sql ="insert into member(member_name,birthday,birthplace,bloodtype,group_id,team_id,img_pass) values(?,?,?,?,?,?,?)";
			stmt = con.prepareStatement(sql);
			stmt.setString(1,name);
			stmt.setString(2, bday);
			stmt.setString(3, bplace);
			stmt.setString(4, btype);
			stmt.setInt(5,gid);
			stmt.setInt(6,tid);
			stmt.setString(7,img);
			stmt.executeUpdate();



			}catch(Exception e){

		}finally{
			try{
				//エラー字はclose処理
				super.DbClose();
			}catch(Exception e){
				System.out.println("error");
			}
		}


	}


	public void updateContents(String name,String bday,String bplace,String btype,int gid,int tid,String img,int id) {
		System.out.println(name);
		try{
			super.DbOpen();

			String sql ="update member set member_name=?,birthday=?,birthplace=?,bloodtype=?,group_id=?,team_id=?,img_pass=? where member_id=?";
			stmt = con.prepareStatement(sql);
			stmt.setString(1,name);
			stmt.setString(2, bday);
			stmt.setString(3, bplace);
			stmt.setString(4, btype);
			stmt.setInt(5,gid);
			stmt.setInt(6,tid);
			stmt.setString(7,img);
			stmt.setInt(8,id);
			stmt.executeUpdate();



			}catch(Exception e){

		}finally{
			try{
				//エラー字はclose処理
				super.DbClose();
			}catch(Exception e){
				System.out.println("error");
			}
		}


	}
	public ContentsBean getMember(int id){
		//格納用List
		ContentsBean contentsBean = null;
		try {
			super.DbOpen();

			String sql ="select * from member where member_id = ?";
			stmt = con.prepareStatement(sql);
			stmt.setInt(1,id);
			rs = stmt.executeQuery();

			rs.next();
			contentsBean = new ContentsBean(rs.getInt("member_id"),rs.getString("member_name"),rs.getString("birthday"),rs.getString("birthplace"),rs.getString("bloodtype"),rs.getInt("group_id"),rs.getInt("team_id"),rs.getString("img_pass"),rs.getInt("vote_counts"));



		} catch(Exception e) {

		} finally {

			try {
				//エラー時はclose処理
				super.DbClose();
			} catch (Exception e) {
				System.out.println("error");
			}
		}
		return contentsBean;
	}

	public void deletMember(int id){

		try{
			super.DbOpen();

			String sql ="delete from member where member_id = ?";
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, id);
			stmt.executeUpdate();



		}catch(Exception e){

		}finally{
			try{
				//エラー字はclose処理
				super.DbClose();
			}catch(Exception e){
				System.out.println("error");
			}
		}
	}

	public ArrayList<ContentsBean> getList(){
		System.out.println("lk");
		//格納用List
		ArrayList<ContentsBean> list = new ArrayList<ContentsBean>();
		System.out.println("kk");
		try {
			System.out.println("gg");
			super.DbOpen();
			System.out.println(1);


			String sql ="select * from member";
			System.out.println(2);
			stmt = con.prepareStatement(sql);
			System.out.println(3);
			rs = stmt.executeQuery();
			System.out.println(4);

			while(rs.next()){
				ContentsBean contentsBean = new ContentsBean(rs.getInt("member_id"),rs.getString("member_name"),rs.getString("birthday"),rs.getString("birthplace"),rs.getString("bloodtype"),rs.getInt("group_id"),rs.getInt("team_id"),rs.getString("img_pass"),rs.getInt("vote_counts"));

				list.add(contentsBean);
            }

			System.out.println(1);


			System.out.println(rs.getString("member_name"));
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

	public ArrayList<ContentsBean> getList(int gid){
		System.out.println("lk");
		//格納用List
		ArrayList<ContentsBean> list = new ArrayList<ContentsBean>();
		System.out.println("kk");
		try {
			System.out.println("gg");
			super.DbOpen();
			System.out.println(1);


			String sql ="select * from member where group_id=?";
			stmt = con.prepareStatement(sql);
			System.out.println(11);
			stmt.setInt(1,gid);
			System.out.println(2);
			System.out.println(3);
			rs = stmt.executeQuery();
			System.out.println(4);

			while(rs.next()){
				ContentsBean contentsBean = new ContentsBean(rs.getInt("member_id"),rs.getString("member_name"),rs.getString("birthday"),rs.getString("birthplace"),rs.getString("bloodtype"),rs.getInt("group_id"),rs.getInt("team_id"),rs.getString("img_pass"),rs.getInt("vote_counts"));

				list.add(contentsBean);
            }

			System.out.println(1);


			System.out.println(rs.getString("member_name"));
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
