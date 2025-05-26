package com.example.todo_app.controllers;

import com.example.todo_app.models.Todo;
import com.example.todo_app.services.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDate;
import java.util.List;

@Controller
@SessionAttributes("username")
public class TodoController {
    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping("list-todos")
    public String listAllTodos(ModelMap model) {
        List<Todo> todos = todoService.findTodosByUsername("test");

        model.addAttribute("todos", todos);

        return "listTodos";
    }

    @RequestMapping(value="add-todo", method = RequestMethod.GET)
    public String showNewTodoPage() {
        return "todo";
    }

    @RequestMapping(value="add-todo", method = RequestMethod.POST)
    public String addNewTodo(ModelMap model, @RequestParam String description) {
        String username = (String)model.get("username");
        todoService.addTodo(username, description, LocalDate.now().plusYears(1), false);

        return "redirect:list-todos";
    }
}
