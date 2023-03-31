<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/layout/loginNsignUpHeader.jsp"/>
<style type="text/css">

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
	
	input[type=submit] {
		width: 200px;
		padding: 10px;
	}
	
	#information-use {
		background-color: #F8F8F8;
		padding: 50px;
		margin-bottom: 10px;
	}
	
	#information-use li {
		list-style-position: inside;
	}
	
	#buttons {
		display: flex;
	}
	
	input[type=submit] {
		width: 100px;
		padding: 10px;
		border: none;
		background-color: #000;
		color: #fff;
		cursor: pointer;
		border-radius: 5px;
	}
	
	#buttons button {
		width: 100px;
		padding: 10px;
		margin-right: 20px;
		border: 2px solid #000;
		border-radius: 5px;
		background-color: #fff;
		cursor: pointer;
	}
	
</style>
	<section>
		<div id="section-head">
			<h1>회원가입</h1>
		</div>
		<div id="section-comment">
			<p>라이프스타일 멤버십 CJ ONE! 외식, 쇼핑, 엔터테인먼트 서비스를 한 장의 카드로 즐기세요~</p>
		</div>
		<form action="/myweb/userController?action=signUp" method="post">
			<figure>
				<figcaption>
					기본정보
				</figcaption>
				<table>
					<tr>
						<td class="line-td">✔ 이름</td>
						<td><input type="text" name="username" required="required"></td>
					</tr>
					<tr>
						<td class="line-td">✔ 아이디</td>
						<td>
							<input type="text" name="userId" required="required">
						</td>
					</tr>
					<tr>
						<td class="line-td">✔ 비밀번호</td>
						<td><input type="text" name="password" required="required"></td>
					</tr>
					<tr>
						<td class="line-td">✔ 생년월일</td>
						<td><input type="date" name="birthDate" required="required"></td>
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
			<div id="information-use">
				<h3>이용안내</h3>
				<ul>
					<li>CJ ONE 회원가입 후에도 각 제휴 브랜드 웹 사이트에서 통합 아이디를 사용하여 로그인 하시려면, 각 브랜드 웹 사이트의 이용약관에 동의를 거친 후에 이용 가능합니다.</li>
					<li>개인정보 수집 및 활용 동의 (선택)에 거부한 회원님은 마케팅 정보 수신을 받으실 수 없습니다.</li>
				</ul>
			</div>
			<div id="buttons">
				<button type="button" onclick="location.href='index.jsp'">취소</button>
				<input type="submit" value="회원가입">
			</div>
		</form>
	</section>
<jsp:include page="/layout/footer.jsp"/>