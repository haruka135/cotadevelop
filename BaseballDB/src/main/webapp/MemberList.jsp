<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "model.MemberDAO" %>
<%@ page import = "java.util.Vector" %>
<%@ page import = "model.MemberBean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<%
	
		MemberDAO mdao = new MemberDAO();
	
		Vector<MemberBean> vec = mdao.allSelectMember(); 
	
	%>
	

		<table width="800" border="1">
			<tr height="50">
				<td align="center" width="150">아이디</td>
				<td align="center" width="150">이메일</td>
			</tr>
			
			<%
				
				for(int i=0; i<vec.size(); i++) {
					MemberBean bean = vec.get(i);
			%>
			<tr height="50">
				<td align="center" width="150">
				<a href="MemberInfo.jsp?id= <%= bean.getId() %>">
				<%= bean.getId() %>
				</a>
				</td>
				<td align="center" width="150"><%= bean.getEmail() %></td>
			</tr>
			<% 
			
				} 
			
			%>
		</table>

</body>
</html>