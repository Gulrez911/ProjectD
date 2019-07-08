<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
		pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="./resources/img/gear.png" rel="shortcut icon">
<link href="./resources/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

		<div class="container">
				<div class="panel-body">
						<form:form action="save" method="post" modelAttribute="employee"
								cssClass="form-horizontal">

								<div class="form-group">
										<label for="username" class="col-md-3 control-label">First
												Name</label>
										<div class="col-md-9">
												<form:input path="firstName" cssClass="form-control" />
										</div>
								</div>
								<div class="form-group">
										<label for="lastName" class="col-md-3 control-label">Last
												Name:</label>
										<div class="col-md-9">
												<form:input path="lastName" cssClass="form-control" />
										</div>
								</div>
								<div class="form-group">
										<label for="lastName" class="col-md-3 control-label">D.O.B:</label>
										<div class="col-md-9">
												<form:input path="dob" type="date"  cssClass="form-control" />
										</div>
								</div>
								<div class="form-group">
										<div class="col-md-offset-3 col-md-9">
												<form:button class="btn btn-primary">Submit</form:button>
										</div>
								</div>
								
						</form:form>
				</div>
		</div>
</body>
</html>