<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Field Get ALL</title>
</head>
<body>
	<a3 class="btn btn-default">Table. List of all fields </a3>
	<br>
	<br>


	<div class="conratiner">


		<table class="table  table-condensed table-striped  " style="width: 90%">
			<thead>
				<tr>
					<td>id</td>
					<td>code</td>
					<td>oblast</td>
					<td>rajon</td>
					<td>village</td>
					<td>areaTotal</td>
					<td>areaPlanted</td>

				</tr>
			</thead>

			<tbody>
				<c:forEach var="item" items="${fieldList}">
					<tr>
						<td>${item.id}</td>
						<td>${item.code}</td>
						<td>${item.oblast}</td>
						<td>${item.rajon}</td>
						<td>${item.village}</td>
						<td>${item.areaTotal}</td>
						<td>${item.areaPlanted}</td>
					</tr>

				</c:forEach>

			</tbody>


		</table>

		<br>
		<hr class="btn-warning" style="width: 90%;" align="left">

		<a href="fieldEdit" class="btn btn-warning">EDIT FIELDS</a>

	</div>

</body>
</html>