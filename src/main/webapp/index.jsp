<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="errorPage.jsp" %>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
<%
	String username = (String)session.getAttribute("userId");
	if(username != null) {%>
		<jsp:include page="/layout/header2.jsp" />
	<% } else {%>
		<jsp:include page="/layout/header.jsp" />
	<%} %>
<style type="text/css">
	* {
		box-sizing: border-box;
		margin: 0;
		padding: 0;
	}
	
	body {
		height: 100vh;
	}
	
	section {
		display: flex;
		justify-content: center;
		margin-bottom: 40px;
		height: 75%;
	}
	
	.carousel-control-prev-icon {
		background-color: #000;
	}
	
	.carousel-control-next-icon {
		background-color: #000;
	}
	
</style>
<section>
	<div id="carouselExampleControls" class="carousel slide"
		data-ride="carousel">
		<div class="carousel-inner">
			<div class="carousel-item active">
				<img src="images/문단속.jpg" class="d-block w-100" alt="스즈메">
			</div>
			<div class="carousel-item">
				<img src="images/슬램덩크.jpg" class="d-block w-100" alt="슬램덩크">
			</div>
			<div class="carousel-item">
				<img src="images/웅남이.jpg" class="d-block w-100" alt="웅남이">
			</div>
			<div class="carousel-item">
				<img src="images/던전앤드래곤.jpg" class="d-block w-100" alt="던전앤드래곤">
			</div>
			<div class="carousel-item">
				<img src="images/소울메이트.jpg" class="d-block w-100" alt="소울메이트">
			</div>
		</div>
		<button class="carousel-control-prev" type="button" data-target="#carouselExampleControls" data-slide="prev">
			<span class="carousel-control-prev-icon" aria-hidden="true"></span> 
			<span class="sr-only">Previous</span>
		</button>
		<button class="carousel-control-next" type="button" data-target="#carouselExampleControls" data-slide="next">
			<span class="carousel-control-next-icon" aria-hidden="true"></span> 
			<span class="sr-only">Next</span>
		</button>
	</div>
</section>
<jsp:include page="/layout/footer.jsp" />

