package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import beans.Beans;
import dao.UserDAO;

/**
 * Servlet implementation class UserAdd
 */
@WebServlet(urlPatterns = { "/views/user-add" })
public class UserAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			String member_id = request.getParameter("member_id");
			String password = request.getParameter("password");
			String last_name = request.getParameter("last_name");
			String first_name = request.getParameter("first_name");
			String address = request.getParameter("address");
			String mail_address = request.getParameter("mail_address");

			Beans user = new Beans();
			user.setMemberId(member_id);
			user.setPassword(password);
			user.setLastName(last_name);
			user.setFirstName(first_name);
			user.setAddress(address);
			user.setMailAddress(mail_address);

			UserDAO dao = new UserDAO();
			
			
			boolean exists = dao.check(user.getMemberId());
			if(exists) {
				response.sendRedirect("../views/userAddError.jsp");
				return;
			}
			
			
			int result = dao.insert(user);

			if (result > 0) {

				request.setAttribute("user", user);
				request.getRequestDispatcher("../views/userAddConfirm.jsp").forward(request, response);
			}else {
				response.sendRedirect("../views/userAddError.jsp");
			}

		} catch (Exception e) {
			e.printStackTrace();

			request.getRequestDispatcher("../views/userAddError.jsp").forward(request, response);

		}
	}

}
