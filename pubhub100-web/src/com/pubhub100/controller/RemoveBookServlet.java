package com.pubhub100.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pubhub100.dao.BookDAO;
import com.pubhub100.model.Book;

/**
 * Servlet implementation class RemoveBookServlet
 */
@WebServlet("/RemoveBookServlet")
public class RemoveBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RemoveBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String bid=request.getParameter("bid");
		int bookid=Integer.parseInt(bid);
		String bname=request.getParameter("bname");
		Book book=new Book();
		book.setBid(bookid);
		book.setBname(bname);
		BookDAO dao=new BookDAO();
		try {
			dao.removeBook(book);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
