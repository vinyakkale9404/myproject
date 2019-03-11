<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.itrix.Model.EmpMast,com.itrix.Dao.EmpDao,com.itrix.Service.EmpService" %>
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
EmpService service=new EmpService();
int status=service.empDelete(id);
response.sendRedirect("empView.jsp");
%>
</body>
</html>