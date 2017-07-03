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
					<h2>List of Institutions</h2>
				</div>
				<hr style="border-style: dashed;"/>
				
				<div class="well">
					This are the list of institutions already registered		
				</div>
				<hr/>
				
				<div class="panel panel-default">
				  				  
				  								
				  <table class="table">
				  		<thead>
				  			<tr class="<s:if test="#status.even">even</s:if><s:else>odd</s:else>">						
								<td class="nowrap">name</td>
								<td class="nowrap">acronym</td>
								<td class="nowrap">country</td>
								<td class="nowrap">type</td>
								<td class="nowrap">heardquarter</td>									
							</tr>
				  		</thead>	
						<s:iterator value="partners" status="status">
							<tr class="<s:if test="#status.even">even</s:if><s:else>odd</s:else>">						
								<td class="nowrap"><s:property value="name" /></td>
								<td class="nowrap"><s:property value="acronym" /></td>
								<td class="nowrap"><s:property value="country" /></td>
								<td class="nowrap"><s:property value="type" /></td>							
								<td class="nowrap"><s:property value="headquarter" /></td>
							</tr>
						</s:iterator>	
				  </table>
				</div>
											
			</div>				
	</div>		
		<script src="js/bootstrap.min.js"></script>
</body>
</html>