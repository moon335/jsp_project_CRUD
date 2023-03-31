<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	* {
		box-sizing: border-box;
		margin: 0;
		padding: 0;
	}
	
	body {
		height: 100vh;
		display: flex;
		flex-direction: column;
		justify-content: center;
		align-items: center;
	}
	
	#img {
		margin: 30px;
	}
	
	#text {
		text-align: center;
		margin-bottom: 5px;
	}
	
	#text p:nth-child(1) {
		font-size: 30px;
		font-weight: bolder;
		color: blue;
	}
	
	#text p:nth-child(2) {
		font-size: 20px; 
	}
	
	button {
		border: none;
		border-radius: 5px;
		background-color: #99FCFF;
		padding: 10px;
		cursor: pointer;
	}
	
	button:hover {
		background-color: #0097DB;
		color: #fff;
	}
	
</style>
</head>
<body>
<%
	String img = application.getInitParameter("imgDir");
%>
	<div id="img">
		<img alt="에러 이미지" src="<%=img %>/error.png">
	</div>
	<div id="text">
		<p>Page not found</p>
		<p>올바른 URL을 입력하였는지 확인하세요.</p>
	</div>
	<button type="button">뒤로가기</button>
</body>
</html>