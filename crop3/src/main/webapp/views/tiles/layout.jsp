<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Layout Title</title>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

</head>
<body>
 
	<div class="container-fluid">

		<div class="row" name="top">
			<div class="col-lg-12 col-md-12 col-sm-12  col-xs-12 " style="background-color: #white; border-color: #676A6C; color: #676a6c;">
				<div>
					<!-- 					header page -->
					<tiles:insertAttribute name="header">
					</tiles:insertAttribute>
				</div>
			</div>
		</div>

		<div class="row" name="mid">
			<!-- 			<div class="col-lg-2 col-md-2 col-sm-2  col-xs-2" style="background-color: #2f4050; color: #A7B1C2">Manu</div> -->
			<div class="col-lg-10 col-md-10 col-sm-10 col-xs-10 " style="background-color: white; color: black;">
				<!--                body page -->
				<div>
				
					<tiles:insertAttribute name="body">
					</tiles:insertAttribute>
				</div>

			</div>
		</div>




	</div>

</body>
</html>