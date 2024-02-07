package com.springPractice.lemuelstodolist.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springPractice.lemuelstodolist.DAO.Todo;
import com.springPractice.lemuelstodolist.DAO.TodoRepository;

import jakarta.validation.Valid;

@Controller
@SessionAttributes("name")
public class todoListController {
	TodoRepository todoRepo;

	Long millis = System.currentTimeMillis();
	java.sql.Date date = new java.sql.Date(millis);

	public todoListController(TodoRepository todoRepo) {
		super();
		this.todoRepo = todoRepo;
	}

	@RequestMapping("listTodos")
	public String listTodos(ModelMap model) {
		String name = getLoggedInUsername(model);
		List<Todo> listTodo = todoRepo.findByUsername(name);
		model.put("name", name);
		model.addAttribute("todos", listTodo);
		return "listTodos";
	}

	@RequestMapping("addTodo")
	public String showAddToDo(ModelMap model) {
		String name = getLoggedInUsername(model);
		Todo todo = new Todo(5, name, "", LocalDate.now(), false);
		model.put("todo", todo);
		model.put("name", name);
		return "addTodo";
	}

	@RequestMapping("deleteTodo")
	public String delete(@RequestParam int id) {
		todoRepo.deleteById(id);
		return "redirect:listTodos";
	}

	@RequestMapping(value = "updateTodo", method = RequestMethod.GET)
	public String showUpdate(@RequestParam int id, ModelMap model) {
		Todo todo = todoRepo.findById(id).get();
		model.addAttribute("todo", todo);
		return "addTodo";
	}

	@PostMapping("updateTodo")
	public String update(ModelMap model, @Valid Todo todo, BindingResult result) {

		if (result.hasErrors()) {
			return "addTodo";
		}

		String username = getLoggedInUsername(model);
		todo.setUsername(username);
		todoRepo.save(todo);
		return "redirect:listTodos";
	}

	private String getLoggedInUsername(ModelMap model) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
	}

}
