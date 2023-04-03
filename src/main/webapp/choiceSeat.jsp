<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
<%
	String movieName = (String)request.getAttribute("movie");
	String theater = (String)request.getAttribute("theater");
	String date = (String)request.getAttribute("date");
	String startTime = (String)request.getAttribute("startTime");
%>
<jsp:include page="/layout/header2.jsp" />
<style>
	section {
		display: flex;
		flex-direction: column;
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
	
	#sectionForm {
	    width: 100%;
	    display: flex;
	    flex-direction: column;
	    justify-content: center;
	    align-items: center;
	}
	
	.form-control {
		width: 150px;
	}
	
	section > p {
		font-weight: bold;
		font-size: 15px;
	}
	
	#sectionForm > table {
		border: 1px solid #000; 
		width: 300px;
		text-align: center;
	}
	
	input[type=text] {
		border: none;
	}
	
</style>
<section>
	<h3>예매 정보</h3>
	<br>
	<p>예매 정보가 정확한지 확인하고 예매를 진행해주세요.</p>
	<form action="ticketController?action=insert" method="post" id="sectionForm">
		<table>
			<tr>
				<th>이름</th>
				<td>
					<input type="text" name="movie" value="<%=movieName %>" readonly="readonly" style="text-align: center">
				</td>
			</tr>
			<tr>
				<th>극장</th>
				<td>
					<input type="text" name="theater" value="<%=theater %>" readonly="readonly" style="text-align: center">
				</td>
			</tr>
			<tr>
				<th>날짜</th>
				<td>
					<input type="text" name="date" value="<%=date %>" readonly="readonly" style="text-align: center">
				</td>
			</tr>
			<tr>
				<th>시작시간</th>
				<td>
					<input type="text" name="startTime" value="<%=startTime %>" readonly="readonly" style="text-align: center">
				</td>
			</tr>
		</table>
		<select class="form-control" name="seat" id="seat">
			<c:forEach var="seat" items="${list}">
				<c:if test="${seat.isChecked == 1}">
					<option value="${seat.name}">${seat.name}</option>
				</c:if>
			</c:forEach>
		</select>
		<input type="submit" value="예매하기">
	</form>


</section>
<jsp:include page="/layout/footer.jsp" />