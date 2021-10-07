<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1" id="WebAPP">
<title>AceParks</title>
</head>
<body>
<h2 align="center">User Registration</h2>
	<form action="Controller" method="post" onsubmit="return validateForm()">
		<table style="border:1px solid black;margin-left:auto;margin-right:auto;">
			<tr>
				<td><font color="red">*</font>Email: </td>
				<td><input type="email" name="textEmail" onkeyup="value = value.toLowerCase()" required></td>
			</tr>
			<tr>
				<td><font color="red">*</font>Title: </td>
				<td><select name="textTitle">
				<option value= "Mr" selected>Mr</option>
				<option value= "Ms">Ms</option>
				<option value= "Miss">Miss</option>	
				</select></td>
			</tr>
			<tr>
				<td><font color="red">*</font>First Name: </td>
				<td><input type="text" name="textFirst_name" required></td>
			</tr>
			<tr>
				<td><font color="red">*</font>Last Name: </td>
				<td><input type="text" name="textLast_name" required></td>
			</tr>
			<tr>
				<td><font color="red">*</font>Address line 1: </td>
				<td><input type="text" name="textAddress_line1" required></td>
			</tr>
			<tr>
				<td>Address line 2: </td>
				<td><input type="text" name="textAddress_line2"></td>
			</tr>
			<tr>
				<td>City: </td>
				<td><input type="text" name="textCity"></td>
			</tr>
			<tr>
				<td><font color="red">*</font>PostCode: </td>
				<td><input type="text" name="textPostcode" required></td>
			</tr>
			<tr>
				<td>Telephone: </td>
				<td><input type="number" name="textTelephone"></td>
			</tr>
			<tr>
				<td><input type="hidden" name="textSite" readonly="readonly"
				value="Cadiz"></td>
			<tr>
				<th colspan="2">
					<input type="submit" name="btnGrabar" value="Submit"></th>
			</tr>
		</table>
		<h2 align="center"><font color="red" size=2>* Mandatory information </font></h2>
	</form>

</body>

</html>