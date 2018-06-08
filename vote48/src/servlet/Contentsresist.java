package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ContentsDAO;
import dao.GroupDAO;
import dao.TeamDAO;

/**
 * Servlet implementation class Contentsresist
 */
@WebServlet("/Contentsresist")
public class Contentsresist extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Contentsresist() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String member_name = request.getParameter("member_name");
		String group_name = request.getParameter("group_name");
		String team_name = request.getParameter("team_name");
		String bday = request.getParameter("bday");
		String bplace = request.getParameter("bplace");
		String btype = request.getParameter("btype");
		String img = request.getParameter("img_pass");

		GroupDAO groupDAO = new GroupDAO();
		TeamDAO teamDAO = new TeamDAO();
		ContentsDAO contentsDAO= new ContentsDAO();
		int group_id =groupDAO.getGroupid(group_name);
		int team_id =teamDAO.getTeamid(team_name);
		contentsDAO.inputContents(member_name, bday, bplace, btype, group_id, team_id, img);


	}

}
