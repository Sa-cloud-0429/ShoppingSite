package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import beans.Beans;

public class UserDAO extends DAO {

	public Beans login(int memberId, String password) throws Exception {
		Beans user = null;

		Connection con = getConnection();

		PreparedStatement st = con.prepareStatement(
				"select * from users where password = ? AND member_id=?");
		st.setString(1, password);
		st.setInt(2, memberId);
		ResultSet rs = st.executeQuery();

		while (rs.next()) {
			user = new Beans();
			user.setpassword(rs.getString("password"));
			user.setlast_name(rs.getString("last_name"));
			user.setfirst_name(rs.getString("first_name"));

		}
		rs.close();
		st.close();
		con.close();

		return user;

	}
}
