<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%String member_name = request.getParameter("member_name");
String group_name = request.getParameter("group_name");
String team_name = request.getParameter("team_name");
String bday = request.getParameter("bday");
String bplace = request.getParameter("bplace");
String btype = request.getParameter("btype");
String img = request.getParameter("img_pass");

%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="../Contentsresist" method="post">
<input type="text" name="img_pass" value="<%=img %>">
名前:<input type="text" name="member_name" value="<%=member_name %>">
グループ名:<input type="text" name="group_name" value="<%=group_name %>">
チーム名:<input type="text" name="team_name"value="<%=team_name %>">
生年月日:<input type="text" name="bday"value="<%=bday %>">
出身地:<input type="text" name="bplace"value="<%=bplace %>">
血液型:<input type="text" name="btype"value="<%=btype %>">
<input type="submit" value="はい">
</form>

</body>
</html>