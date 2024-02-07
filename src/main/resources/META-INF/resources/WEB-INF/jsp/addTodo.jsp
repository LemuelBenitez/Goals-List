<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">

<!-- Date picker -->
<link
	href="webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.min.css"
	rel="stylesheet" />

<title>${name}Is Adding A Goal</title>

<h1 align="center">Add Goal Below</h1>
</head>
<body>
<%@ include file="common/nav.jspf" %>
<div class="container">
	<form:form method="post" modelAttribute="todo">
		</fieldset class="mb-3">
		<form:label path="description">Description:</form:label>
		<form:input type="text" path="description" required="required" />
		<form:errors path="description"
			cssClass="p-3 mb-2 bg-warning text-dark"></form:errors>
		</fieldset>

		</fieldset class="mb-3">
		<form:label path="targetDate">Target Date:</form:label>
		<form:input type="date" path="targetDate" required="required" />
	   <form:errors path="targetDate" cssClass="text-warning"/>
		</fieldset>

		<form:input type="hidden" path="id"/>
		<form:input type="hidden" path="done"/>
		<input type="submit" class="btn btn-success"/>
	


	</form:form>
</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
		crossorigin="anonymous"></script>
    
    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
	<!--Date Picker  -->
	<script src="webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>

<script type="text/javascript">
	$('#targetDate').datepicker({
	    format: 'yyyy-mm-dd'
	});
</script>

</body>

</html>