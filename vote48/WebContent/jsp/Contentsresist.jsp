<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.GroupBean"  %>
<%@ page import="java.util.ArrayList"  %>
<%ArrayList<GroupBean> grouplist= (ArrayList<GroupBean>)session.getAttribute("grouplist");%>

<%@ page import="model.TeamBean"  %>
<%@ page import="java.util.ArrayList"  %>
<%ArrayList<TeamBean> teamlist= (ArrayList<TeamBean>)session.getAttribute("teamlist");%>

<%int i = 0; %>
<%int c = 0; %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="jsp/Contentsresistcheck.jsp" method="post">
<input type="file" name="img_pass" accept="image/*">
名前:<input type="text" name="member_name">
グループ名:
<select name="group_name">
<%while(i<grouplist.size()){%>
<%GroupBean groupBean = grouplist.get(i); %>
<option value="<%=groupBean.getGroup_name() %>"><%=groupBean.getGroup_name() %></option>
<%i=i+1; %>
<%} %>
</select>
チーム名:
<select name="team_name">
<%while(c<teamlist.size()){%>
<%TeamBean teamBean = teamlist.get(c); %>
<option value="<%=teamBean.getTeam_name() %>"><%=teamBean.getTeam_name() %></option>
<%c=c+1; %>
<%} %>
</select>

生年月日:<input type="text" name="bday">
出身地:<input type="text" name="bplace">
血液型:<select name="btype">
<option value="A型">A型</option>
<option value="B型">B型</option>
<option value="O型">O型</option>
<option value="AB型">AB型</option>
</select>
<input type="submit" value="登録">
</form>
</body>
</html>