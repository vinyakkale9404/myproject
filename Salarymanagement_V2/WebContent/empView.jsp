<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.itrix.Model.EmpMast,com.itrix.Dao.EmpDao,com.itrix.Service.EmpService,java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
EmpService service=new EmpService();
List<EmpMast> list=service.getEmpDetails();
request.setAttribute("list",list);
%>
<table border="2px" width="100%">
<tr><th>Id</th><th>Fname</th><th>Mname</th><th>Lastname</th><th>mob_no</th><th>email_id</th><th>designation</th><th>department</th><th>address</th><th>pancard_no</th><th>adharcard_no</th><th>date_join</th><th>Edit</th><th>Delete</th></tr>
<%
for(EmpMast empmast:list)
{
	out.print("<tr><td>"+empmast.getEmp_id()+"</td><td>"+empmast.getFirst_name()+"</td><td>"+empmast.getMiddle_name()+"</td><td>"+empmast.getLast_name()+"</td><td>"+empmast.getMob_no()+"</td><td>"+empmast.getEmail_id()+"</td><td>"+empmast.getDesignation()+"</td><td>"+empmast.getDepartment()+"</td><td>"+empmast.getAddress()+"</td><td>"+empmast.getPancard_no()+"</td><td>"+empmast.getAdharcard_no()+"</td><td>"+empmast.getDate_join()+"</td><td>"+"<a href='empUpdate.jsp?emp_id="+empmast.getEmp_id()+"'>edit</a></td><td><a href='empDelete.jsp?emp_id="+empmast.getEmp_id()+"'>delete</a></td></tr>");
}

%>
</body>
</html>
