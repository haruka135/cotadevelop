<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import = "dto.Product" %>
 <%@ page import = "dao.ProductRepository" %>
 <jsp:useBean id = "productDAO" class="dao.ProductRepository" scope="session" />
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>MLB-Statcast Database</title>
	<link rel="stylesheet" type="text/css" href="../xeicon/xeicon.min.css">
	<link rel="stylesheet" href="css_part/info.css">
	<link rel="stylesheet" href="css_part/swiper.min.css">
	<link rel="stylesheet" href="css_part/default.css">
	<script src="script_part/jquery.js" charset="utf-8"></script>
	<script src="script_part/swiper.js" charset="utf-8"></script>
	<script src="script_part/default.js" charset="utf-8"></script>
</head>
<body>
	<jsp:include page = "Top.jsp" />
	
    <main>
        <section class="block">
            <div class="product_view">
            <%
            	String id = request.getParameter("id");
            
            	ProductRepository dao = ProductRepository.getInstance();
            
            	Product product = dao.getProductById(id);
            
            %>
                <h2><%= product.getPname() %></h2>
                <table>
                    <colgroup>
                    <col style="width:173px;">
                    <col>
                    </colgroup>
                    <tbody>
                    <tr>
                        <th>영어이름</th>
                        <td class="price"><%= product.getPename() %></td>
                    </tr>
                    <tr>
                        <th>상품코드</th>
                        <td><%= product.getPcode() %></td>
                    </tr>
                    <tr>
                        <th>제조사/공급사</th>
						<td><%= product.getMan() %></td>
                    </tr>
                    
                    <tr>
                        <th>사용가능쿠폰</th>
                        <td><%= product.getUnitcoupon() %></td>
                    </tr>
                    <tr>
                        <th>가격</th>
                        <td class="total"><b><%= product.getUnitprice() %></b>원</td>
                    </tr>
                    </tbody>
                </table>
                <div class="img">
                    <img src="../img/mlb_figure_01.png" alt="">
                </div>
                <div class="btns">
                    <a href="./Promotion.jsp" class="btn1">상품 목록</a>
                </div>
            </div>
        
        </section>
    </main>


</body>
</html>