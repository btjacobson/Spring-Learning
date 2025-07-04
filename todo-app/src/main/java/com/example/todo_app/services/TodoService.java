package com.example.todo_app.services;

import com.example.todo_app.models.Todo;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();
    public static int todosCount = 0;
    static {
        todos.add(new Todo(todosCount++, "test", "Finish this", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(todosCount++, "test", "Finish this 2", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(todosCount++, "test", "Finish this 3", LocalDate.now().plusYears(1), false));
    }

    public List<Todo> findTodosByUsername(String username) {
        Predicate<? super Todo> predicate = todo -> todo.getUsername().equalsIgnoreCase(username);

        return todos.stream().filter(predicate).toList();
    }

    public void addTodo(String username, String description, LocalDate completeBy, boolean completed) {
        todos.add(new Todo(todosCount++, username, description, completeBy, completed));
    }

    public void deleteTodo(int id) {
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        todos.removeIf(predicate);
    }

    public Todo findTodo(int id) {
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;

        return todos.stream().filter(predicate).findFirst().get();
    }

    public void updateTodo(@Valid Todo todo) {
        deleteTodo(todo.getId());
        todos.add(todo);
    }
}
