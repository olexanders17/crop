<%@ page language="java" contentType="text/html; utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
<link rel="stylesheet" href="https://cdn.datatables.net/1.10.8/css/jquery.dataTables.min.css" />
<script type="text/javascript" src="http://cdn.datatables.net/1.10.8/js/jquery.dataTables.min.js"></script>

<link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.5/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.9/css/dataTables.bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/buttons/1.0.3/css/buttons.bootstrap.min.css" />

<script type="text/javascript" src="https://code.jquery.com/jquery-2.1.4.min.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jszip/2.5.0/jszip.min.js"></script>
<script type="text/javascript" src="https://cdn.rawgit.com/bpampuch/pdfmake/0.1.18/build/pdfmake.min.js"></script>
<script type="text/javascript" src="https://cdn.rawgit.com/bpampuch/pdfmake/0.1.18/build/vfs_fonts.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/1.10.9/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/1.10.9/js/dataTables.bootstrap.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/buttons/1.0.3/js/dataTables.buttons.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/buttons/1.0.3/js/buttons.bootstrap.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/buttons/1.0.3/js/buttons.colVis.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/buttons/1.0.3/js/buttons.flash.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/buttons/1.0.3/js/buttons.html5.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/buttons/1.0.3/js/buttons.print.min.js"></script>



</head>
<body>

	<a3 class="btn btn-default">Data Table </a3>
	<br>
	<br>


	<div class="conratiner">


		<table id="table1" class="table  table-condensed table-striped  " style="width: 99%">
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
		
		<script type="text/javascript">
		$(document).ready(function(){	    
		    var table = $('#table1').DataTable( {
			    buttons: [
			        'copy', 'excel', 'pdf'
			    ]
			} );
			  
			table.buttons().container()
			    .appendTo( $('.col-sm-6:eq(0)', table.table().container() ) );
			
	    });
	</script>
		

	</div>

</body>
</html>