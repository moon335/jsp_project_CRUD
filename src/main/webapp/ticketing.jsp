<%@page import="com.cgv.dto.TheaterDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
<jsp:include page="/layout/header.jsp" />
<style>
	section {
		display: flex;
		justify-content: center;
		align-items: center;
		width: 100%;
	}
	#selectForm {
		display: flex;
		justify-content: center;
		align-items: center;
		margin-right: 40px;
	}
	.form-control {
	    margin: 20px;
	}
	
	input[type=submit] {
		border: none;
		padding: 8px;
		border-radius: 5px;
		background-color: #FB4357;
		color: #fff;
	}
	
</style>
	<section>
		<form action="ticketController?action=insert" method="post" id="selectForm">
			<select class="form-control" name="movie" id="movie">
				<c:forEach var="movie" items="${movieList}">
					<option value="${movie.name}">${movie.name}</option>
				</c:forEach>
			</select>
			<select class="form-control" name="theater" id="theater">
				<optgroup label="서울">
					<c:forEach var="list" items="${theaterList}">
						<c:if test="${list.city eq '서울'}">
							<option value="${list.name}">${list.name}</option>
						</c:if>
					</c:forEach>
				</optgroup>
				<optgroup label="경기">
					<c:forEach var="list" items="${theaterList}">
						<c:if test="${list.city eq '경기'}">
							<option value="${list.name}">${list.name}</option>
						</c:if>
					</c:forEach>
				</optgroup>
				<optgroup label="인천">
					<c:forEach var="list" items="${theaterList}">
						<c:if test="${list.city eq '인천'}">
							<option value="${list.name}">${list.name}</option>
						</c:if>
					</c:forEach>
				</optgroup>
				<optgroup label="강원">
					<c:forEach var="list" items="${theaterList}">
						<c:if test="${list.city eq '강원'}">
							<option value="${list.name}">${list.name}</option>
						</c:if>
					</c:forEach>
				</optgroup>
				<optgroup label="대전/충청">
					<c:forEach var="list" items="${theaterList}">
						<c:if test="${list.city eq '대전/충청'}">
							<option value="${list.name}">${list.name}</option>
						</c:if>
					</c:forEach>
				</optgroup>
				<optgroup label="대구">
					<c:forEach var="list" items="${theaterList}">
						<c:if test="${list.city eq '대구'}">
							<option value="${list.name}">${list.name}</option>
						</c:if>
					</c:forEach>
				</optgroup>
				<optgroup label="부산/울산">
					<c:forEach var="list" items="${theaterList}">
						<c:if test="${list.city eq '부산/울산'}">
							<option value="${list.name}">${list.name}</option>
						</c:if>
					</c:forEach>
				</optgroup>
				<optgroup label="경상">
					<c:forEach var="list" items="${theaterList}">
						<c:if test="${list.city eq '경상'}">
							<option value="${list.name}">${list.name}</option>
						</c:if>
					</c:forEach>
				</optgroup>
				<optgroup label="광주/전라/제주">
					<c:forEach var="list" items="${theaterList}">
						<c:if test="${list.city eq '광주/전라/제주'}">
							<option value="${list.name}">${list.name}</option>
						</c:if>
					</c:forEach>
				</optgroup>
			</select>
			<input type="date" name="date" id="currentDate">
			<select class="form-control" name="startTime" id="startTime">
				<option value="10:30">10:30</option>
				<option value="13:00">13:00</option>
				<option value="15:30">15:30</option>
				<option value="18:00">18:00</option>
				<option value="20:30">20:30</option>
				<option value="23:00">23:00</option>
			</select>
			<select class="form-control" name="seat" id="seat">
				<c:forEach var="seat" items="${seatList}">
					<c:if test="${seat.isChecked == 1}">
						<option value="${seat.name}">${seat.name}</option>
					</c:if>
				</c:forEach>
			</select>
			<input type="submit" value="예매하기">
		</form>
	</section>
	<script>
	  document.getElementById('currentDate').value = new Date().toISOString().substring(0, 10);;
	</script>
<jsp:include page="/layout/footer.jsp" />