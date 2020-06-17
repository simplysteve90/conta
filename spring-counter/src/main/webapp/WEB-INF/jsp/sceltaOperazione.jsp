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
<button type="button">Conta Parole</button>
</form>
<form action="contaVocali" method="post">
<button type="button">Conta Vocali</button>
<input type="hidden" name="sceltaTesto" value= "${sceltaTesto}">
</form>
<form action="contaConsonanti" method="post">
<button type="button">Conta Consonanti</button>
<input type="hidden" name="sceltaTesto" value= "${sceltaTesto}">
</form>
</body>
</html>