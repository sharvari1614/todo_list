/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.todolist3.service;

import com.example.todolist3.model.content;
import com.example.todolist3.repository.repository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Sharvari
 */
@Service
public class service {
    
    @Autowired
    repository repo;
    
    public content addtask(content content)
    {
        return repo.save(content);
    }
    
    //Get all students
    public List<content> getAllLists()
    {
        return repo.findAll();
    }
    
    //get by id
    public Optional<content> getListById(String id)
    {
        return repo.findById(id);
    }
    
    //update student
    public content updateList(content content)
    {
        return repo.save(content);
    }
    
    //delete
    public boolean deleteById (String id)
    {
        repo.deleteById(id);
        return true;
    }
    
    
}
