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
 * Servlet implementation class servlet
 */
@WebServlet(urlPatterns = { "/views/login-servlet" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {

			int id = Integer.parseInt(request.getParameter("ID")); // name="ID" の入力値
			String password = request.getParameter("password");

			UserDAO dao = new UserDAO();
			Beans user = dao.login(id, password);

			if (user == null) {

				request.getRequestDispatcher("/views/login-error.jsp")
						.forward(request, response);
				return;
			}

			request.setAttribute("user", user);
			request.getRequestDispatcher("/views/user-menu.jsp")
					.forward(request, response);

		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("/views/login-error.jsp");
		}
	}
}
