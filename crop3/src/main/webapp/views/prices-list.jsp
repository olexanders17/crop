<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body>

	<div class="container"></div>

	<c:forEach var="v" items="${allPrices}">

		<table class='table  table-condensed' style="width: 50%">
			<thead>
				<td>priceTypeName</td>
				<td>uahExcVat</td>
			</thead>
			<tbody>
				<td>${v.priceTypeName}</td>
				<td>${v.uahExcVat}</td>

			</tbody>


		</table>


	</c:forEach>

	</div>
</body>
</html>