package com.webAPPDB.controller;

import java.io.IOException;

import java.sql.SQLException;
import java.util.Date;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.webAPPDB.dao.TestDAO;
import com.webAPPDB.model.Regis;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	TestDAO test;
       
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
      
    }
   
    
    @Override
    public void init() throws ServletException {
    	String jdbcURL=getServletContext().getInitParameter("jdbcURL");
    	String jdbcUserName=getServletContext().getInitParameter("jdbcUserName");
    	String jdbcPassword=getServletContext().getInitParameter("jdbcPassword");
    	System.out.println(jdbcURL);
    	
    	
    	try {
			test= new TestDAO(jdbcURL, jdbcUserName, jdbcPassword);
		} catch (SQLException e) {
			e.printStackTrace();
		}
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
		
		doGet(request, response);
				
		java.util.Date utilDate = new java.util.Date();
			
		
		
		String email= request.getParameter("textEmail");
		String title= request.getParameter("textTitle");
		String first_name= request.getParameter("textFirst_name");
		String last_name= request.getParameter("textLast_name");
		String address1= request.getParameter("textAddress_line1");
		String address2= request.getParameter("textAddress_line2");
		String city= request.getParameter("textCity");
		String postcode= request.getParameter("textPostcode");
		String telephone= request.getParameter("textTelephone");
		Date datesql= new java.sql.Timestamp(utilDate.getTime());
		String site= request.getParameter("textSite");
			
		
		response.setContentType("text/html");
		
		
		Regis regis= new Regis(null, datesql, email, title, first_name, last_name, address1, address2, city, postcode, telephone, site );
		if (test.register(regis)) {
			request.getRequestDispatcher("RegiCon.jsp").forward(request, response);
			System.out.println("Registration done");
			
			
			
		}else {
			System.out.println("Registration fail");
			String message = "Something wrong, the email has already been registered!";
			request.setAttribute("message", message);
			request.getRequestDispatcher("index.jsp").forward(request, response);

		
		if(test.check(regis) == 0)
		{
			
		}else {
			System.out.println("User has already been registered");
			}
			}
		}
		}
		
		