<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
<%
	String stuNum = request.getParameter("num");
	String stuName=request.getParameter("name");
	String stuGender=request.getParameter("gender");
	String color=request.getParameter("col");
	String url=request.getParameter("url");
	
	/* out.print(stuNum + "<br>");
	out.print(stuName + "<br>");
	out.print(stuGender); */

	/* out.print("<table border='1'><tr><th>학번</th><td>"+stuNum+"</td></tr>");
	out.print("<tr><th>이름</th><td>"+stuName+"</td></tr>");
	out.print("<tr><th>성별</th><td>"+stuGender+"</td></tr></table>"); */
%>
</head>
<%-- <body bgcolor="<%out.print(color);%>"> --%>
<body bgcolor="<%= color %>">

<table border="1">
	<tr>
		<th>학번</th>
		<td><%= stuNum %></td>
	</tr>
	<tr>
		<th>이름</th>
		<td><a href="<%= url %>"><%= stuName %></a></td>
	</tr>
	<tr>
		<th>성별</th>
		<td><%
			if(stuGender==null){
				out.print("성별을 선택하지 않았습니다.");
			}else if(stuGender=="F"){
				out.print("여자");
			}else if(stuGender=="M"){
				out.print("남자");
			}else out.print(stuGender);
		%></td>
	</tr>
	<tr>
		<th>URL</th>
		<td><%= url %></td>
	</tr>
</table>

</body>
</html>


