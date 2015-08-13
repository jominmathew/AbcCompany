package com.abc.core;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registration
 */
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration() {
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
		/*Boolean check = ComputerList.insertUT("request.getParameter("user_pwd")", "request.getParameter("user_Lname")", "request.getParameter("user_Fname")");
		  if(check){
		  request.setAttribute("Message", "Successfully Registered");
		  RequestDispatcher reqDispatcher = request.getRequestDispatcher("");
		  reqDispatcher.forward(request, response);
		  }
		  else{
		  request.setAttributr("ErrorMessage", "Not Registered")
		  RequestDispatcher reqDispatcher = request.getRequestDispatcher("");
		  reqDispatcher.forward(request, response);
		  }
		  */
		doGet(request, response);
		
	}

}
