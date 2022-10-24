<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.ArrayList" %>
<%@ page import = "dto.Product" %>
<%@ page import = "dao.ProductRepository" %>
<jsp:useBean id="productDAO" class="dao.ProductRepository" scope="session" />
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>MLB-Statcast Database</title>
	<link rel="stylesheet" type="text/css" href="xeicon/xeicon.min.css">
	<link rel="stylesheet" href="css_part/style.css">
	<link rel="stylesheet" href="css_part/swiper.min.css">
	<link rel="stylesheet" href="css_part/default.css">
	<link rel="stylesheet" href="css_part/bootstrap.min.css">
	<script src="script_part/jquery.js" charset="utf-8"></script>
	<script src="script_part/swiper.js" charset="utf-8"></script>
	<script src="script_part/default.js" charset="utf-8"></script>
	
</head>
<body>
<section>
		
<div class="main_text0">
		<h1>WELCOME TO BASEBALL</h1>
		<div class="contents1">메이저리그에 오신 여러분들을 환영합니다.</div>
		
		<%
			ProductRepository dao = ProductRepository.getInstance();
			
			ArrayList<Product> listOfProducts = productDAO.getAllProducts();
		
		%>
		
		
<div class="container text-center">	
	<div class="row align-items-center">
	
		<%
		
			for(int i=0;i<listOfProducts.size();i++) {
				
				
				Product product = listOfProducts.get(i);
		
		%>
		<div class="col">
		<div class="card" style="width:18rem;">
  			<img src="img/mlb_figure_01.png" class="card-img-top" alt="...">

  			<div class="card-body">	
  				 <h5 class="card-title"><%= product.getPname() %></h5>	 
    			 <p class="card-text"><%= product.getPename() %></p>
    			 <a href="./Product.jsp?id=<%= product.getPcode() %>" class="btn btn-primary">상세보기</a>
  		    </div>
  		    	  
		</div>
		
		</div>
		
		<%
		
			}
		
		%>
	</div>
</div>
</div>
		
</section>
</body>
</html>