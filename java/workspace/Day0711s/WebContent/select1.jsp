<%@page import="kdata.manager.Student"%>
<%@page import="java.util.List"%>
<%@page import="kdata.manager.StudentManager"%>
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

	String StuName1 = request.getParameter("name");
	StudentManager manager = new StudentManager();

	Student s2 = manager.selectByName(StuName1);

%>

<table border="1">
	<tr>
		<th>학번</th>
		<th>이름</th>
		<th>성별</th>
	</tr>
	<tr>
		<td><%= s2.getStuNum() %></td>
		<td><%= s2.getStuName() %></td>
		<td><%= s2.getStuGender() %></td>
	</tr>
	

</body>
</html>