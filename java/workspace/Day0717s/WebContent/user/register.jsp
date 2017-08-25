<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- 가입할 수 있는 폼을 만들어주는 것 
db를 다녀올 필요가 없음-->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="../js/jquery-3.2.1.min.js"></script>
<script>
	$(function(){
		//alert("ggg");
		//중복확인
		$("#idcheck").click(function(){
			//alert("ggg");
			$.ajax({
				url : "../idcheck.kdata",
				data : {"id" : $("#id").val()},
				dataType : "text",
				success : function(data){
					//console.log("success");
					//console.log(data);
					if(data == 0)
						$("#msg").html("중복").css("color","red");
					else
						$("#msg").html("사용가능");
				},
				error : function(){
					console.log("error");
				}

				
			});
			
		});
			
	});

</script>
</head>
<body>
<%@ include file="../common/menu.jsp" %>

회원가입 - register.jsp
<!-- 파일업로드
 - get방식으로 할 수 없음
 - 이미지는 문자 인코딩이 아닐 수 있음
 그래서 두가지를 바꿔줘햐 함 -->
<form action="../register.kdata" method="post" enctype="multipart/form-data">
	<ul>
		<li>아이디 : <input type="text" name="id" id="id" value="test">
					<input type="button" value="중복확인" id="idcheck">
					<span id="msg"></span>
		<li>비밀번호 : <input type="password" name="pwd" value="1234">
		<li>이름 : <input type="text" name="name" value="홍길동">
		<li>프로필 사진 : <input type="file" name="file">
	</ul>
	<input type="submit" value="회원가입">
	
</form>

</body>
</html>