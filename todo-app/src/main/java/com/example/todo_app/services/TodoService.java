package com.example.todo_app.services;

import com.example.todo_app.models.Todo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();
    static {
        todos.add(new Todo(1, "test", "Finish this", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(1, "test", "Finish this 2", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(1, "test", "Finish this 3", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(1, "test", "Finish this 4", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(1, "test", "Finish this 5", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(1, "test", "Finish this 6", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(1, "test", "Finish this 7", LocalDate.now().plusYears(1), false));
    }

    public List<Todo> findTodosByUsername(String username) {
        return todos;
    }
}
