<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="./js/jquery-3.2.1.js"></script>
<script>
	/* $function(){
		$("[type='text']").val();
		
	} */
</script>
</head>
<body>
	<form action="test.lny" method="post">
		<ul>
			<!-- servlet에서 받을 때는 name으로 받고 html이나 css 또는 java script에서 받을 때는 id로 받기 -->
			<li>학번 : <input type="text" name="num" id="num1"> 
			<li>이름 : <input type="text" name="name" id="name2"> 
		</ul>
		
		
		<input type="submit">
	</form>
</body>
</html>