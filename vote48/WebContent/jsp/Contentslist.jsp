<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.ContentsBean"  %>
<%@ page import="java.util.ArrayList"  %>
<%@ page import="model.GroupBean"  %>
<%@ page import="model.TeamBean"  %>
<%ArrayList<GroupBean> grouplist= (ArrayList<GroupBean>)session.getAttribute("grouplist");%>
<%ArrayList<TeamBean> teamlist= (ArrayList<TeamBean>)session.getAttribute("teamlist");%>
<%ArrayList<ContentsBean> memberlist= (ArrayList<ContentsBean>)session.getAttribute("memberlist");%>
<%ArrayList<ContentsBean> akblist= (ArrayList<ContentsBean>)session.getAttribute("akblist");%>
<%ArrayList<ContentsBean> skelist= (ArrayList<ContentsBean>)session.getAttribute("skelist");%>
<%ArrayList<ContentsBean> nmblist= (ArrayList<ContentsBean>)session.getAttribute("nmblist");%>
<%int i = 0; %>
<%int a = 0; %>
<%int s = 0; %>
<%int n = 0; %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<table>
<tr>
<td><input type="button" value="AKB48" onclick="akb_click()" /></td>
<td><input type="button" value="SKE48" onclick="ske_click()" /></td>
<td><input type="button" value="NMB48" onclick="nmb_click()" /></td>
</tr>
</table>
<table id="akb">
<%while(a<akblist.size()){ %>
<%ContentsBean contentsBean = akblist.get(a); %>
<tr><td><img src="img/<%=contentsBean.getImg_pass() %>"></td><tr><td><%=contentsBean.getMember_name() %></td></tr>
<%a++; %>
<%} %>
</table>

<table id="ske">
<%while(s<skelist.size()){ %>
<%ContentsBean contentsBean = skelist.get(s); %>
<tr><td><img src="img/<%=contentsBean.getImg_pass() %>"></td><tr><td><%=contentsBean.getMember_name() %></td></tr>
<%s++; %>
<%} %>
</table>

<table id="nmb">
<%while(n<nmblist.size()){ %>
<%ContentsBean contentsBean = nmblist.get(n); %>
<tr><td><img src="img/<%=contentsBean.getImg_pass() %>"></td><tr><td><%=contentsBean.getMember_name() %></td></tr>
<%n++; %>
<%} %>
</table>

<script>
document.getElementById("akb").style.display ="none";
function akb_click(){
	var akb = document.getElementById("akb");

	if(akb.style.display=="block"){
		akb.style.display ="none";
	}else{
		akb.style.display ="block";
		ske.style.display ="none";
		nmb.style.display ="none";
	}
}
document.getElementById("ske").style.display ="none";
function ske_click(){
	var ske = document.getElementById("ske");

	if(ske.style.display=="block"){
		ske.style.display ="none";
	}else{
		ske.style.display ="block";
		akb.style.display ="none";
		nmb.style.display ="none";
	}
}
document.getElementById("nmb").style.display ="none";
function nmb_click(){
	var nmb = document.getElementById("nmb");

	if(nmb.style.display=="block"){
		nmb.style.display ="none";
	}else{
		nmb.style.display ="block";
		ske.style.display ="none";
		akb.style.display ="none";
	}
}


</script>
</body>
</html>