<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



	<table>
		
		<h1>Lista de contatos</h1>

		<table border="2">
		<thead>
			<tr>
				<td>Nome</td>
				<td>Email</td>
				<td>Endere�o</td>
				<td>Data de Nascimento</td>


			</tr>
		</thead>
			<tbody>
			<c:forEach var="contato" items="${contatos }">
				<tr>
					<td>${contato.nome }</td>
					<td>${contato.email }</td>
					<td>${contato.endereco }</td>
					<td>${contato.dataNascimento.time }</td>
				</tr>
			</c:forEach>

		</tbody>
			
		</table>

	</table>


</body>
</html>