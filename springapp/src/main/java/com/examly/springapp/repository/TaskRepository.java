package com.examly.springapp.repository;
import org.springframework.data.repository.CurdRepository;
import com.examly.springapp.model.Task;
public interface TaskRepository extends CurdRepository<Task, String>{
    
}