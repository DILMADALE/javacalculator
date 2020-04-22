

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/Calculate")
public class Calculate extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4672534622223893368L;
	float value;
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String n=request.getParameter("number1");
		String p=request.getParameter("number2");
		String o=request.getParameter("operation");
		
		out.println("<title>Dil's Calculator</title>");
		out.print("<hr>");
		
		switch (o) {
		case "Addition":
			value = Integer.parseInt(n) + Integer.parseInt(p);
			break;
		case "Subtraction":
			value = Integer.parseInt(n) - Integer.parseInt(p);
			break;
		case "Multiplication":
			value = Integer.parseInt(n) * Integer.parseInt(p);
			break;
		case "Division":
			value = Integer.parseInt(n) / Integer.parseInt(p);
			break;

		default:
			out.print("Please enter a valid Operation!!!");
			break;
		}
		
			out.print("The value for "+o+" is : "+value);
			out.print("<hr>");
		
		out.close();
	}

}
