package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import beans.Beans;

public class UserDAO extends DAO {

	public Beans login(String memberId, String password) throws Exception {
		Beans user = null;

		Connection con = getConnection();
		String sql = "select * from users where member_id = ? AND password=?";
		PreparedStatement st = con.prepareStatement(sql);

		st.setString(1, memberId);
		st.setString(2, password);
		ResultSet rs = st.executeQuery();

		while (rs.next()) {
			user = new Beans();
			user.setMemberId(rs.getString("member_id"));
			user.setPassword(rs.getString("password"));
			user.setLastName(rs.getString("last_name"));
			user.setFirstName(rs.getString("first_name"));
			user.setAddress(rs.getString("address"));
			user.setMailAddress(rs.getString("mail_address"));

		}
		rs.close();
		st.close();
		con.close();

		return user;

	}
	
	public boolean check(String memberId) throws Exception{
		boolean exists = false;
		
		Connection con = getConnection();
		String sql="SELECT COUNT(*) FROM users WHERE member_id=?";
		PreparedStatement st=con.prepareStatement(sql);
		
		st.setString(1,memberId);
		
		ResultSet rs=st.executeQuery();
		if(rs.next()) {
			exists=rs.getInt(1)>0;
		}
		
		rs.close();
		st.close();
		con.close();
		
		return exists;

	}

	public int insert(Beans user) throws Exception {
		int result = 0;

		Connection con = getConnection();

		PreparedStatement st = con.prepareStatement(
				"INSERT INTO users (member_id,password, last_name, first_name, address, mail_address) VALUES (?, ?, ?, ?, ?,?)");
		st.setString(1, user.getMemberId());
		st.setString(2, user.getPassword());
		st.setString(3, user.getLastName());
		st.setString(4, user.getFirstName());
		st.setString(5, user.getAddress());
		st.setString(6, user.getMailAddress());

		result = st.executeUpdate();
		st.close();
		con.close();

		return result;
	}

	public int update(Beans user) throws Exception {
		int result = 0;
		Connection con = getConnection();

		String sql = "UPDATE users SET last_name=?,first_name=?,address=?,mail_address=? WHERE member_id=?";
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, user.getLastName());
		st.setString(2, user.getFirstName());
		st.setString(3, user.getAddress());
		st.setString(4, user.getMailAddress());
		st.setString(5, user.getMemberId());

		System.out.println("◆ SQL実行：member_id=" + user.getMemberId());
		System.out.println("◆ 更新内容：" + user.getLastName() + " / " + user.getFirstName());

		result = st.executeUpdate();

		st.close();
		con.close();

		return result;

	}

	public boolean delete(Beans user) throws Exception{
//		boolean result = false;
		Connection con=getConnection();
		String sql="DELETE FROM users WHERE member_id=?";
		PreparedStatement st=con.prepareStatement(sql);
		st.setString(1, user.getMemberId());
		
		int count=st.executeUpdate();
//		result = count>0;
		
		st.close();
		con.close();
		
		return count>0;
		
	}
	
}
