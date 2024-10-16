package com.example.UT;

import com.example.Task;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {

    @Test
    public void testCreateTask() {
        Task task = new Task("Walk my dog", false);
        assertEquals("Walk my dog", task.getDescription());
        assertFalse(task.getDone());
    }

    @Test
    public void testTaskCompleted(){
        Task task = new Task("Walk my dog", false);
        task.setDone(true);
        assertTrue(task.getDone());
    }

    @Test
    public void testUpdateTask(){
        Task task = new Task("Walk my dog", false);
        task.setDescription("Wash the dishes");
        assertEquals("Wash the dishes",task.getDescription());
    }

    @Test
    public void testDeleteTask(){
        Task task = new Task("Walk my dog", false);
        task.deleteTask("1");
        assertTrue(task.getToDoList().isEmpty());

    }
}
