<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CGV 따라하기</title>
<link rel="stylesheet" href="/myweb/css/header.css">
</head>
<body>
	<header>
		<div id="top">
			<div id="logo">
				<a href="index.jsp"><img alt="대충 로고 파일" src="images/cgv로고.png"></a>
			</div>
			<div id="menu">
				<img alt="카드광고" src="images/카드광고.png">
				<a href="login.jsp"><img alt="로그인" src="images/로그인.png"></a>
				<a href="signUp.jsp"><img alt="회원가입" src="images/회원가입.png"></a>
				<a href="/myweb/userController?action=needLogin"><img alt="내정보" src="images/내정보.png"></a>
				<a href="http://www.cgv.co.kr/support/default.aspx"><img alt="고객센터" src="images/고객센터.png"></a>
			</div>
		</div>
		<div id="index">
			<ul class="nav-depth1">
                <li>
                    <a href="#">영화</a>
                    <ul class="nav-depth2">
                        <li><a href="#"><strong>영화</strong></a></li>
                        <li><a href="#">무비차트</a></li>
                        <li><a href="#">아트하우스</a></li>
                        <li><a href="#">ICECON</a></li>
                    </ul>
                </li>
                <li>
                    <a href="http://www.cgv.co.kr/theaters/">극장</a>
                    <ul class="nav-depth2">
                        <li><a href="http://www.cgv.co.kr/theaters/"><strong>극장</strong></a></li>
                        <li><a href="http://www.cgv.co.kr/theaters/">CGV극장</a></li>
                        <li><a href="http://www.cgv.co.kr/theaters/special/defaultNew.aspx">특별관</a></li>
                    </ul>
                </li>
                <li>
                    <a href="/myweb/ticketController?action=needLogin">예매</a>
                    <ul class="nav-depth2">
                        <li><a href="/myweb/ticketController?action=needLogin"><strong>예매</strong></a></li>
                        <li><a href="/myweb/ticketController?action=needLogin">빠른예매</a></li>
                        <li><a href="#">상영스케줄</a></li>
                        <li><a href="#">English Ticketing</a></li>
                        <li><a href="#">English Schedule</a></li>
                    </ul>
                </li>
                <li>
                    <a href="#">스토어</a>
                    <ul class="nav-depth2">
                        <li><a href="#"><strong>스토어</strong></a></li>
                        <li><a href="#">패키지</a></li>
                        <li><a href="#">영화관람권</a></li>
                        <li><a href="#">기프트카드</a></li>
                        <li><a href="#">콤보</a></li>
                        <li><a href="#">팝콘</a></li>
                        <li><a href="#">음료</a></li>
                        <li><a href="#">스낵</a></li>
                        <li><a href="#">플레이존</a></li>
                        <li><a href="#">씨네샵 ></a></li>
                    </ul>
                </li>
                <li>
                    <a href="#">이벤트</a>
                    <ul class="nav-depth2">
                        <li><a href="#"><strong>이벤트</strong></a></li>
                        <li><a href="#">SPECIAL</a></li>
                        <li><a href="#">영화/예매</a></li>
                        <li><a href="#">멤버십/CLUB</a></li>
                        <li><a href="#">CGV극장별</a></li>
                        <li><a href="#">제휴할인</a></li>
                        <li><a href="#">당첨자 발표</a></li>
                        <li><a href="#">종료된 이벤트</a></li>
                    </ul>
                </li>
                <li>
                    <a href="#">혜택</a>
                    <ul class="nav-depth2">
                        <li><a href="#"><strong>혜택</strong></a></li>
                        <li><a href="#">CGV 할인정보</a></li>
                        <li><a href="#">CLUB서비스</a></li>
                        <li><a href="#">VIP 라운지</a></li>
                    </ul>
                </li>
            </ul>
            <div id="searchbox">
	            <form action="" method="post" id="searchform">
	            	<input type="text" id="search" name="search">
	            	<button id="button"><img src="images/돋보기.png"></button>
	            </form>
            </div>
		</div>
	</header>
	