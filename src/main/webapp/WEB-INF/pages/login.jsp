<html>
<head>
	<title>Site</title>
</head>

<body>
	<h1>${message}</h1>

	<p><font color="red">${errorMessage}</font></p>
	<form action="/login" method="POST">
		<table>
			<tr>
				<td valign="top">Name :</td>
				<td>
					<input name="name" type="text" />
				</td>
			</tr>
			<tr>
				<td valign="top">Password :</td>
				<td>
					<input name="password" type="password" /> <input type="submit" />
				</td>
			</tr>
		</table>
	</form>




</body>
</html>