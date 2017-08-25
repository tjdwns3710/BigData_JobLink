<%@ page import="kdata.project.dto.User" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	User user = (User)request.getAttribute("User");
%>

${requestScope.user.profile}
<table border="1">
	<tr>
		<td>사진</td>
		<%-- <td><img src="./profile/${requestScope.user.profile}"></td> --%>
		<td><img src="./profile/<%= user.getProfile() %>"></td>
	</tr>
	<tr>
		<td>이름</td>
		<td><%= user.getName() %></td>
	</tr>		
</table>
</body>
</html>