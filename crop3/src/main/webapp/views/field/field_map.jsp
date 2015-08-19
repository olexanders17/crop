<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<!--Load the AJAX API-->
<script type="text/javascript" src="https://www.google.com/jsapi"></script>
<script type="text/javascript">
	// Load the Visualization API and the controls package.
	// Packages for all the other charts you need will be loaded
	// automatically by the system.
	google.load('visualization', '1.0', {
		'packages' : [ 'controls' ]
	});

	// Set a callback to run when the Google Visualization API is loaded.
	google.setOnLoadCallback(drawDashboard);

	function drawDashboard() {
		var donutRangeSlider = new google.visualization.ControlWrapper({
			'controlType' : 'NumberRangeFilter',
			'containerId' : 'filter_div',
			'options' : {
				'filterColumnLabel' : 'Donuts eaten',
				'minValue' : 1,
				'maxValue' : 10
			},
			// Explicitly positions the thumbs at position 3 and 8,
			// out of the possible range of 1 to 10.
			'state' : {
				'lowValue' : 3,
				'highValue' : 8
			}
		});

		var data = google.visualization.arrayToDataTable([
				[ 'Name', 'Gender', 'Age', 'Donuts eaten' ],
				[ 'Michael', 'Male', 12, 5 ], [ 'Elisa', 'Female', 20, 7 ],
				[ 'Robert', 'Male', 7, 3 ], [ 'John', 'Male', 54, 2 ],
				[ 'Jessica', 'Female', 22, 6 ], [ 'Aaron', 'Male', 3, 1 ],
				[ 'Margareth', 'Female', 42, 8 ] ]);

		var pieChart = new google.visualization.ChartWrapper({
			'chartType' : 'PieChart',
			'containerId' : 'chart_div',
			'options' : {
				'width' : 300,
				'height' : 300,
				'title' : 'Donuts eaten per person'
			},
			// The pie chart will use the columns 'Name' and 'Donuts eaten'
			// out of all the available ones.
			'view' : {
				'columns' : [ 0, 3 ]
			}
		});

	}

	// The rest of dashboard configuration follows
	// ...
</script>


</head>
<body>


	<!--Div that will hold the dashboard-->
	<div id="dashboard_div">
		<!--Divs that will hold each control and chart-->
		<div id="filter_div"></div>
		<div id="chart_div"></div>
	</div>




</body>
</html>