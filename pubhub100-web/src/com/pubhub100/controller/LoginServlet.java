package com.pubhub100.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pubhub100.dao.UserDAO;
import com.pubhub100.model.User;


/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		User user = new User();
		UserDAO dao = new UserDAO();
		try {
			boolean flag=dao.login(user);
			if (flag)
			{
				response.sendRedirect("Success.jsp");
			}
				else
				{
					response.sendRedirect("Failure.jsp");	
				}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//response.sendRedirect("Failure.jsp");
		}

	}

}
