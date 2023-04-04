<%@page import="com.cgv.dto.UserDTO"%>
<%@page import="com.cgv.service.UserService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	String userId = (String)session.getAttribute("userId");
	String userPw = (String)session.getAttribute("password");
	UserService service = new UserService();
	UserDTO dto = service.loginCheck(userId, userPw);
	String loginId = dto.getUserId();
 %>
<jsp:include page="/layout/loginNsignUpHeader.jsp"/>
<style>

	section {
		display: flex;
		flex-direction: column;
		align-items: center;
		width: 100%;
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
	
	#first-box {
		display: flex;
		flex-direction: column;
		align-items: center;
		background-color: #F8F8F8;
		flex: 0 0 50%;
		padding: 10px;
		border-top: 1px solid #000;
		margin-bottom: 20px;
		width: 1100px;
	}
	
	#first-box button {
		background-color: #000;
		color: #fff;
		border: none;
		border-radius: 5px;
		padding: 10px;
		cursor: pointer;
	}
	
	#second-box {
		width: 1100px;
		display: flex;
		flex-direction: column;
		align-items: center;
		flex: 0 0 50%;
		padding: 10px;
		margin-bottom: 20px;
		border: 3px solid #E8E8E8;
	}
	
	#second-box button {
		border: 2px solid #E8E8E8;
		background-color: #fff;
		color: #000;
		padding: 5px;
		cursor: pointer;
	}
	
	#third-box {
		width: 1100px;
		padding: 30px;
		margin-bottom: 20px;
		background-color: #F8F8F8;
	}
	
	#third-box li {
		font-size: 14px;
	}
	
	input[type=submit] {
		width: 100px;
		padding: 10px;
		border: none;
		background-color: #000;
		color: #fff;
		cursor: pointer;
		border-radius: 5px;
		margin-bottom: 20px;
	}
	
	#buttons button {
		width: 100px;
		padding: 10px;
		margin-right: 20px;
		border: 2px solid #000;
		border-radius: 5px;
		background-color: #fff;
		cursor: pointer;
		margin-top: 30px;
	}
	
	#fourth-box {
		width: 1100px;
		padding: 30px;
		background-color: #F8F8F8;
		display: flex;
		flex-direction: column;
		align-items: center;
		margin-bottom: 5px;
	}
	
	table {
		width: 300px;
		border: 1px solid #E8E8E8;
		padding: 10px;
	}
	
</style>
	<form action="userController" method="get">
		<section>
			<div id="section-head">
				<h1>회원탈퇴</h1>
			</div>
			<div id="section-comment">
				<p>회원 탈퇴 신청 전 유의사항을 확인하세요.</p>
			</div>
			<div id="first-box">
				<img alt="icon" src="images/icon.png">
				<h2>아직 사용하지 않은 서비스를 잊으셨나요?</h2>
				<p>탈퇴하시면 현재 보유하고 계신 쿠폰과 CJ ONE 포인트는 <span style="color: red">즉시 자동 소멸</span>합니다. 단, 충전하신 포인트가 남아있는 경우 탈퇴 처리되지 않습니다.</p>
				<br>
				<button type="button">사용 중인 서비스 확인</button>
			</div>
			<div id="second-box">
				<h3>회원탈퇴 전 꼭 읽어주세요!</h3>
				<br>
				<p>CJ ONE 회원 탈퇴를 하시면 CJ ONE 회원 약관 및 개인정보 제공, 활용에 관한 약관 동의가 모두 철회되며</p>
				<p>모든 CJ ONE 제휴 브랜드의 회원 서비스 및 웹사이트로부터 탈퇴됩니다.</p>
				<br>
				<button type="button">CJ ONE 서비스 이용 약관 전문></button>
			</div>
			<div id="third-box">
				<h4>회원 탈퇴 시 유의사항</h4>
				<br>
				<ul>
					<li>탈퇴하시면 현재 보유하고 계신 쿠폰과 CJ ONE 적립 포인트는 즉시 자동 소멸하며, 충전 포인트 잔여 시에는 탈퇴처리가 되지 않습니다.</li>
					<li>충전 잔여 포인트가 탈퇴 후 생성될 때 자동 환불 처리가 되며, 환불 계좌가 존재하지 않으면 고객센터에서 연락을 통해 환불이 진행됩니다.</li>
					<li>(구) CGV 멤버십 포인트, CJ온스타일의 적립금, 캔디 등 CJ ONE 모든 제휴 브랜드에서 보유하신 혜택들은 즉시 자동 소멸되며 복구 되지 않습니다.</li>
					<li>구매하신 상품의 반품으로 인해 마이너스포인트를 보유한 경우 탈퇴처리 되지 않습니다.</li>
					<li>진행 중인 전자상거래 이용내역(배송/교환/반품 중인 상태)이 있거나 이용하신 서비스가 완료되지 않은 경우 탈퇴하실 수 없습니다.</li>
					<li>기타 탈퇴와 관련된 모든 정책은 CJ ONE 회원가입 시 동의하신 CJ ONE 회원 약관 및 개인정보 제공, 활용 동의 내용에 따릅니다.</li>
					<li>회원 탈퇴를 하시면 해당 아이디는 즉시 탈퇴 처리되며, 해당 아이디에 대한 회원 정보 및 서비스 정보는 모두 삭제됩니다.</li>
					<li>탈퇴한 아이디는 영구적으로 사용이 중지되며, 30일 이후에 가입이 가능합니다.</li>
				</ul>
				<br>
				<br>
				<h4>회원 정보 보존 안내 사항</h4>
				<br>
				<ul>
					<li>탈퇴 후 30일간 재가입 방지 및 포인트 불법 이용 및 부정 행위를 방지하기 위해 회원님의 아이디를 포함한 회원 정보가 보존됩니다.<br>(회원가입 시 동의하신 개인정보 처리 방침에 명시한 파기절차와 방법에 따라 30일 이후 회원 정보를 지체 없이 파기합니다)</li>
					<li>전자상거래 이용내역이 있는 회원님은 전자상거래 등에서의 소비자보호에 관한 법률에 의거 교환/반품/환불 및 사후처리(A/S)등을 위해 회원 정보가 관리됩니다.</li>
				</ul>
			</div>
			<div id="fourth-box">
				<h2>비밀번호 확인</h2>
				<br>
				<p>회원탈퇴를 원하시면 비밀번호를 입력하신 후 회원탈퇴 버튼을 클릭해 주세요.</p>
				<br>
				<table>
					<tr>
						<td>아이디</td>
						<td><%=loginId %></td>
					</tr>
					<tr>
						<td>비밀번호</td>
						<td><input type="password" name="delete" required="required"></td>
					</tr>
				</table>
			</div>
			<div id="message">
				<p>유의 및 안내 사항을 모두 확인하였으며, 탈퇴 시 위 사항에 동의한 것으로 간주합니다.</p>
			</div>
			<div id="buttons">
				<button type="button" onclick="location.href='/myweb/connector?action=index'">취소</button>
				<input type="submit" value="탈퇴하기">
			</div>
		</section>
	</form>
<jsp:include page="/layout/footer.jsp"/>