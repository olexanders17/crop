<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

<div class="container-fluid">
	<h3 class="btn btn-default">EDIT FIELD </h3>
	<br>
	
<dir class="navbar-form">
	<input type="text" name="id" value="ID" class="btn btn-info " />
	<input type="text" name="code" value="CODE" class="btn btn-info">
	<input type="text" name="oblast" value="OBLAST" class="btn btn-info">
	<input type="text" name="rajon" value="RAJON" class="btn btn-info">
	<input type="text" name="villag" value="VILLAGE" class="btn btn-info">
	<input type="text" name="areaTotal" value="AREA TOTAL" class="btn btn-info">
	<input type="text" name="areaPlante" value="AREA PLANTED" class="btn btn-info">
	<br>
</dir>


	<core:forEach items="${fieldList}" var="item">
<form action="fieldUpdate" method="post" class="navbar-form" >
		<input type="text" name="id" value="${item.id}" class="form-control" readonly="readonly" >
		<input type="text" name="code" value="${item.code}" class="form-control">
		<input type="text" name="oblast" value="${item.oblast}" class="form-control">
		<input type="text" name="rajon" value="${item.rajon}" class="form-control">
		<input type="text" name="village" value="${item.village}" class="form-control">
		<input type="text" name="areaTotal" value="${item.areaTotal}" class="form-control">
		<input type="text" name="areaPlanted" value="${item.areaPlanted}" class="form-control">

		<button  type="submit" class="btn btn-success"> <span class="glyphicon glyphicon-ok"></span>
		</button>
		<a href="fieldDelete?id=${item.id}" class="btn btn-danger"> <span class="glyphicon glyphicon-remove"></span>
		</a>
		<br>
</form>
	</core:forEach>



</div>
</body>
</html>