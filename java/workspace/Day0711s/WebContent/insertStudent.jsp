<%@page import="java.util.List"%>
<%@page import="kdata.manager.Student"%>
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
insertStudent.jsp
<%
	String stuNum = request.getParameter("num");
	String stuName=request.getParameter("name");
	String stuGender=request.getParameter("gender");
	
	StudentManager manager = new StudentManager();
	Student s = new Student(stuNum,stuName,stuGender);
	
	int result = manager.insert(s);
	
	if(result == 1)
		out.println("정보가 추가 되었습니다.<br>");
	else
		out.println("정보가 추가 되지 않았습니다.<br>");
	
	List<Student> list = manager.selectAll();
	
	for(Student s2:list) {
		out.println(s2+"<br>");
	}
	
%>


</body>
</html>