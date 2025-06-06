package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import beans.Beans;
import dao.UserDAO;

/**
 * Servlet implementation class UserEditConfirm
 */
@WebServlet(urlPatterns = { "/views/user-edit-confirm" })
public class UserEditConfirm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			String last_name = request.getParameter("last_name");
			String first_name = request.getParameter("first_name");
			String address = request.getParameter("address");
			String mail_address = request.getParameter("mail_address");

			HttpSession session = request.getSession();
			Beans user = (Beans) session.getAttribute("user");

			//			System.out.println("user: " + user);//★ログ//
			//			System.out.println("member_id: " + user.getMemberId());

			if(user==null) {
				response.sendRedirect("login-in.jsp");
				return;
			}
			Beans updateUser = new Beans();
			updateUser.setMemberId(user.getMemberId());
			updateUser.setPassword(user.getPassword());
			updateUser.setLastName(last_name);
			updateUser.setFirstName(first_name);
			updateUser.setAddress(address);
			updateUser.setMailAddress(mail_address);

			UserDAO dao = new UserDAO();

			int result = dao.update(updateUser);
			//			System.out.println("更新結果: " + result);

			if (result > 0) {
				session.setAttribute("user", updateUser);
				request.setAttribute("updateUser", updateUser);
				request.getRequestDispatcher("../views/userEditConfirm.jsp")
						.forward(request, response);
				//エラーページにフォワード//
			} else {
				request.setAttribute("updateUser", updateUser);
				request.getRequestDispatcher("../views/userEditConfirm.jsp")
						.forward(request, response);
			}

			//			if (user == null) {
			//
			//				System.out.println("Session user is null!");
			//			}
			//
			//			System.out.println("member_id = " + user.getMemberId());
			//エラーページにフォワード//
		} catch (Exception e) {
			e.printStackTrace();
			request.getRequestDispatcher("../views/userEditConfirm.jsp")
					.forward(request, response);

		}
	}
}
