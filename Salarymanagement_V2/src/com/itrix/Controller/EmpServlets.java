package com.itrix.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itrix.Model.EmpMast;
import com.itrix.Service.EmpService;
import com.itrix.Utility.Conversion;

/**
 * Servlet implementation class EmpServlets
 */
@WebServlet("/EmpServlets")
public class EmpServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpServlets() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		System.out.println("servlets start");
		Conversion conversion=new Conversion();
		 String fname=request.getParameter("f_name");
		 String mname=request.getParameter("m_name");
		 String lname=request.getParameter("l_name");
		 String mobno=request.getParameter("mob_no");
		 String email=request.getParameter("email_id");
		 String design=request.getParameter("design");
		 String dept=request.getParameter("dept");
		 String address=request.getParameter("address");
		 String pan_no=request.getParameter("pan_no");
		 String adhar_no=request.getParameter("adhar_no");
		      int adhar=Integer.parseInt(adhar_no);
		 String date_join=request.getParameter("date_join");
	  java.sql.Date joindate=conversion.convertStrToDate(date_join);
		 
		 
		 EmpMast empMast=new EmpMast();
		 empMast.setFirst_name(fname);
		 empMast.setMiddle_name(mname);
		 empMast.setLast_name(lname);
		 empMast.setMob_no(mobno);
		 empMast.setEmail_id(email);
		 empMast.setDesignation(design);
		 empMast.setDepartment(dept);
		 empMast.setAddress(address);
		 empMast.setPancard_no(pan_no);
		 empMast.setAdharcard_no(adhar_no);
	    empMast.setDate_join(joindate);
		 
		 
		 
		 EmpService service=new EmpService();
		int status=service.empInsert(empMast);
		
				 
			      if(status>=0)
			        {
			        	out.print("<p>Record Save Succesfully...!</p>");
			        	RequestDispatcher rd=request.getRequestDispatcher("empmast.jsp");
			        	rd.include(request, response);
			        }
			        else
			        {
			        	out.println("Unable to save");
			        }
			        out.close();
	}
	}
	

