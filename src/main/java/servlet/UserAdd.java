package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import beans.UserBean;
import dao.UserDAO;

/**
 * Servlet implementation class UserAdd
 */
@WebServlet(urlPatterns = { "/servlet/user-add" })
public class UserAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {

			String password = request.getParameter("password");
			String last_name = request.getParameter("last_name");
			String first_name = request.getParameter("first_name");
			String address = request.getParameter("address");
			String mail_address = request.getParameter("mail_address");

			UserBean user = new UserBean();
			user.setpassword(password);
			user.setlast_name(last_name);
			user.setfirst_name(first_name);
			user.setaddress(address);
			user.setmail_address(mail_address);

			UserDAO dao = new UserDAO();
			int result = dao.insert(user);

			if (result > 0) {
				response.sendRedirect(request.getContextPath()+"views/userSuccess.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("views/userSuccess.jsp");

		}
	}

}
