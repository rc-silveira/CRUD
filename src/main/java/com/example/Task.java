package com.example;

import java.util.ArrayList;
import java.util.UUID;

public class Task {
    private String id;
    private String description;
    private Boolean done;

    private ArrayList<Task> toDoList = new ArrayList<>();

    public Task(String description, Boolean done) {
        this.id = UUID.randomUUID().toString();
        this.description = description;
        this.done = done;
    }

    public Task() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public ArrayList<Task> getToDoList() {
        return toDoList;
    }

    public void create(String description) {
        Task newTask = new Task(description, false);
        toDoList.add(newTask);
        System.out.println("New task added: " + newTask);
    }


    public void listTasks() {
        for (Task task : toDoList) {
            System.out.println(task);
        }
    }

    public void taskCompleted(String id) {
        for (Task task : toDoList) {
            if (task.getId().equals(id)) {
                task.setDone(true);
                System.out.println("Task #" + id + " marked as completed.");
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Task #" + id + ": " + description + " [Completed: " + done + "]";
    }

}



