<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String idS = (String)session.getAttribute("id");
		String nameS = (String)session.getAttribute("name");
		
		if(idS != null)
			out.print(idS + "(" + nameS + ")님 환영합니다");
		else
			response.sendRedirect("login.html");
	
		
	%>
	
<a href="logout.jsp">로그아웃</a>
</body>
</html>