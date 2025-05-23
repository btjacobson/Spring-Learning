package com.example.todo_app.controllers;

import com.example.todo_app.models.Todo;
import com.example.todo_app.services.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
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
}
