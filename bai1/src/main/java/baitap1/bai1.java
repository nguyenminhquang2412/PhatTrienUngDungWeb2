package baitap1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class bai1
 */
@WebServlet("/bai1")
public class bai1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public bai1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String value1 = request.getParameter("param1");
		String value2 = request.getParameter("param2");
		PrintWriter traVe = response.getWriter();
		traVe.append("Giá trị tham số param1= ");
		traVe.append(value1);
		traVe.append("\nGiá trị tham số param2= ");
		traVe.append(value2);
	}
    
    
}
