<%@page import="com.cgv.dto.UserDTO"%>
<%@page import="com.cgv.service.UserService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% 
	String userId = (String)session.getAttribute("userId");
	String userPw = (String)session.getAttribute("password");
	UserService service = new UserService();
	UserDTO dto = service.loginCheck(userId, userPw);
	String birthDate = dto.getBirthDate();
	String loginId = dto.getUserId();
	String username = dto.getUsername();
 %>
<jsp:include page="/layout/loginNsignUpHeader.jsp"/>
<style>
	section {
		display: flex;
		flex-direction: column;
		align-items: center;
		margin-bottom: 20px;
	}
	
	#section-head {
		font-size: 30px;
		font-weight: bolder;
		margin-bottom: 30px;
	}
	
	#section-comment {
		font-size: 16px;
		font-weight: bold;
		margin-bottom: 30px;
	}
	
		table {
		width: 80vh;
		border-top: 1px solid #000;
		margin-bottom: 10px;
	}
	
	td {
		padding: 10px;
		border-bottom: 1px solid #ccc;
	}
	
	.line-td {
		border-right: 1px solid #ccc;
		width: 200px;
		background-color: #F8F8F8;
	}
	
	form {
		display: flex;
		flex-direction: column;
		align-items: center;
	}
	
	#buttons {
		display: flex;
	}
	
	input[type=submit] {
		width: 100px;
		padding: 10px;
		border: none;
		border-radius: 5px;
		background-color: #000;
		color: #fff;
		cursor: pointer;
		margin-right: 20px;
	}
	
	#cancel {
		width: 100px;
		padding: 10px;
		margin-right: 20px;
		border: 2px solid #000;
		border-radius: 5px;
		background-color: #fff;
		cursor: pointer;
	}
	
	#delete {
		width: 100px;
		padding: 10px;
		margin-right: 20px;
		border: none;
		border-radius: 5px;
		background-color: #FB4357;
		color: #fff;
		cursor: pointer;
	}
	
	.ticket {
		border: none;
		width: 100px;
	}
	
	#theater-box {
		display: flex;
		flex-direction: column;
	}
	
	#delete-button {
		margin-bottom: 10px;
		border: none;
		padding: 10px;
		border-radius: 5px;
		cursor: pointer;
	}
	
</style>
	<section>
		<div id="section-head">
			<h1>회원정보 수정</h1>
		</div>
		<div id="section-comment">
			<p>회원님의 소중한 정보를 안전하게 관리하세요.</p>
		</div>
		<form action="/myweb/userController?action=update" method="post">
			<figure>
				<figcaption>
					기본정보
				</figcaption>
				<table>
					<tr>
						<td class="line-td">✔ 이름</td>
						<td><%=username %></td>
					</tr>
					<tr>
						<td class="line-td">✔ 아이디</td>
						<td><%=loginId %></td>
					</tr>
					<tr>
						<td class="line-td">✔ 비밀번호</td>
						<td><input type="text" name="password" required="required"></td>
					</tr>
					<tr>
						<td class="line-td">✔ 생년월일</td>
						<td><%=birthDate %></td>
					</tr>
					<tr>
						<td class="line-td">✔ 휴대전화번호</td>
						<td><input type="text" name="tel" required="required"></td>
					</tr>
					<tr>
						<td class="line-td">✔ 이메일</td>
						<td><input type="email" name="email" required="required"></td>
					</tr>
				</table>
			</figure>
			<br>
			<h3>예매정보</h3>
			<c:forEach var="ticket" items="${list}">
			<table id="ticketTable">
			<tr>
				<th class="line-td">이름</th>
				<td>
					<input type="text" class="ticket" value="${ticket.username}" readonly="readonly" style="text-align: left">
				</td>
			</tr>
			<tr>
				<th class="line-td">영화 제목</th>
				<td>
					<input type="text" class="ticket" value="${ticket.movieName}" readonly="readonly" style="text-align: left">
				</td>
			</tr>
			<tr>
				<th class="line-td">상영일</th>
				<td>
					<input type="text" class="ticket" value="${ticket.date}" readonly="readonly" style="text-align: left">
				</td>
			</tr>
			<tr>
				<th class="line-td">시작 시간</th>
				<td>
					<input type="text" class="ticket" value="${ticket.startTime}" readonly="readonly" style="text-align: left">
				</td>
			</tr>
			<tr id="theaterName">
				<th class="line-td">상영관</th>
				<td id="theater-box">
					<small class="ticket">${ticket.city}</small>
					<input type="text" class="ticket" value="${ticket.theaterName}" readonly="readonly" style="text-align: left">
				</td>
			</tr>
			<tr id="seatName">
				<th class="line-td">좌석</th>
				<td>
					<input type="text" class="ticket" value="${ticket.seatName}" readonly="readonly" style="text-align: left">
				</td>
			</tr>
		</table>
		<button type="button" id="delete-button" onclick="location.href='ticketController?action=delete&ticketId=${ticket.id}'">예매취소</button>
		</c:forEach>
				<div id="buttons">
					<button type="button" id="cancel" onclick="location.href='/myweb/connector?action=index'">취소</button>
					<input type="submit" value="수정하기">
					<button type="button" id="delete" onclick="location.href='/myweb/connector?action=delete'">탈퇴하기</button>
				</div>
			</form>
	</section>
<jsp:include page="/layout/footer.jsp"/>