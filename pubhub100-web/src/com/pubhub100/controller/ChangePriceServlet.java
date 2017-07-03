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
 * Servlet implementation class ChangePriceServlet
 */
@WebServlet("/ChangePriceServlet")
public class ChangePriceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangePriceServlet() {
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
		String bprice=request.getParameter("bprice");
	    int price= Integer.parseInt(bprice);
		Book book=new Book();
		book.setBid(bookid);
		book.setBprice(price);
		BookDAO dao=new BookDAO();
		try {
			dao.changePrice(book);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
