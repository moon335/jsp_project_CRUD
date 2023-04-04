<%@page import="com.cgv.dto.UserDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	if(request.getAttribute("userDto") != null){
		UserDTO userDto = (UserDTO)request.getAttribute("userDto");
		if(userDto.getUserId() != null) {
			session.setAttribute("userId", userDto.getUserId());
			session.setAttribute("password", userDto.getPassword());
			response.sendRedirect("/myweb/connector?action=index");
		} else {
			out.println("<script>alert('아이디와 비밀번호를 확인해주세요.'); location.href='/myweb/connector?action=login' </script>");
		}
	}
%>
<jsp:include page="/layout/header.jsp"/>
<style type="text/css">
	* {
		box-sizing: border-box;
		margin: 0;
		padding: 0;
	}
	body {
		height: 100vh;
	}
	#username {
		background-image: url(images/username.png);
		background-repeat: no-repeat;
		box-sizing: border-box;
		padding-left: 35px;
		height: 30px;
		border: 2px solid #ccc;
		border-radius: 5px;
	}
	
	#password {
		background-image: url(images/password.png);
		background-repeat: no-repeat;
		box-sizing: border-box;
		padding-left: 35px;
		height: 30px;
		border: 2px solid #ccc;
		border-radius: 5px;
	}
	
	section {
		display: flex;
		flex-direction: column;
		justify-content: center;
		align-items: center;
		height: 40%;
	}
	
	.sectionDiv input[type=submit] {
		padding: 10px 80px;
		border: none;
		border-radius: 5px;
		background-color: #FB4357;
		color: #fff;
		cursor: pointer;
	}
	
	.wrap {
		border-top: 2px solid #ccc;
		border-bottom: 2px solid #ccc;
		padding: 60px 0;
	}
	
	.sectionDiv p {
		font-size: 10px;
	}
	
	.sectionDiv {
		display: flex;
		flex-direction: column;
		justify-content: center;
		align-items: center;
		margin-bottom: 8px;
	}
	
</style>
	<section>
		<div class="wrap">
			<div class="sectionDiv">
				<p>아이디 비밀번호를 입력하신 후, 로그인 버튼을 클릭해 주세요.</p>
			</div>
			<form action="/myweb/userController?action=login" method="post">
				<div class="sectionDiv">
					<input type="text" id="username" name="username" required="required">
				</div>
				<div class="sectionDiv">
					<input type="password" id="password" name="password" required="required">
				</div>
				<div class="sectionDiv">
					<input type="submit" value="로그인" id="loginbutton">
				</div>
			</form>
		</div>
	</section>
<jsp:include page="/layout/footer.jsp"/>