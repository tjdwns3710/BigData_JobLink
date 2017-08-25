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
		//자바 스크립트니까 name으로 넘어온다.
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		if(id.equals("test")&& password.equals("1234")){
			//세션에 키와 값을 저장
			session.setAttribute("id", id);
			
			//원래는 DB에서 꺼내와서 저장해야 한다.
			session.setAttribute("name", "홍길동");
			
			//성공했을 때 메인으로 가기
			response.sendRedirect("main.jsp");
		}else{
			//실패했을 때 로그인 페이지로 가기
			response.sendRedirect("login.html");
		}
	%>
</body>
</html>