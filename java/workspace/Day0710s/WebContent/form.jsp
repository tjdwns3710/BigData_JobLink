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
// form.html에서 넘어오는 name이 여기에 들어옴 
//파라미터의 "id"안의 문자는 html의 name="id"랑 같아야 함
//왼쪽의 String id 는 이제 여기서 id를 쓰는것
	String id= request.getParameter("id");
	out.print(id);
	String name= request.getParameter("name");
	out.print(name);
	String pwd= request.getParameter("pwd");
	out.print(pwd);

%>
</body>
</html>