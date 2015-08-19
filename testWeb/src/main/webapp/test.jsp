<%@page import="oss.PersonClub"%>
<%@page import="oss.Person"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	dsdsads
	<%
	PersonClub pk = new PersonClub();
	List<Person> per = pk.getAllPersons();
	pageContext.setAttribute("listPersons", per);
%>





	<script type="text/javascript">
	var myIt=[
	<c:forEach var="item" items="${listPersons}">
			  ${item.name}, 
	
        
	
	</c:forEach>
	]
	</script>


</body>
</html>

