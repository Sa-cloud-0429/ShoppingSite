package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import beans.Beans;
import beans.UserBean;

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
	public int insert(UserBean user) throws Exception{
		int result=0;
		
		Connection con =getConnection();
		
		PreparedStatement st=con.prepareStatement(
				"INSERT INTO users (password, last_name, first_name, address, mail_address) VALUES (?, ?, ?, ?, ?)"
		    );
		    st.setString(1, user.getpassword());
		    st.setString(2, user.getlast_name());
		    st.setString(3, user.getfirst_name());
		    st.setString(4, user.getaddress());
		    st.setString(5, user.getmail_address());

		    result = st.executeUpdate(); 
		    st.close();
		    con.close();

		    return result;		
	}
	
	
}
