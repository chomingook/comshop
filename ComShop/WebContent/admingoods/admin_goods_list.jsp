<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.util.*"%>
<%@ page import="net.admin.goods.db.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>관리자 쇼핑몰 목록</title>
</head>
<body>
	<table width="960" cellspacing="0" cellpadding="0" border="0"
		align="center"	bordercolor="gray">
		<tr>
			<td><p align="center">상품목록</p></td>
		</tr>
		<tr>
			<td>
				<p align="right"><a href="#">관리자상품등록</a></p>
			</td>
		</tr>	
		<form action = "#" method = "post">
		<table border="1" align="center" >
			<tr>
				<td>번호</td>
				<td>사진</td>
				<td>상품이름</td>
				<td>상품카테고리</td>
				<td>제조사</td>
				<td>수량</td>
				<td>출시일</td>
			</tr>
		</table>
		
		
		</form>
	</table>
</body>
</html>