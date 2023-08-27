package com.examly.springapp.repository;

import org.springframework.data.repository.CrudRepository; // Corrected import
import com.examly.springapp.model.Task;

public interface TaskRepository extends CrudRepository<Task, String> {
    
}
