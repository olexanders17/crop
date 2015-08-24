<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>


	<a3 class="btn btn-default">EDIT inputs </a3>
	<br>
	<br>

	<input type="text" name="id" value="ID" class="btn btn-info " >
	<input type="text" name="priceTypeName" value="PRICE_TYPE_NAME" class="btn btn-info">
	<input type="text" name="vatRate" value="VAT_RATE" class="btn btn-info">
	<input type="text" name="uahExcVat" value="UAH_EXC_VAT" class="btn btn-info">
	
	<br>



	<core:forEach items="${inputsList}" var="item">

<form action="inputsUpdate" method="post">

		<input type="text" name="id" value="${item.id}" class="btn btn-default " readonly="readonly" >
		<input type="text" name="unitMeasurmen" value="${item.unitMeasurmen}" class="btn btn-default">
		<input type="text" name="inputClass" value="${item.inputClass}" class="btn btn-default">
		
		

		<button  type="submit" class="btn btn-success"> <span class="glyphicon glyphicon-ok"></span>
		</button>
		<a href="inputsDelete?id=${item.id}" class="btn btn-danger"> <span class="glyphicon glyphicon-remove"></span></a>
		<a href="inputsDelete?id=${item.id}" class="btn btn-warning"> <span class="glyphicon glyphicon-pencil"></span></a>
		
		
		<br>


</form>
	</core:forEach>




</body>
</html>