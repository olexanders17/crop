<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>


	<a3 class="btn btn-default">ADD prices </a3>
	<br>
	<br>

<div class="container-fluid" > 
<div class="row" align="left"  > 

	<form action="pricesAdd" method="post">
	<div class="row" >
	<div class="col-md-2"> <label class="btn btn-info btn-group-justified">PRICE_TYPE_NAME</label> </div>
	<div class="col-md-2"><input type="text" name="priceTypeName" class="btn btn-default"></div>
	</div>	
	<div class="row" >
	<div class="col-md-2"> <label class="btn btn-info btn-group-justified">VAT_RATE</label> </div>
	<div class="col-md-2"> <input type="text" name="vatRate" class="btn btn-default"> </div>
	</div>
	<div class="row" >
	<div class="col-md-2"><label class="btn btn-info btn-group-justified">UAH_EXC_VAT</label></div>
	<div class="col-md-2"> <input type="text" name="uahExcVat" class="btn btn-default"> </div>
	</div>
	
	
	<div class="row" style="margin-top: 10px" >
	
	<div class="col-md-2" >
	<button type="submit" class="btn btn-success"> <span class="glyphicon glyphicon-ok"></span>	</button>
	<a href="#" class="btn btn-danger"> <span class="glyphicon glyphicon-remove"></span>
	</a>
	</div>
	</div>
	</form>
</div>
</div>

	
	




</body>
</html>