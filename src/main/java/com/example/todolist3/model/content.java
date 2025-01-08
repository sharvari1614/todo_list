/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.todolist3.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 *
 * @author Sharvari
 */
@Entity
public class content {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String id;
    private String title;
    private String task;

    public content() {
    }

    public content(String id, String title, String task) {
        this.id = id;
        this.title = title;
        this.task = task;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "content{" + "id=" + id + ", title=" + title + ", task=" + task + '}';
    }
    
}
