<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
/* css 영역 */
	body {background-color:gold; color:red}
	
</style>
<script>
/* JavaScript 영역 */
function test(){
	window.alert("JavaScript 테스트!");
}

</script>
</head>
<body onload="test()">
<%
	Class.forName("java.lang.Object");
	out.print("<h1>jsp 영역 #1</h1>");
	
	for(int i=1;i<=10;i++)
		out.print("hello!<br>");
%>
<h1>HTML 영역!!!!!!!!!!!!!</h1>

<a href=""></a>

<img src=""></img>

<p align=""></p>



<%
out.print("jsp 영역 #2");
%>

</body>
</html>