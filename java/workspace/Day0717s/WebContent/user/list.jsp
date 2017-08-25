<%@page import="java.util.List"%>
<%@ page import="kdata.project.dto.User" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- 회원 리스트를 만들어주려고 list.jsp -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
회원 리스트 - list.jsp
<!-- <form action="../list.kdata">
	<input type="submit" value="리스트">
</form> -->
<%
	List<User> list = (List<User>)request.getAttribute("list");
	/* out.print(list); */
%>
<!-- 이게 위의 두줄이랑 같다 (EL로 표시하면) -->
<%-- ${ requestScope.list } --%>
<table border="1">
	<tr>
		<th>아이디</th>
		<th>이름</th>
		<th>가입일</th>
	</tr>
	<%-- <tr>
		<%for(int i=0;i<list.size();i++){
			User u = list.get(i);%>
			<td><%= u.getId() %></td>
			<td><%= u.getName() %></td>
			<td><%= u.getRegDate() %></td>
	</tr>	
	<% } %> --%>
	
	<!-- jstl로 했을경우 
	대소문자 구분 잘해야함-->
	<c:forEach items="${ list }" var="user">
		<tr>
			<td><a href="detail.kdata?id=${user.id }">${user.id}</a></td>
			<td>${user.name }</td>
			<td>${user.regDate }</td>
		</tr>
	</c:forEach>
	
	
</table>

</body>
</html>