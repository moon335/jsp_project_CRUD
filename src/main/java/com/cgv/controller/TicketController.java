package com.cgv.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cgv.dto.MovieDTO;
import com.cgv.dto.SeatDTO;
import com.cgv.dto.TheaterDTO;
import com.cgv.service.MovieService;
import com.cgv.service.SeatService;
import com.cgv.service.TheaterService;

@WebServlet("/ticketController")
public class TicketController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TicketController() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String action = request.getParameter("action");
		MovieService movieService = new MovieService();
		TheaterService theaterService = new TheaterService();
		SeatService seatService = new SeatService();
		
		if("needLogin".equals(action)) {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<script>alert('로그인 후 이용이 가능합니다.'); location.href='login.jsp' </script>");
			out.flush();
			response.flushBuffer();
			response.sendRedirect("login.jsp");
		} else if("ticketing".equals(action)) {
			ArrayList<MovieDTO> movieList = movieService.selectAll();
			ArrayList<TheaterDTO> theaterList = theaterService.selectAll();
			ArrayList<SeatDTO> seatList = seatService.selectAll();
			
			request.setAttribute("movieList", movieList);
			request.setAttribute("theaterList", theaterList);
			request.setAttribute("seatList", seatList);
			RequestDispatcher dispatcher = request.getRequestDispatcher("ticketing.jsp");
			dispatcher.forward(request, response);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String action = request.getParameter("action");
		MovieService movieService = new MovieService();
		TheaterService theaterService = new TheaterService();
		SeatService seatService = new SeatService();
		
		if("insert".equals(action)) {
			String movie = request.getParameter("movie");
			String theater = request.getParameter("theater");
			String date = request.getParameter("date");
			String time = request.getParameter("startTime");
			String seat = request.getParameter("seat");
			
			
			
		}
	}

}
