<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>MLB-Statcast Database</title>
</head>
<body>

<%

	String center = request.getParameter("center");

	if (center == null) { center = "Center.jsp";}
%>

	<jsp:include page="Top.jsp" />
	<jsp:include page="Visual.jsp" />
	<jsp:include page="<%= center %>" />
	
</body>
</html>
    