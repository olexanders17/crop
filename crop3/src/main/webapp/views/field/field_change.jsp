<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<a3 class="btn btn-default">EDIT FIELD </a3>
	<br>
	<br>



	<input type="text" name="id" value="ID" class="btn btn-info " >
	<input type="text" name="code" value="CODE" class="btn btn-info">
	<input type="text" name="oblast" value="OBLAST" class="btn btn-info">
	<input type="text" name="rajon" value="RAJON" class="btn btn-info">
	<input type="text" name="villag" value="VILLAGE" class="btn btn-info">
	<input type="text" name="areaTotal" value="AREA TOTAL" class="btn btn-info">
	<input type="text" name="areaPlante" value="AREA PLANTED" class="btn btn-info">
	<br>



	<core:forEach items="${fieldList}" var="item">

		<input type="text" name="id" value="${item.id}" class="btn btn-default " disabled="disabled">
		<input type="text" name="code" value="${item.code}" class="btn btn-default">
		<input type="text" name="oblast" value="${item.oblast}" class="btn btn-default">
		<input type="text" name="rajon" value="${item.rajon}" class="btn btn-default">
		<input type="text" name="villag" value="${item.village}" class="btn btn-default">
		<input type="text" name="areaTotal" value="${item.areaTotal}" class="btn btn-default">
		<input type="text" name="areaPlante" value="${item.areaPlanted}" class="btn btn-default">

		<a href="fieldUpdate?id=${item.id}" class="btn btn-success"> <span class="glyphicon glyphicon-ok"></span>
		</a>
		<a href="fieldDelete?id=${item.id}" class="btn btn-danger"> <span class="glyphicon glyphicon-remove"></span>
		</a>
		<br>

	</core:forEach>




</body>
</html>