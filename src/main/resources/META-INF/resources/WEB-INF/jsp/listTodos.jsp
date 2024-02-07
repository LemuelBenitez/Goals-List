<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
	crossorigin="anonymous"></script>
<title>${name} Todo List</title>
<h1 align="center"> ${name} Daily Goals List</h1>
</head>

<body>
<%@ include file="common/nav.jspf" %>
	<div class="container">
		<table class="table">
			<thead>
				<tr>
					<th>#</th>
					<th>Description</th>
					<th>Target Date</th>
					<th>Done</th>
				    <th>Delete ?</th>
				    <th>Update ?</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${todos}" var="todo">
					<tr>
						<td>${todo.id}</td>
						<td>${todo.description}</td>
						<td>${todo.targetDate}</td>
						<td>${todo.done}</td>
						<td><a href="deleteTodo?id=${todo.id}" class="btn btn-warning" >Delete</a></td>
						<td><a href="updateTodo?id=${todo.id}" class="btn btn-success" >Update</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<a  align="center" href="addTodo" class="btn btn-success"> Add a Goal</a>
		
	</div>
</body>
</html>