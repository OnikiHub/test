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
import model.ContentsBean;

/**
 * Servlet implementation class Contentsupdate
 */
@WebServlet("/Contentsupdate")
public class Contentsupdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Contentsupdate() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String member_name = request.getParameter("member_name");
		String group_name = request.getParameter("group_name");
		String team_name = request.getParameter("team_name");
		String bday = request.getParameter("bday");
		String bplace = request.getParameter("bplace");
		String btype = request.getParameter("btype");
		String img = request.getParameter("img_pass");
		HttpSession session = request.getSession();
		ContentsBean contents= (ContentsBean)session.getAttribute("member");
		int id = contents.getGroup_id();

		GroupDAO groupDAO = new GroupDAO();
		TeamDAO teamDAO = new TeamDAO();
		ContentsDAO contentsDAO= new ContentsDAO();
		int group_id =groupDAO.getGroupid(group_name);
		int team_id =teamDAO.getTeamid(team_name);
		contentsDAO.updateContents(member_name, bday, bplace, btype, group_id, team_id, img, id);



	}

}
