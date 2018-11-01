package com.cg.test.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class myServlet1
 */
@WebServlet(
		urlPatterns = { "/MyInfoServlet" }, 
		initParams = { 
				@WebInitParam(name = "name", value = "Myname", description = "Name"), 
				@WebInitParam(name = "Id", value = "ID")
		})
public class myServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public myServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String name=request.getParameter("txtname");
	    out.print("<HTML>");
	    out.print("<Head>");
	    out.print("<Body>");
	    out.print("<h1>Welcome"+name+"</h1>");
	    out.print("</Body>");
	    out.print("</Head>");
	    out.print("</HTML>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String name=request.getParameter("txtname");
	    out.print("<HTML>");
	    out.print("<Head>");
	    out.print("<Body>");
	    out.print("<h1>Welcome to Capg"+name+"</h1>");
	    out.print("</Body>");
	    out.print("</Head>");
	    out.print("</HTML>");
	}

}
