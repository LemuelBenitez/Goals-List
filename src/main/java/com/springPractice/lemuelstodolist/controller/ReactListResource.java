package com.springPractice.lemuelstodolist.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springPractice.lemuelstodolist.DAO.Todo;
import com.springPractice.lemuelstodolist.DAO.TodoRepository;

@RestController
public class ReactListResource {

	private TodoRepository todoR;

	public ReactListResource(TodoRepository todoR) {
		this.todoR = todoR;
	}

	@GetMapping("/users/{username}/list")
	public List<Todo> getTodos(@PathVariable String username) {
		return todoR.findByUsername(username);
	}

	@GetMapping("/updateItem/{id}")
	public Todo getTodos(@PathVariable int id) {
		Optional<Todo> todoItem = todoR.findById(id);
		return todoItem.isPresent() ? todoItem.get() : new Todo();
	}

	@DeleteMapping("/deleteItem/{id}")
	public ResponseEntity<Void> deleteTodos(@PathVariable int id) {
		todoR.deleteById(id);
		return ResponseEntity.noContent().build();
	}
}
