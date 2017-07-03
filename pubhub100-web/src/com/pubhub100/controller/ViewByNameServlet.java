package com.pubhub100.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pubhub100.dao.BookDAO;
import com.pubhub100.model.Book;

/**
 * Servlet implementation class ViewByNameServlet
 */
@WebServlet("/ViewByNameServlet")
public class ViewByNameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		BookDAO dao=new BookDAO();
		try {
			List<Book> book=dao.viewByName(request.getParameter("bname"));
			RequestDispatcher rd=request.getRequestDispatcher("viewByName.jsp");
			request.setAttribute("list", book);
			rd.forward(request, response);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
