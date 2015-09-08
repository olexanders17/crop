<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>

<script src=<core:url value='/resources/forms-util.js'/>>
    
</script>
</head>
<body>


	<a3 class="btn btn-default">EDIT inputs </a3>
	<br>
	<br>

	<input type="text" name="id" value="ID" class="btn btn-info ">
	<input type="text" name="priceTypeName" value="PRICE_TYPE_NAME" class="btn btn-info">
	<input type="text" name="vatRate" value="VAT_RATE" class="btn btn-info">


	<br>



	<core:forEach items="${inputsList}" var="item">

		<form id="form${item.id}" action="inputsUpdate" method="post" onsubmit="formChanger()">

			<input type="text" name="id" value="${item.id}" class="btn btn-default " readonly="readonly"> <input type="text" name="unitMeasurmen" value="${item.unitMeasurmen}" class="btn btn-default">
			<input type="text" name="inputClass" value="${item.inputClass}" class="btn btn-default">



			<button class="btn btn-success" name="inputsUpdate">
				<span class="glyphicon glyphicon-ok"></span>
			</button>
			<button class="btn btn-danger" name="inputsDelete">
				<span class="glyphicon glyphicon-remove"></span>
			</button>
			<button class="btn btn btn-warning" name="inputsEditOne">
				<span class="glyphicon glyphicon glyphicon-pencil"></span>
			</button>



		</form>
	</core:forEach>




</body>
</html>