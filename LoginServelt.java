package webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;


@WebServlet(urlPatterns="/login.do")
public class LoginServelt extends HttpServlet {
	
	protected void doGet(HttpServletRequest request , HttpServletResponse response)throws ServletException,IOException{
		PrintWriter writer=response.getWriter();
		request.getRequestDispatcher("/WEB-INF/VIEWS/LOGIN.jsp").forward(request, response);
	}
	

}
