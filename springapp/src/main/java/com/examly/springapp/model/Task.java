package com.examly.springapp.model;
import javax.presistence.Column;
import javax.presistence.Entity;
import javax.presistence.Id;
import javax.presistence.Table;
@Entity
@Table
public class Task{
    @Id
    @Column
    private String TaskId;
    @Column
    private String taskHolderName;
    @Column
    private String taskDate;
    @Column
    private String taskName;
    @Column
    private String taskStatus;
    public String getTaskId(){
        return taskId;
    }
    public void setTaskId(String taskId) {
        this.taskId=taskId;
    }
    public String getTaskHolderName(){
        return taskHolderName;
    }
    public void setTaskHolderName(String taskHolderName){
        this.taskHolderName=taskHolderName;
    }
    public String getTaskDate(){
        return taskDate;
    }
    public void setTaskDate(String taskDate){
        this.taskDate = taskDate;
    }
    public String getTaskName(){
        return taskName;
    }
    public void setTaskName(String taskName){
        this.taskName=taskName;
    }
    public String setTaskStatus(){
        return taskStatus;
    }
    public void setTaskStatus(String taskStatus){
        this.taskStatus=taskStatus;
    }
}