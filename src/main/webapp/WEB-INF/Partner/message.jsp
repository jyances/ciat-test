<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<html>
<head>
<%-- 	<link href="<s:url value='/css/main.css'/>" rel="stylesheet" type="text/css" /> --%>
	<title><s:text name="label.employees" /></title>
	<link href="css/bootstrap.min.css" rel="stylesheet">
	<sb:head/>
</head>

<body class="container-fluid">
	<div class="row">
		<div class="col-md-12">
				<div class="text-center">
					<h2>Error Message</h2>
				</div>
				<hr style="border-style: dashed;"/>				
				<div class="alert alert-danger" role="alert">
				  <span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span>
				  <span class="sr-only">Error:</span>
				  	Sorry, There was an error in our end, please try again or communicate to jyances@gmail.com
				</div>					 																		
		</div>				
	</div>		
		<script src="js/bootstrap.min.js"></script>
</body>
</html>