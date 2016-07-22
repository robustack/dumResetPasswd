package com.small.resetpasswd.account;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.apache.log4j.Logger;





/**
 * Servlet implementation class AcctActivation
 */
@WebServlet("/ResetDone")
public class Done extends HttpServlet {
	private static final long serialVersionUID = 6546467233785L;
	//private Logger log = Logger.getLogger(Done.class);  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Done() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet( HttpServletRequest request, 
						  HttpServletResponse response) throws 
									ServletException, IOException {
			
	}

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(	HttpServletRequest request, 
							HttpServletResponse response) throws 
									ServletException, IOException {
		//PrintWriter pw = response.getWriter();
		//response.setContentType("text/html");

        String pass = request.getParameter("passwd");
        String conf_pass = request.getParameter("confPasswd");
        
        String key = request.getParameter("key");
        System.out.println("Eventually Key :" + key );
        String protocol = request.getParameter("protocol");
        System.out.println("Eventually Protocol :" + protocol );
        
		if ( key == null || protocol == null ) {
		 	response.setContentType("text/html");
	        PrintWriter printWriter  = response.getWriter();
	        printWriter.println("<h3>Invalid Command.</h3>");
	        printWriter.println("<h4>Illegal type of use.</h4>");
	        return;
		} 
		
        if( pass.equals(conf_pass) ) {
        	
			response.sendRedirect("passwd-changed.html");
	        return;

       	
        } else {
	        PrintWriter printWriter  = response.getWriter();
	        printWriter.println("<h3>Check your input.</h3>");
	        printWriter.println("<h4>Password and Confirm Password are not identical.</h4>");
	        printWriter.println("<h4>Please retry again.</h4>");
	        return;
        }

	}



}
