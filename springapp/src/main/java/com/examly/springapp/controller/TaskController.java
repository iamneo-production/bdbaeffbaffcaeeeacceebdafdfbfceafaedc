package com.examly.springapp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController; // Corrected import
import com.examly.springapp.model.Task;
import com.examly.springapp.service.TasksService;

@RestController
public class TaskController {

    @Autowired
    TasksService taskService;

    @GetMapping("/alltasks")
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping("/getTask/{taskId}") // Corrected path variable syntax
    public Task getTask(@PathVariable("taskId") String taskId) {
        return taskService.getTaskById(taskId);
    }

    @DeleteMapping("/deleteTask/{taskId}") // Corrected path variable syntax
    public void deleteTask(@PathVariable("taskId") String taskId) {
        taskService.delete(taskId);
    }

    @PostMapping("/saveTask")
    public String saveTask(@RequestBody Task task) {
        taskService.saveTask(task);
        return task.getTaskId();
    }

    @PutMapping("/changeStatus")
    public Task updateTaskStatus(@RequestBody Task task) {
        taskService.updateTaskStatus(task);
        return task;
    }
}
