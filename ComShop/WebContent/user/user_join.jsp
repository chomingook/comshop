<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="./UserJoinAction.us" method="post" name="joinform">
		<center>
			<table border=1>
			<tr>
				<td colspan="2" align="center">
					<b><font size=4>ȸ������</font></b>
				</td>
			</tr>
			<tr>
				<td align="right">���̵� :</td>
				<td><input type="text" name="User_ID"/></td>
			</tr>
			<tr>
				<td align="right">��й�ȣ :</td>
				<td><input type="password" name="User_PW"/></td>
			</tr>
			<tr>
				<td align="right">�̸� :</td>
				<td><input type="text" name="User_NAME"/></td>
			</tr>
			<tr>
				<td align="right">�ּ� : </td>
				<td ><input type="text" name="User_ADDR"/></td>
			</tr>
			<tr>
				<td align="right">��ȭ��ȣ :</td>
				<td><input type="text" name="User_HP"/></td>
			</tr>
			<tr>
				<td align="right">Email :</td>
				<td ><input type="text" name="User_EMAIL"/></td>
			</tr>
			
			</table>
		<input type="hidden" name="User_LEVEL" value="������"/>
		<input type="hidden" name="User_POINT" value="0"/>
		<input type="submit" value="�Է¿Ϸ�" />
		</center>
	
	</form>

</body>
</html>