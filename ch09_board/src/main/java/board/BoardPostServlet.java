package board;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BoardPostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Board board = new Board(request.getParameter("name")
								, request.getParameter("subject")
								, request.getParameter("content")
								, request.getParameter("pass")
								, request.getParameter("ip"));
		
//		board.setName(request.getParameter("name"));
	
		new BoardDao().insertBoard(board);
		response.sendRedirect("list.jsp");
		
	}

}
