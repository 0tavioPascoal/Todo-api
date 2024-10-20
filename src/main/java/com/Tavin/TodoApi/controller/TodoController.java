package com.Tavin.TodoApi.controller;

import com.Tavin.TodoApi.entity.TodoEntity;
import com.Tavin.TodoApi.service.TodoService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("todos")
public class TodoController {


    private TodoService service;

    public TodoController (TodoService service){
        this.service = service;
    }


  @PostMapping
    public TodoEntity save(@RequestBody TodoEntity todo){
        return service.save(todo);
  }
}
