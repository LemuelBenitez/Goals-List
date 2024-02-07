package com.springPractice.lemuelstodolist.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springPractice.lemuelstodolist.DAO.Todo;
import com.springPractice.lemuelstodolist.DAO.TodoRepository;

import jakarta.validation.Valid;

@Controller
@SessionAttributes("name")
public class addTodoController {
	TodoRepository todoRepo;

	public addTodoController(TodoRepository todoRepo) {
		this.todoRepo = todoRepo;
	}

	Long millis = System.currentTimeMillis();
	java.sql.Date date = new java.sql.Date(millis);

	@PostMapping("addTodo")
	public String addToList(@Valid Todo todos, BindingResult result, ModelMap model) {
		if (result.hasErrors()) {
			return "addTodo";
		}
		// java.sql.Date turn = java.sql.Date.valueOf(targetDate);
		String name = getLoggedInUsername(model);
		todos.setUsername(name);
		todoRepo.save(todos);
		return "redirect:listTodos";
	}

	private String getLoggedInUsername(ModelMap model) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
	}

}
