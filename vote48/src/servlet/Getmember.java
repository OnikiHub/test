package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ContentsDAO;
import dao.GroupDAO;
import dao.TeamDAO;

/**
 * Servlet implementation class Getmember
 */
@WebServlet("/Getmember")
public class Getmember extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Getmember() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*String id = request.getParameter("member_id");
		int member_id = Integer.parseInt(id);
		*/ContentsDAO contentsDAO = new ContentsDAO();
		GroupDAO groupDAO = new GroupDAO();
		TeamDAO teamDAO = new TeamDAO();
		HttpSession session = request.getSession();
		session.setAttribute("member",contentsDAO.getMember(1));
		session.setAttribute("grouplist",groupDAO.getList());
		session.setAttribute("teamlist",teamDAO.getList());

		request.getRequestDispatcher("jsp/Contentsupdate.jsp").forward(request,response);




	}



}
