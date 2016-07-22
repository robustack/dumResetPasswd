package com.small.resetpasswd.account;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.apache.log4j.Logger;



/**
 * Servlet implementation class resetPasswd
 */
@WebServlet("/resetPasswd")
public class resetPasswd extends HttpServlet {
	private static final long serialVersionUID = 465424977878653321L;
	//private Logger log = Logger.getLogger(resetPasswd.class);  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public resetPasswd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet( HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		String key = null;
		
		if ( ( key = request.getParameter("key")) == null ) {
			key = "no_key";
		}

		String protocol = request.getProtocol();

		System.out.println("URL : resetPasswd.html?key=" + key + "&protocol=" + protocol);
        response.sendRedirect("resetPasswd.html?key=" + key + "&protocol=" + protocol);
        return;

		
	}



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	

	

}
