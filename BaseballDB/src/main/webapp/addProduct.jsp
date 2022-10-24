<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>MLB-Statcast Database</title>
	<link rel="stylesheet" type="text/css" href="../xeicon/xeicon.min.css">
    <link rel="stylesheet" href="css_part/geton.css">
	<link rel="stylesheet" href="css_part/swiper.min.css">
	<link rel="stylesheet" href="css_part/default.css">
	<script src="script_part/jquery.js" charset="utf-8"></script>
	<script src="script_part/swiper.js" charset="utf-8"></script>
	<script src="script_part/default.js" charset="utf-8"></script>
</head>
<body>
	<jsp:include page="Top.jsp" />
    <main>
        <section class="block">
       <form name="newProduct" action="./processAddProduct.jsp" method = "post">
            <div class="joincontents">
                <h2 class="subject2">등록하기</h2>
               
                <div class="join_box2">
                    <h3 class="subject3">피규어 등록하기</h3>

                    <table class="type1">
                        <caption></caption>
                        <colgroup>
                            <col style="width:170px;">
                            <col>
                        </colgroup>
                        <tbody>
                            <tr>
                                <th><span>필수입력</span>상품명</th>
                                <td>
                                    <input type="text" name="pname" style="width:150px;">
                               
                                </td>

                            </tr>
                            <tr>
                                <th><span>필수입력</span>상품 영어명</th>
                                <td>
                                    <input type="text" name="pename" style="width:150px;">
                          
                                </td>

                            </tr>
                            <tr>
                                <th><span>필수입력</span>판매가</th>
                                <td>
                                    <input type="text" style="width:150px;" name="unitprice">
                                    <span class="ifo">숫자 단위까지 모두 입력하세요</span>
                                </td>

                            </tr>
                            <tr>
                                <th><span>필수입력</span>상품코드</th>
                                <td><input type="text" style="width:150px;" name="pcode">
                                    <span class="ifo">상품코드는 이메일을 확인해주세요.</span> 
                                </td>
                               

                            </tr>
                            <tr>
                                <th><span>필수입력</span>제조사 및 공급사</th>
                                <td><input type="text" style="width:150px;" name="man"></td>

                            </tr>
                            <tr>
                                <th><span>필수입력</span>쿠폰사용갯수</th>
                                <td><input type="text" style="width:150px;" name="unitcoupon"></td>

                            </tr>
                        </tbody>
                    </table>


                <div class="btn_center">
                    <input type="submit" value="등록하기" class="btn_type1">
                    <a href="" class="btn_type2">취소 </a>
                </div>
                </div>

            </div>
           </form>
        </section>
    </main>