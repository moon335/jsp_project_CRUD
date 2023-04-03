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
import javax.servlet.http.HttpSession;

import com.cgv.dao.UserDAO;
import com.cgv.dao.seatDAO;
import com.cgv.dto.MovieDTO;
import com.cgv.dto.SeatDTO;
import com.cgv.dto.TheaterDTO;
import com.cgv.dto.TicketDTO;
import com.cgv.service.MovieService;
import com.cgv.service.SeatService;
import com.cgv.service.TheaterService;
import com.cgv.service.TicketService;

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
		TicketService ticketService = new TicketService();
		
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
			
			request.setAttribute("movieList", movieList);
			request.setAttribute("theaterList", theaterList);
			RequestDispatcher dispatcher = request.getRequestDispatcher("ticketing.jsp");
			dispatcher.forward(request, response);
		} else if("delete".equals(action)) {
			String ticketId = request.getParameter("ticketId");
			ticketService.deleteTicket(Integer.parseInt(ticketId));
			
			HttpSession session = request.getSession();
			String userId = (String)session.getAttribute("userId");
			ArrayList<TicketDTO> list = ticketService.selectAllTicket(userId);
			request.setAttribute("list", list);
			RequestDispatcher dispatcher = request.getRequestDispatcher("myInfo.jsp");
			dispatcher.forward(request, response);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String action = request.getParameter("action");
		MovieService movieService = new MovieService();
		SeatService seatService = new SeatService();
		TicketService ticketService = new TicketService();
		
		if("choiceSeat".equals(action)) {
			String movie = request.getParameter("movie");
			String theater = request.getParameter("theater");
			String date = request.getParameter("date");
			String startTime = request.getParameter("startTime");
			
			int movieId = movieService.selectByMovieName(movie).getId();
			
			request.setAttribute("movie", movie);
			request.setAttribute("theater", theater);
			request.setAttribute("date", date);
			request.setAttribute("startTime", startTime);
			
			ArrayList<SeatDTO> list = seatService.selectAll(movieId);
			request.setAttribute("list", list);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("choiceSeat.jsp");
			dispatcher.forward(request, response);
		} else if("insert".equals(action)) {
			HttpSession session = request.getSession();
			String userId = (String)session.getAttribute("userId");
			String movie = request.getParameter("movie");
			String theater = request.getParameter("theater");
			String date = request.getParameter("date");
			String startTime = request.getParameter("startTime");
			String seat = request.getParameter("seat");
			
			TicketDTO result = ticketService.insertTicket(userId, movie, theater, date, startTime, seat);
			if(result.getStartTime() != null) {
				request.setAttribute("ticket", result);
				
				RequestDispatcher dispatcher = request.getRequestDispatcher("showTicket.jsp");
				dispatcher.forward(request, response);
			}
			
		}
	}

} // end of class
