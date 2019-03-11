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
 * Servlet implementation class EmpUpdateServlets
 */
@WebServlet("/EmpUpdateServlets")
public class EmpUpdateServlets extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
		String sid=request.getParameter("emp_id");
		int id=Integer.parseInt(sid);
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
		      int adhar=Integer.valueOf(adhar_no);
		 String date_join=request.getParameter("date_join");
	  java.sql.Date joindate=conversion.convertStrToDate(date_join);
	  
	  
	  
	   EmpMast empMast=new EmpMast();
	   	empMast.setEmp_id(id);
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
		int status=service.empUpdate(empMast);
		
				 
			      if(status>=0)
			        {
			        	out.print("<p>Record Save Succesfully...!</p>");
			        	RequestDispatcher rd=request.getRequestDispatcher("empView.jsp");
			        	rd.include(request, response);
			        }
			        else
			        {
			        	out.println("Unable to save");
			        }
			        out.close();
	}

	
}
