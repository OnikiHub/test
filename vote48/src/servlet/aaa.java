package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class aaa
 */
@WebServlet("/aaa")
public class aaa extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public aaa() {
        super();
        // TODO Auto-generated constructor stub
    }


protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String img = request.getParameter("img");
		System.out.println(img);
}

}
