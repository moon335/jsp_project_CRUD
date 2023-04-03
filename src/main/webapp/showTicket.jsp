<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/layout/header.jsp" />
<style>
	
	section {
		display: flex;
		flex-direction: column;
		justify-content: center;
		align-items: center;
		width: 100%;
	}
	
	#theaterName > td {
		display: flex;
		flex-direction: column;
		justify-content: cneter;
		align-items: center;
	}
	
	input[type=text] {
		border: none;
	}
	
	table {
		border: 1px solid #D8D8D8;
		margin-bottom: 20px;
	}
	
	th {
		border-right: 1px solid #E8E8E8;
	}
	
	th, td {
		border-bottom: 1px solid #E8E8E8;
	}
	
	#seatName > th {
		border-bottom: none;
	}
	
	#seatName > td {
		border-bottom: none;
	}
	
	#check {
		width: 120px;
		border: none;
		border-radius: 5px;
		padding: 10px;
		background-color: #E8E8E8;
		margin-bottom: 20px;
		cursor: pointer;
	}
	
</style>
	<section>
		<h3>예매 성공</h3>
		<p>영화 예매에 성공했습니다.</p>
		<table>
			<tr>
				<th>이름</th>
				<td>
					<input type="text" name="movie" value="${ticket.username}" readonly="readonly" style="text-align: center">
				</td>
			</tr>
			<tr>
				<th>영화 제목</th>
				<td>
					<input type="text" name="movie" value="${ticket.movieName}" readonly="readonly" style="text-align: center">
				</td>
			</tr>
			<tr>
				<th>상영일</th>
				<td>
					<input type="text" name="movie" value="${ticket.date}" readonly="readonly" style="text-align: center">
				</td>
			</tr>
			<tr>
				<th>시작 시간</th>
				<td>
					<input type="text" name="movie" value="${ticket.startTime}" readonly="readonly" style="text-align: center">
				</td>
			</tr>
			<tr id="theaterName">
				<th>상영관</th>
				<td>
					<small>${ticket.city}</small>
					<input type="text" name="movie" value="${ticket.theaterName}" readonly="readonly" style="text-align: center">
				</td>
			</tr>
			<tr id="seatName">
				<th>좌석</th>
				<td>
					<input type="text" name="movie" value="${ticket.seatName}" readonly="readonly" style="text-align: center">
				</td>
			</tr>
		</table>
		<button type="button" onclick="location.href='index.jsp'" id="check">확인</button>
	</section>
<jsp:include page="/layout/footer.jsp" />