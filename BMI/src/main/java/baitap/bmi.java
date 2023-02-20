package baitap;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class bmi
 */
@WebServlet("/bmi")
public class bmi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public bmi() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		OutputStream out= response.getOutputStream();
		
		String height= request.getParameter("height") ;
		String weight= request.getParameter("weight") ;
		
	 if ((height== null) || ( weight.length()==0)) {
		 throw new IllegalArgumentException ("height is required");
	 }
	 
	 if ((height== null) || ( weight.length()==0)) {
		 throw new IllegalArgumentException ("height is required");
	 }
	 float heightVal=Float.valueOf(height);
	 float weightVal=Float.valueOf(weight);
	 
	 float bmi = (weightVal / (heightVal * heightVal)  ) *703;
	 
	 String result="your BMI index is:"+bmi;
	 out.write (result.getBytes());
	}
				
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
