<%@ page language="java" contentType="text/html; charset=euc-kr"
    pageEncoding="euc-kr"%>
<%@ page import = "Boardmodel.BoardBean" %>
<%@ page import = "Boardmodel.BoardDAO" %>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>MLB-Statcast Database</title>
	<link rel="stylesheet" type="text/css" href="xeicon/xeicon.min.css">
	<link rel="stylesheet" href="css_part/board.css">
	<link rel="stylesheet" href="css_part/swiper.min.css">
	<link rel="stylesheet" href="css_part/default.css">
	<script src="script_part/jquery.js" charset="utf-8"></script>
	<script src="script_part/swiper.js" charset="utf-8"></script>
	<script src="script_part/default.js" charset="utf-8"></script>
</head>
<body>

	<%
	
		int num = Integer.parseInt(request.getParameter("num").trim());
	
		BoardDAO bdao = new BoardDAO();
		
		BoardBean bean = bdao.getOneUpdateBoard(num);
	
	%>

	 <jsp:include page="Top.jsp" />	
	  <section class="block board_wrap">
	  <form action="BoardUpdateProc.jsp" method="post">
            <div class="joincontents">
                <h2 class="subject2">�Խ���</h2>
            </div>

			<div class="board_title">
				<strong>��������</strong>
				<p>���������� ������ ��Ȯ�ϰ� �ȳ��� �帳�ϴ�.</p>
			</div>
			
			<div class="board_write_wrap">
				<div class="board_write">
					<div class="titler">
						<dl>
							<dt>����</dt>
							<dd><input type="text" placeholder="�����Է�" name="subject" value="<%= bean.getSubject() %>"></dd>
						</dl>
					</div>
					<div class="infom">
						<dl>
							<dt>�۾���</dt>
							<dd><input type="text" placeholder="�۾����Է�" name="writer" value="<%= bean.getWriter() %>"> </dd>
						</dl>
						<dl>
							<dt>��й�ȣ</dt>
							<dd><input type="password" placeholder="��й�ȣ �Է�" name="password" value="<%= bean.getPassword() %>"></dd>
						</dl>
						<dl>
							<dt>�̸���</dt>
							<dd><input type="email" placeholder="�̸��� �Է�" name="email" value="<%= bean.getEmail() %>"></dd>
						</dl>
					</div>
					<div class="contenter">
						<textarea placeholder="�����Է�" name="content"><%= bean.getContent() %></textarea>
					</div>
				</div>
			</div>
			

				<div class="bt_wrap">
					<input type="hidden" name="num" value="<%= bean.getNum() %>">
					<input type="submit" value="�ۼ���" class="on">&nbsp;&nbsp;
					<input type="button" onclick="location.href='BoardList.jsp'" class="on" value="��ü�ۺ���">
				</div>

			</form>
        </section>
		
</body>
</html>