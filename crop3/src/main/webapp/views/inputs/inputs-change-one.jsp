<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>


	<h3 class="btn btn-default">ADD inputs </h3>
	<br>
	<br>

<div class="container-fluid" > 
<div class="row" align="left"  > 

	<form action="inputsAdd" method="post">
	<div class="row" >
	<div class="col-md-2"> <label class="btn btn-info btn-group-justified">ID</label> </div>
	<div class="col-md-2"><input type="text" name="id" value="${inputsToEdit.id}" class="btn btn-default"></div>
	</div>
	
	<div class="row" >
	<div class="col-md-2"> <label class="btn btn-info btn-group-justified">NAME</label> </div>
	<div class="col-md-2"><input type="text" name="priceTypeName" class="btn btn-default"></div>
	</div>
		
	<div class="row" >
	<div class="col-md-2"> <label class="btn btn-info btn-group-justified">UNIT_MEASURMEN</label> </div>
	<div class="col-md-2"> <input type="text" name="vatRate" class="btn btn-default"> </div>
	</div>
	<div class="row" >
	<div class="col-md-2"><label class="btn btn-info btn-group-justified">INPUT_CLASS</label></div>
	<div class="col-md-2"> <input type="text" name="uahExcVat" class="btn btn-default"> </div>
	</div>
	<div class="row" >
	<div class="col-md-2"><label class="btn btn-info btn-group-justified">INPUT_PRICES</label></div>
	<div class="col-md-2"> <input type="text" name="uahExcVat" class="btn btn-default"> </div>
	</div>




	
	
	<div class="row" style="margin-top: 10px" >
	
	<div class="col-md-2" >
	<button type="submit" class="btn btn-success"> <span class="glyphicon glyphicon-ok"></span>	</button>
	<a href="#" class="btn btn-danger"> <span class="glyphicon glyphicon-remove"></span>
	</a>
	</div>
	</div>
	
	
	<c:forEach var="item" items="">
	
	<input type="radio" value=""> 
	
	
	
	</c:forEach>
	
	
	
	
	
	</form>
</div>
</div>

	
	




</body>
</html>