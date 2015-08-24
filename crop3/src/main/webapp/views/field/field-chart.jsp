<%@page import="crop.dao.impl.FieldDaoImpl"%>
<%@page import="crop.domain.Field"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript" src="https://www.google.com/jsapi"></script>
<script>
    var chartArray = [];
    chartArray[0] = [ 'FIELD CODE', 'PLANTED AREA' ];

	<%
	List<Field> fieldList = (List<Field>)  request.getAttribute("fieldChartData");
	
	%>
	
	
	
	
	
	<%
	for (int i=1;i<fieldList.size();i++) { 
		%>
		chartArray[<%=i %>]=['<%=fieldList.get(i).getCode()%>',<%=fieldList.get(i).getAreaPlanted()%>]
	<% 
		}
	%>
	</script>




<script type="text/javascript">
    google.load("visualization", "1.1", {
	packages : [ "bar" ]
    });
    google.setOnLoadCallback(drawStuff);

    //     chartArray[0] = [ 'Opening Move', 'Percentage' ];
    //     chartArray[1] = [ "King's pawn (e4)", 44 ];
    //     chartArray[2] = [ "Queen's pawn (d4)", 31 ];

    function drawStuff() {
	var data = new google.visualization.arrayToDataTable(chartArray);

	var options = {
	    title : 'Chess opening moves',
	    width : 900,
	    height:1000,
	    legend : {
		position : 'none'
	    },
	    chart : {
		title : 'Chess opening moves',
		subtitle : 'popularity by percentage'
	    },
	    
	    bars : 'horizontal', // Required for Material Bar Charts.
	    axes : {
		x : {
		    0 : {
			side : 'top',
			label : 'Percentage'
		    }
		// Top x-axis.
		}
	    },
	    bar : {
		groupWidth : "90%"
	    }
	};

	var chart = new google.charts.Bar(document.getElementById('top_x_div'));
	chart.draw(data, options);
    };
</script>



</head>


<body>
	 

	
<div id="top_x_div" style="width: 900px; height: 300px;"></div>




</body>
</html>