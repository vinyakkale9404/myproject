<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.itrix.Controller.EmpServlets,com.itrix.Dao.EmpDao,com.itrix.Model.EmpMast,com.itrix.Service.EmpService,java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String sid=request.getParameter("emp_id");
int id=Integer.parseInt(sid);
EmpMast empMast=new EmpMast();
EmpService service=new EmpService();
empMast=service.getEmpById(id);
//response.sendRedirect("empView.jsp");
%>
<form action="EmpUpdateServlets" method="post">
	<table border="1" style="border:2px solid; background-color:#E6E6FA">
	<input type="hidden" name="emp_id" value="<%=empMast.getEmp_id()%>"/>
		
	
		<tr>
		<td>First Name</td>
		<td><input type="text" name="f_name" placeholder="Entert your First name" value="<%=empMast.getFirst_name()%>"/>
		</td>
		</tr>
	
	
		<tr>
		<td>Middle Name</td>
		<td><input type="text" name="m_name" placeholder="Enter your Middle name"value="<%=empMast.getMiddle_name()%>"/>
		</td>
		</tr>
	
	<tr>
	<td>Last Name</td>
	<td><input type="text" name="l_name" placeholder="Entert your last name"value="<%=empMast.getLast_name()%>"/>
	</td>
	</tr>
	
	
	
	<tr>
	<td>Mobile No.</td>
	<td><input type="text" name="mob_no" placeholder="Enter Mobile No."value="<%=empMast.getMob_no()%>"/>
	</td>
	</tr>
	
	<tr>
	<td>Email Id</td>
	<td><input type="text" name="email_id" placeholder="Entert your Email Id"value="<%=empMast.getEmail_id()%>"/>
	</td>
	</tr>
	
	
	
	<tr>
	<td>Designation:</td>
	<td><Select id="designation" name="design">
	<option value="">select</option>
	<option value="developer">Developer</option>
	<option value="tester">Tester</option>
	<option value="supporter">supporter</option>
	</Select>
	</td>
	</tr>
	
	<tr>
	<td>Department</td>
	<td><Select id="department" name="dept">
	<option value="">select</option>
	<option value="IT">Account</option>
	<option value="HR">Management</option>
	<option value="Finance">IT</option>
	</Select>
	</td>
	</tr>
	
	<tr>
	<td>Address</td>
	<td><input type="text" name="address" placeholder="Entert Employee Address"value="<%=empMast.getAddress()%>"/>
	</td>
	</tr>
	
	<tr>
	<td>Pancard No</td>
	<td><input type="text" name="pan_no" placeholder="Entert your Pancard No"value="<%=empMast.getPancard_no()%>"/>
	</td>
	</tr>
	
	<tr>
	<td>Adharcard No</td>
	<td><input type="text" name="adhar_no" placeholder="Enter Adharcard No"value="<%=empMast.getAdharcard_no()%>"/>
	</td>
	</tr>
	
	<tr>
	<td>Date join</td>
	<td><input type="text" name="date_join" placeholder="yyyy-MM-dd" value="<%=empMast.getDate_join()%>"/>
	</td>
	</tr>
	
	



	
	 <tr>
	<td colspan="2" style="text-align:center"><input type="submit" value="Update Employee" onclick="" ></td>
	</tr>
	<tr>
	<td>
				
	</td>
	</tr>
</table>

<h4><a href="empView.jsp">Employee View</a></h4>	
</form>

</body>
</html>