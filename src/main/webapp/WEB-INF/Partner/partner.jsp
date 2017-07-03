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
					<h2>Request a new institution or branch</h2>
				</div>
				<hr style="border-style: dashed;"/>
				
				<div class="well">
					Please enter the institution as "Partner", the legal entity.<br/>
					The name of the institution should be in it's official language (e.g. For CIAT: Centro Internacional de Agricultura Tropical).		
				</div>
				<hr/>
				
				<div class="col-md-12" style="padding-left:4%;padding-right: 4%;">		
					<s:actionerror theme="bootstrap"/>
		            <s:actionmessage theme="bootstrap"/>
		            <s:fielderror theme="bootstrap"/>

					<s:form action="savePartner" theme="bootstrap" method="post" validate="true" cssClass="form-vertical">
						
						<div >
							<div class="col-md-3">	
								<label>Is this Institution a branch?</label>										
							</div>																		
							<div class="col-md-9 text-left">
								 <button class="btn btn-success" type="button">Yes</button>
								 <button class="btn btn-default" type="button">No</button>															
							</div>
						</div>
						
						<div class="col-md-12" >	
							
								<label>Select an Institution headquarter:</label>		
								<input class="form-control" />				
<%-- 								<s:select label="Select an option..." --%>
<%-- 								headerKey="-1" headerValue="Select Search Engines" --%>
<%-- 								list="searchEngine" --%>
<%-- 								name="yourSearchEngine" />																																																 --%>
						</div>
						
						<div >
							<div class="col-md-6" style="margin-top: 1%;">
								<label>Acronym</label><br/>
								<s:textfield name="partner.acronym" value="%{partner.acronym}" size="10" required="true" />
							</div>
							<div class="col-md-6" style="margin-top: 1%;">
								<label>Name</label><br/>
								<s:textfield name="partner.name" value="%{partner.name}" size="10"  required="true" />
							</div>
							<div class="col-md-6" style="margin-top: 1%;">
								<label>Type</label><br/>								
								<s:select name="partner.type" value="%{partner.type}" list="types" listKey="name" listValue="name"/>
							</div>
							<div class="col-md-6" style="margin-top: 1%;">
								<label>Country</label><br/>								
								<s:select name="partner.country" value="%{partner.country}" list="countries" listKey="alpha2Code" listValue="name"/>
							</div>
							<div class="col-md-6" style="margin-top: 1%;">
								<label>City</label><br/>
								<s:textfield name="partner.city" value="%{partner.city}" size="40" />								
							</div>							
						</div>
						
						<div class="col-md-12" style="margin-top: 1%;">	
							<label>If you know the partner website please paste the link below:</label>																										  
							<input type="text" class="form-control" id="basic-url" aria-describedby="basic-addon3">												
						</div>
																	   					   					    					
					    <div class="row" style="margin-top:2%;">
					    	<div class="col-md-12 text-center" style="margin-top: 1%;">						    
						    <s:submit class="btn btn-primary " value="Request add new partner"/>
						   	</div>						  
					    </div>
					    
					</s:form>
				</div>
		
			</div>
				
	</div>		
		<script src="js/bootstrap.min.js"></script>
</body>
</html>