/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.todolist3.controller;

import com.example.todolist3.model.content;
import com.example.todolist3.service.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Sharvari
 */
@RestController
@RequestMapping("/todolist")
public class controller {
    
    @Autowired
    service service;
    
    
    @PostMapping("/addtask")
    public content addtask(@RequestBody content content)
    {
        return service.addtask(content);
    }
    
    //get all students
    @GetMapping("/getAllLists")
    public List<content> getAllLists()
    {
        return service.getAllLists();
    }
    
    //get student by id
    @GetMapping("/getList/{id}")
    public Optional<content> getListById(@PathVariable("id") String id)
    {
        return service.getListById(id);
    }
    
    //update
    @PutMapping("/updateList")
    public content updateList(@RequestBody content content)
    {
        return service.addtask(content);
    }
    
    //delete
    @DeleteMapping("/deleteList/{id}")
    public void deleteStudent(@PathVariable("id") String id)
    {
        service.deleteById(id);
    }
}
