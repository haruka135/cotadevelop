<%@ page language="java" contentType="text/html; charset=euc-kr"
    pageEncoding="euc-kr"%>
<%@ page import = "Boardmodel.BoardBean" %>
<%@ page import = "java.util.Vector" %>
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

	 <jsp:include page="Top.jsp" />	
	  <section class="block board_wrap">
	  <form action="BoardWriteProc.jsp" method="post">
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
							<dd><input type="text" placeholder="�����Է�" name="subject"></dd>
						</dl>
					</div>
					<div class="infom">
						<dl>
							<dt>�۾���</dt>
							<dd><input type="text" placeholder="�۾����Է�" name="writer"></dd>
						</dl>
						<dl>
							<dt>��й�ȣ</dt>
							<dd><input type="password" placeholder="��й�ȣ �Է�" name="password"></dd>
						</dl>
						<dl>
							<dt>�̸���</dt>
							<dd><input type="email" placeholder="�̸��� �Է�" name="email"></dd>
						</dl>
					</div>
					<div class="contenter">
						<textarea placeholder="�����Է�" name="content"></textarea>
					</div>
				</div>
			</div>
			

				<div class="bt_wrap">
					<input type="submit" value="���" class="on">
					 <a href="#">���</a> 
				</div>

			</form>
        </section>
		
</body>
</html>