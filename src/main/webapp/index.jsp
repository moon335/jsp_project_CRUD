<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="errorPage.jsp" %>
<link rel="stylesheet" href="http://cdn.jsdelivr.net/npm/xeicon@2.3.3/xeicon.min.css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/swiper@9/swiper-bundle.min.css"/>
<script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/swiper@9/swiper-bundle.min.js"></script>
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
		height: 1700px;
	}
	
	section {
		display: flex;
		flex-direction: column;
		align-items: center;
		margin-bottom: 40px;
		height: 75%;
	}
	
	.carousel-control-prev-icon {
		background-color: #000;
	}
	
	.carousel-control-next-icon {
		background-color: #000;
	}
	
	#carouselExampleControls {
		margin-bottom: 150px;
	}
	
	.swiper {
      width: 1450px;
      height: 500px;
    }
    
    .swiper > h4 {
    	margin-left: 70px;
    }

    .swiper-slide {
      text-align: center;
      font-size: 18px;
      background: #fff;
      display: flex;
      justify-content: center;
      align-items: center;
    }

    .swiper-slide img {
      display: block;
      width: 100%;
      height: 100%;
      object-fit: cover;
    }
	
	.bx-group {
		display: flex;
		flex-direction: row;
	}
	
	.bx-group > div {
		flex: 1;
		box-shadow: 0 0 5px;
		rbga: 0 0 0 .2;
		margin: 20px;
	}
	
	.swiper-slide img {
	    display: block;
	    width: 300px;
	    height: 210px;
	    object-fit: cover;
	}
	
	.swiper-button-next.swiper-button-disabled, .swiper-button-prev.swiper-button-disabled {
	    opacity: 0;
	    cursor: auto;
	    pointer-events: none;
	}
	
	:root {
    	--swiper-theme-color: #000;
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
			<div class="carousel-item">
				<img src="images/존윅4.jpg" class="d-block w-100" alt="소울메이트">
			</div>
			<div class="carousel-item">
				<img src="images/귀멸의칼날.jpg" class="d-block w-100" alt="소울메이트">
			</div>
			<div class="carousel-item">
				<img src="images/리바운드.jpg" class="d-block w-100" alt="소울메이트">
			</div>
			<div class="carousel-item">
				<img src="images/치킨래빗.jpg" class="d-block w-100" alt="소울메이트">
			</div>
			<div class="carousel-item">
				<img src="images/에어.jpg" class="d-block w-100" alt="소울메이트">
			</div>
			<div class="carousel-item">
				<img src="images/아바타_물의길.jpg" class="d-block w-100" alt="소울메이트">
			</div>
			<div class="carousel-item">
				<img src="images/멍뭉이.jpg" class="d-block w-100" alt="소울메이트">
			</div>
			<div class="carousel-item">
				<img src="images/에어.jpg" class="d-block w-100" alt="소울메이트">
			</div>
			<div class="carousel-item">
				<img src="images/흐르다.jpg" class="d-block w-100" alt="소울메이트">
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
	<div class="swiper mySwiper">
		<h4>🎞무비차트</h4>
	    <div class="swiper-wrapper">
	      <div class="swiper-slide">
			<div class="bx-group">
				<div>
					<img src="images/slide_img_스즈메.jpg" alt="스즈메">
					<p>1위 스즈메의 문단속</p>
				</div>
				<div>
					<img src="images/slide_img_슬램덩크.jpg" alt="스즈메">
					<p>2위 더 퍼스트 슬램덩크</p>
				</div>
				<div>
					<img src="images/slide_img_던전앤드래곤.jpg" alt="스즈메">
					<p>3위 던전 앤 드래곤</p>
				</div>
				<div>
					<img src="images/slide_img_소울메이트.jpg" alt="스즈메">
					<p>4위 소울메이트</p>
				</div>
			</div>
	      </div>
	      <div class="swiper-slide">
	      	<div class="bx-group">
				<div>
					<img src="images/slide_존윅.jpg" alt="스즈메">
					<p>5위 존 윅 4</p>
				</div>
				<div>
					<img src="images/slide_리바운드.jpg" alt="스즈메">
					<p>6위 리바운드</p>
				</div>
				<div>
					<img src="images/slide_에어.jpg" alt="스즈메">
					<p>7위 에어</p>
				</div>
				<div>
					<img src="images/slide_img_웅남이.jpg" alt="스즈메">
					<p>9위 웅남이</p>
				</div>
			</div>
	      </div>
	      <div class="swiper-slide">
	      	<div class="bx-group">
				<div>
					<img src="images/slide_흐르다.jpg" alt="스즈메">
					<p>10위 흐르다</p>
				</div>
				<div>
					<img src="images/slide_치킨래빗.jpg" alt="스즈메">
					<p>11위 치킨래빗</p>
				</div>
				<div>
					<img src="images/slide_멍뭉이.jpg" alt="스즈메">
					<p>12위 멍뭉이</p>
				</div>
				<div>
					<img src="images/slide_아바타.jpg" alt="스즈메">
					<p>13위 아바타-물의 길</p>
				</div>
			</div>
	      </div>
    	</div>
	    <div class="swiper-button-next"></div>
	    <div class="swiper-button-prev"></div>
	 </div>
</section>
<script>
  var swiper = new Swiper(".mySwiper", {
      navigation: {
      	nextEl: ".swiper-button-next",
      	prevEl: ".swiper-button-prev",
    },
  });
</script>
<jsp:include page="/layout/footer.jsp" />

