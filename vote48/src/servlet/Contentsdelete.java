package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ContentsDAO;
import model.ContentsBean;

/**
 * Servlet implementation class Contentsdelete
 */
@WebServlet("/Contentsdelete")
public class Contentsdelete extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Contentsdelete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		ContentsBean contents= (ContentsBean)session.getAttribute("member");
		int id = contents.getGroup_id();
		ContentsDAO contentsDAO= new ContentsDAO();
		contentsDAO.deletMember(id);


	}


}
