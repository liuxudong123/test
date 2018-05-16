<%@page import="com.test.bean.TestBean"%>
<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    	<%List listtest = (List)request.getAttribute("listtest"); %>
    	<table border="1" align="center">
    		<tr>
    			<td>empno</td>
    			<td>ename</td>
    			<td>sal</td>
    			<td>comm</td>
    			<td>hiredate</td>
    		</tr>
    		<%
    		for(int i=0;i<listtest.size();i++)
    		{
    		TestBean test = (TestBean)listtest.get(i);
    		%>
    		<tr>
    			<td><%=test.getEmpno() %></td>
    			<td><%=test.getEname() %></td>
    			<td><%=test.getSal() %></td>
    			<td><%=test.getComm() %></td>
    			<td><%=test.getHiredate() %></td>
    		</tr>
    		<% }%> 
    	
    	</table>
  </body>
</html>
