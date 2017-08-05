package com.bdqn.firstajax;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class first
 */
@WebServlet("/first")
public class first extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String uname=request.getParameter("uname");
	String result=null;
	if(uname.equals("admin")){
		result="ok";
		response.getWriter().print(result);
		
	}else{
		result="no";
		response.getWriter().print(result);
	};
//	PrintWriter pw=new PrintWriter(result);
//	pw.flush();
//	pw.close();
	
	}

}
