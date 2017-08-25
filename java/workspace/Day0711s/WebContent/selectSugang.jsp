<%@page import="kdata.manager.Sugang"%>
<%@page import="java.util.List"%>
<%@page import="kdata.manager.SugangManager"%>
<%@page import="java.sql.Date"%>
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
	String subCode = null;
	String subName = null;
	String stuNum = null;
	String stuName = null;
	int signGrade = 0;
	Date signDate;
	
	SugangManager smanager = new SugangManager();
	
	List<Sugang> list = smanager.selectAll();
	
%>

<table border="1">
	<tr>
		<th>과목번호</th>
		<th>과목명</th>
		<th>학번</th>
		<th>이름</th>
		<th>성적</th>
		<th>신청일</th>
	</tr>
	<tr>
		<%for(int i=0;i<list.size();i++){
			Sugang s = list.get(i);%>
			<td><%= s.getSubCode() %></td>
			<td><%= s.getSubName() %></td>
			<td><%= s.getStuNum() %></td>
			<td><a href="select1.jsp?name=<%=s.getStuName()%>"><%=s.getStuName() %></a></td>
			<td><%= s.getSignGrade() %></td>
			<td><%= s.getSignDate() %></td>
	</tr>
	<% } %>
	

</table>
</body>
</html>