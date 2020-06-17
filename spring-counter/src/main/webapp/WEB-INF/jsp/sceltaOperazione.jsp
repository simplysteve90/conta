<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Scegli l'operazione da effettuare</h1>
<form action="contaParole" method="post">
<input type="hidden" name="sceltaTesto" value= "${sceltaTesto}">
<button type="submit" value="Submit">Conta Parole</button>
</form>
<br>

<form action="contaVocali" method="post">
<input type="hidden" name="sceltaTesto" value= "${sceltaTesto}">
<button type="submit" value="Submit">Conta Vocali</button>
</form>
<br>
<form action="contaConsonanti" method="post">
<input type="hidden" name="sceltaTesto" value= "${sceltaTesto}">
<button type="submit" value="Submit">Conta Consonanti</button>
</form>
<br>
</body>
</html>