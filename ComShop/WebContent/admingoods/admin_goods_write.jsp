<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>컴샵 상품등록</title>
</head>
<body>
	<form
		action="<%=request.getContextPath()%>/admingoods/admin_goods_pro.go"
		method="post">
		<table border="0" align="center" bordercolor="gray">
			<tr>
				<td style="font-size: 25pt">상 품 등 록</td>
			</tr>
		</table>

		<!-- 상품등록리스트 -->
		<table border="1" align="center">
			<tr>
				<td align="center" width="250" height="30">카테고리</td>
				<td width="250" height="30"><select name="GO_CATEGORY">
						<option value="cpu">cpu</option>
						<option value="메인보드">메인보드</option>
						<option value="메모리">메모리</option>
						<option value="그래픽카드">그래픽카드</option>
				</select>
			</tr>
			<tr>
				<td><input type="hidden" name="GO_ID"></td>
			</tr>
			<tr>
				<td align="center">상품이름</td>
				<td><input type="text" name="GO_NAME"></td>
			</tr>
			<tr>
				<td align="center">가격</td>
				<td><input type="text" name="GO_PRICE"></td>
			</tr>
			<tr>
				<td align="center">수량</td>
				<td><input type="text" name="GO_QUANTITY"></td>
			</tr>
			<tr>
				<td align="center">제조사</td>
				<td><input type="text" name="GO_MANUFACTURER"></td>
			</tr>
			<tr>
				<td align="center">출시일</td>
				<td><input type="date" name="GO_RELEASE"/></td>
			</tr>
			<tr>
				<td align="center">상품메인이미지</td>
				<td><input type="file" name="file1"></td>
			</tr>
		</table>

		<table border="0" align="center" bordercolor="gray">
			<tr>
				<td align="center"><input type="submit" value="상품등록"></td>
				<td align="center"><input type="reset" value="다시쓰기"></td>
			</tr>
			<%
				String SNAME = (String) session.getAttribute("id");
			%>

		</table>
		<input type="hidden" name="User_name" value="<%=SNAME%>" />
	</form>
</body>
</html>