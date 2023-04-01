package com.cgv.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cgv.dto.UserDTO;
import com.cgv.service.UserService;

@WebServlet("/userController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UserController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String action = request.getParameter("action");
		if("logout".equals(action)) {
			response.sendRedirect("logout.jsp");
		} else if("update".equals(action)) {
			response.sendRedirect("myInfo.jsp");
		} else if("needLogin".equals(action)) {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<script>alert('로그인 후 이용이 가능합니다.'); location.href='login.jsp' </script>");
			out.flush();
			response.flushBuffer();
			response.sendRedirect("login.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		UserService service = new UserService();
		String action = request.getParameter("action");
		
		if("login".equals(action)) {
			String userId = request.getParameter("username");
			String userPw = request.getParameter("password");
			UserDTO dto = service.loginCheck(userId, userPw);
			request.setAttribute("userDto", dto);
			RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);
		} else if("signUp".equals(action)) {
			String username = request.getParameter("username");
			String userId = request.getParameter("userId");
			String password = request.getParameter("password");
			String birthDate = request.getParameter("birthDate");
			String tel = request.getParameter("tel");
			String email = request.getParameter("email");
			
			UserDTO insertDto = new UserDTO(userId, password, username, birthDate, tel, email);
			
			int result = service.signUp(insertDto);
			if(result == 1) {
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				out.println("<script>alert('회원가입에 성공했습니다.'); location.href='login.jsp' </script>");
				out.flush();
				response.flushBuffer();
				response.sendRedirect("login.jsp");
			} else {
				UserDTO dto = service.selectByUserId(userId);
				if(dto.getUserId().equals(userId)) {
					response.setContentType("text/html");
					PrintWriter out = response.getWriter();
					out.println("<script>alert('중복된 아이디가 존재합니다.'); location.href='signUp.jsp' </script>");
					out.flush();
					response.flushBuffer();
					response.sendRedirect("signUp.jsp");
				} else {
					response.setContentType("text/html");
					PrintWriter out = response.getWriter();
					out.println("<script>alert('회원가입에 실패했습니다.'); location.href='signUp.jsp' </script>");
					out.flush();
					response.flushBuffer();
					response.sendRedirect("signUp.jsp");
				}
			}
		} else if ("update".equals(action)) {
			String userId = (String)request.getSession().getAttribute("userId");
			String password = request.getParameter("password");
			String tel = request.getParameter("tel");
			String email = request.getParameter("email");
			service.updateInfo(userId, password, tel, email);
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<script>alert('정보 수정에 성공했습니다.'); location.href='index.jsp' </script>");
			out.flush();
			response.flushBuffer();
			response.sendRedirect("index.jsp");
		} else if ("delete".equals(action)) {
			String userId = (String)request.getSession().getAttribute("userId");
			String password = request.getParameter("password");
			int resultRow = service.deleteInfo(userId, password);
			if(resultRow == 1) {
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				out.println("<script>alert('탈퇴처리가 정상적으로 완료되었습니다.'); location.href='logout.jsp' </script>");
				out.flush();
				response.flushBuffer();
				response.sendRedirect("index.jsp");
			} else {
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				out.println("<script>alert('비밀번호가 틀렸습니다.'); location.href='deleteAccount.jsp' </script>");
				out.flush();
				response.flushBuffer();
				response.sendRedirect("deleteAccount.jsp");
			}
		}
		
	} // end of post

}
