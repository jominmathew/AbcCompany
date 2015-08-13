package com.abc.core;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.abc.api.DatabaseConnect;

/**
 * Servlet implementation class Login
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ResultSet rs = DatabaseConnect.executeQuery("Select * from abc;");
		
		try {
			while(rs.next()){
				
				System.out.println(rs.getString(""));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ResultSet rs = DatabaseConnect.executeQuery("Select * from UserTab;");
		try{
			while(rs.next()){ 
				
		int user_id = rs.getInt("user_Id");
		//String user_name = rs.getString("user_name");
		String password = rs.getString("user_pwd");
		String first_name = rs.getString("user_Fname");
		String last_name = rs.getString("user_Lname");
		Date date = rs.getDate("date");
		String userID = request.getParameter("username");
		String pass_word = request.getParameter("password");
		
		HttpSession session = request.getSession();
		
		if(userID.equals(user_id) && pass_word.equals(password)){
			RequestDispatcher req = request.getRequestDispatcher("");
		}else{
			request.setAttribute("errorMessage", "Invalid User/Password");
			RequestDispatcher reqDispatcher = request.getRequestDispatcher("");
			reqDispatcher.forward(request, response);
		}
		}
		}catch(SQLException e){
			
		}
		
		doGet(request, response);
	}

}
