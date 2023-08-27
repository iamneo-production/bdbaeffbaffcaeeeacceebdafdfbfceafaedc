package com.examly.springapp.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.web.bind.annotation.DeleteMapping;
import org.springframework.beans.web.bind.annotation.GetMapping;
import org.springframework.beans.web.bind.annotation.PathVariable;
import org.springframework.beans.web.bind.annotation.PostMapping;
import org.springframework.beans.web.bind.annotation.PutMapping;
import org.springframework.beans.web.bind.annotation.RequestBody;
import org.springframework.beans.web.bind.annotation.restController;
import com.examly.springapp.model.Task;
import com.examly.springapp.service.TasksService;
@RestController
public class TaskController{
    @Autowired
    TasksService taskService;
    @GetMapping("/alltasks")
    public list<Task> getAllTasks(){
        return tasksService.getAllTasks();
    }
    @GetMapping("/getTask/(taskId)")
    public Task getTask(@PathVariable("taskId")String taskId){
        return taskService.getTaskById(taskId);
    }
    @DeleteMapping("/deleteTask/(taskId)")
    public void deleteTask(@PathVariable("taskId")String taskId){
    }
    @PostMapping("/saveTask")
    public String saveTask(@RequestBody Task task){
        tasksService.saveTask(task);
        return task.getTaskId();
    }
    @PutMapping("/changeStatus")
    public Task updateTaskStatus(@RequestBody Task task){
        taskService.updateTaskStatus(task);
        return task;
    }
}