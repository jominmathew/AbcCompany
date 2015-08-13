package com.abc.core;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.abc.api.MyCart;

/**
 * Servlet implementation class AddToCart
 */
public class AddToCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final String MY_CART_LIST_NAME= "myCartList";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddToCart() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		HttpSession httpSession = request.getSession();
		if(httpSession.getAttribute(MY_CART_LIST_NAME) == null){
			httpSession.setAttribute(MY_CART_LIST_NAME, new ArrayList<MyCart>());
		}
		
		ArrayList<MyCart> myCartList = (MyCart)httpSession.getAttribute(MY_CART_LIST_NAME);
		
		MyCart cart = new MyCart();
		cart.setComputerId(0);
		cart.setUserId(0);
		myCartList.add(cart);
		
		
	}

}
