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
	//세션에 있는 값 따로따로 지우는 것
	session.removeAttribute("id");
	session.removeAttribute("name");
	
	//세션에 있는 값 한 번에 지우기
	session.invalidate();
	

	
	//성공했을 때 메인으로 가기
	response.sendRedirect("login.html");
%>
</body>
</html>