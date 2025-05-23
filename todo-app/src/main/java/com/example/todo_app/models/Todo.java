package com.example.todo_app.models;

import org.springframework.stereotype.Component;

import java.time.LocalDate;

public class Todo {
    private int id;
    private String username;
    private String description;
    private LocalDate completeBy;
    private boolean completed;

    public Todo(int id, String username, String description, LocalDate completeBy, boolean completed) {
        this.id = id;
        this.username = username;
        this.description = description;
        this.completeBy = completeBy;
        this.completed = completed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getCompleteBy() {
        return completeBy;
    }

    public void setCompleteBy(LocalDate completeBy) {
        this.completeBy = completeBy;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", description='" + description + '\'' +
                ", completeBy=" + completeBy +
                ", completed=" + completed +
                '}';
    }
}
