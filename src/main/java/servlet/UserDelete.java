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

@WebServlet(urlPatterns = { "/servlet/userdelete" })
public class UserDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {

			HttpSession session = request.getSession(false);
			Beans user = (Beans) session.getAttribute("user");

			Beans deleteUser = new Beans();
			deleteUser.setMemberId(user.getMemberId());

			UserDAO dao = new UserDAO();
			boolean result = dao.delete(deleteUser);

			System.out.println("◆ 削除対象のID：" + deleteUser.getMemberId());

			if (result) {
				session.invalidate();
				request.getRequestDispatcher("../views/userDeleteSuccess.jsp")
						.forward(request, response);

			} else {
				request.getRequestDispatcher("../views/userDeleteSuccess.jsp")
				.forward(request, response);
			}

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
