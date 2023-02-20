package baitap2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class bai2
 */
@WebServlet("/bai2")
public class bai2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public bai2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter traVe = response.getWriter();
		traVe.append("Ban vua gui yeu cau dang GET, day la dap ung cua toi ");
		String noiDungHTML = "<form method = POST action=\"Bai1_2\""
				+ "<label>Ho:</label>"
				+ "<input type=\"text\"name=\"fname\"><br>\r\n"
				+ "<label>Ten:</label>"
				+ "<input type=\"text\"name=\"lname\"><br>"
				+ "<input type=\"submit\"value=\"Gui di\">"
				+ "</form>";
		traVe.append(noiDungHTML);
	}

}
