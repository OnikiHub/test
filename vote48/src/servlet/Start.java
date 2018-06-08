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
 * Servlet implementation class Start
 */
@WebServlet("/Start")
public class Start extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Start() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GroupDAO groupDAO = new GroupDAO();
		HttpSession session = request.getSession();
		session.setAttribute("grouplist",groupDAO.getList());

		TeamDAO teamDAO = new TeamDAO();
		session.setAttribute("teamlist",teamDAO.getList());
		ContentsDAO contentsDAO = new ContentsDAO();
		session.setAttribute("memberlist",contentsDAO.getList());
		session.setAttribute("akblist",contentsDAO.getList(1));
		session.setAttribute("skelist",contentsDAO.getList(2));
		session.setAttribute("nmblist",contentsDAO.getList(3));

		request.getRequestDispatcher("jsp/Contentslist.jsp").forward(request,response);

	}



}
