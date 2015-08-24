<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>inputs Get ALL</title>
</head>
<body>
	<a3 class="btn btn-default">Table. List of all inputs </a3>
	<br>
	<br>


	<div class="conratiner">


		<table class="table  table-condensed table-striped  " style="width: 90%">
			<thead>
				<tr>
				
				
					<td>PRICE_TYPE_NAME</td>
					<td>VAT_RATE</td>
					<td>UAH_EXC_VAT</td>
					

				</tr>
			</thead>

			<tbody>
				<c:forEach var="item" items="${inputsList}">
					<tr>
						<td>${item.priceTypeName}</td>
						<td>${item.vatRate}</td>
						<td>${item.uahExcVat}</td>
					
					</tr>

				</c:forEach>

			</tbody>


		</table>

		<br>
		<hr class="btn-warning" style="width: 90%;" align="left">

		<a href="inputsEdit" class="btn btn-warning">EDIT inputsS</a>

	</div>

</body>
</html>