<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="errorPage.jsp" %>
<%
	String username = (String)session.getAttribute("userId");
	if(username == null) {
		response.sendRedirect("index.jsp");
	}
%>
<jsp:include page="/layout/header2.jsp"/>
<style type="text/css">
	* {
		box-sizing: border-box;
		margin: 0;
		padding: 0;
	}
	
	body {
		height: 100vh;
	}
	
	li {
		list-style: none;
	}

	section {
		display: flex;
		justify-content: center;
		margin-bottom: 40px;
	}
	
	.slider {
		overflow: hidden;
		margin: 0 auto;
		
	}
	
	.slider input[type=radio] {
		display: none;
	}
	
	ul.imgs {
		padding: 0;
		margin: 0;
		list-style: none;
		display: flex;
		justify-content: center;
	}
	
	ul.imgs li {
		position: absolute;
		transition-delay: 1s;
	}
	
	section {
		height: 75%;
	}
	
	.bullets {
		height: 75%;
		position: absolute;
		transform: translateX(-50%);
		z-index: 2;
		
		display: flex;
		justify-content: center;
		align-items: flex-end;
	}
	
	.bullets label {
		display: inline-block;
		border-radius: 50%;
		background-color: rgba(0, 0, 0, 0.55);
		width: 20px;
		height: 20px;
		cursor: pointer;
	}
	
	.slider input[type=radio]:nth-child(1):checked~.bullets>label:nth-child(1){
		background-color: #fff;
	}
	
	.slider input[type=radio]:nth-child(2):checked~.bullets>label:nth-child(2){
		background-color: #fff;
	}
	
	.slider input[type=radio]:nth-child(3):checked~.bullets>label:nth-child(3){
		background-color: #fff;
	}
	
	.slider input[type=radio]:nth-child(4):checked~.bullets>label:nth-child(4){
		background-color: #fff;
	}
	
	.slider input[type=radio]:nth-child(5):checked~.bullets>label:nth-child(5){
		background-color: #fff;
	}
	
	.slider input[type=radio]:nth-child(1):checked~ul.imgs>li:nth-child(1) {
		transition: 0.5s;
		z-index: 1;
	}
	
	.slider input[type=radio]:nth-child(2):checked~ul.imgs>li:nth-child(2) {
		transition: 0.5s;
		z-index: 1;
	}
	
	.slider input[type=radio]:nth-child(3):checked~ul.imgs>li:nth-child(3) {
		transition: 0.5s;
		z-index: 1;
	}
	
	.slider input[type=radio]:nth-child(4):checked~ul.imgs>li:nth-child(4) {
		transition: 0.5s;
		z-index: 1;
	}
	
	.slider input[type=radio]:nth-child(5):checked~ul.imgs>li:nth-child(5) {
		transition: 0.5s;
		z-index: 1;
	}
</style>
	<section>
		<div class="slider">
			<input type="radio" name="slide" id="slide1" checked>
			<input type="radio" name="slide" id="slide2">
			<input type="radio" name="slide" id="slide3">
			<input type="radio" name="slide" id="slide4">
			<input type="radio" name="slide" id="slide5">
			<ul id="imgholder" class="imgs">
				<li><img src="images/문단속.jpg"></li>
				<li><img src="images/슬램덩크.jpg"></li>
				<li><img src="images/웅남이.jpg"></li>
				<li><img src="images/던전앤드래곤.jpg"></li>
				<li><img src="images/소울메이트.jpg"></li>
			</ul>
			<div class="bullets">
				<label for="slide1">&nbsp;</label>
				<label for="slide2">&nbsp;</label>
				<label for="slide3">&nbsp;</label>
				<label for="slide4">&nbsp;</label>
				<label for="slide5">&nbsp;</label>
			</div>
		</div>
	</section>
<jsp:include page="/layout/footer.jsp"/>
