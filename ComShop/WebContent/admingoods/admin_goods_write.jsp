<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>�ļ� ��ǰ���</title>
</head>
<body>
	<form
		action="<%=request.getContextPath()%>/admingoods/admin_goods_pro.go"
		method="post">
		<table border="0" align="center" bordercolor="gray">
			<tr>
				<td style="font-size: 25pt">�� ǰ �� ��</td>
			</tr>
		</table>

		<!-- ��ǰ��ϸ���Ʈ -->
		<table border="1" align="center">
			<tr>
				<td align="center" width="250" height="30">ī�װ�</td>
				<td width="250" height="30"><select name="GO_CATEGORY">
						<option value="cpu">cpu</option>
						<option value="���κ���">���κ���</option>
						<option value="�޸�">�޸�</option>
						<option value="�׷���ī��">�׷���ī��</option>
				</select>
			</tr>
			<tr>
				<td><input type="hidden" name="GO_ID"></td>
			</tr>
			<tr>
				<td align="center">��ǰ�̸�</td>
				<td><input type="text" name="GO_NAME"></td>
			</tr>
			<tr>
				<td align="center">����</td>
				<td><input type="text" name="GO_PRICE"></td>
			</tr>
			<tr>
				<td align="center">����</td>
				<td><input type="text" name="GO_QUANTITY"></td>
			</tr>
			<tr>
				<td align="center">������</td>
				<td><input type="text" name="GO_MANUFACTURER"></td>
			</tr>
			<tr>
				<td align="center">�����</td>
				<td><input type="date" name="GO_RELEASE"/></td>
			</tr>
			<tr>
				<td align="center">��ǰ�����̹���</td>
				<td><input type="file" name="file1"></td>
			</tr>
		</table>

		<table border="0" align="center" bordercolor="gray">
			<tr>
				<td align="center"><input type="submit" value="��ǰ���"></td>
				<td align="center"><input type="reset" value="�ٽþ���"></td>
			</tr>
			<%
				String SNAME = (String) session.getAttribute("id");
			%>

		</table>
		<input type="hidden" name="User_name" value="<%=SNAME%>" />
	</form>
</body>
</html>