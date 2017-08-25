<%@page import="kdata.manager.Student"%>
<%@page import="kdata.manager.StudentManager"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String stuNum = null;
	String stuName = null;
	String stuGender = null;
	
	StudentManager manager = new StudentManager();
	

	List<Student> list = manager.selectAll();

	
%>

<table border="1">
	<tr>
		<th>학번</th>
		<th>이름</th>
		<th>성별</th>
	</tr>
	<tr><%for(int i=0;i<list.size();i++){
		Student s2 = list.get(i);%>
		<td><%= s2.getStuNum() %></td>
		<td><%= s2.getStuName() %></td>
		<td><%= s2.getStuGender() %></td>
	</tr>
	<% } %>

	

</table>
</body>
</html>