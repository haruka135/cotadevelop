<%@ page language="java" contentType="text/html; charset=euc-kr"
    pageEncoding="euc-kr"%>
<%@ page import = "Boardmodel.BoardDAO" %>    
<%@ page import = "javax.print.attribute.ResolutionSyntax" %>
<!DOCTYPE html>
<html>
<body>
		<%
		
		request.setCharacterEncoding("euc-kr");
		
		%>
		
		<jsp:useBean id = "boardbean" class="Boardmodel.BoardBean">
			<jsp:setProperty name="boardbean" property="*" />
		</jsp:useBean>
		
		<%
		
			BoardDAO bdao = new BoardDAO();
		
			bdao.reWriteBoard(boardbean);
			
			
			response.sendRedirect("BoardList.jsp");
		
		%>
</body>
</html>