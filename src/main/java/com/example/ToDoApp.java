package com.example;

import java.util.Scanner;

public class ToDoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Task task = new Task();

        while (true) {
            System.out.println("\n1. Add task");
            System.out.println("2. List tasks");
            System.out.println("3. Complete task");
            System.out.println("4. Delete task");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            String id = "";

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    task.create(description);
                    break;
                case 2:
                    task.listTasks();
                    break;
                case 3:
                    System.out.println("Enter the task ID");
                    id = scanner.nextLine();
                    task.taskCompleted(id);
                    break;
            }

        }

    }
}
