package com.Tavin.TodoApi.controller;

import com.Tavin.TodoApi.entity.TodoEntity;
import com.Tavin.TodoApi.service.TodoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("todos")
public class TodoController {


    private TodoService service;

    public TodoController (TodoService service){
        this.service = service;
    }


  @PostMapping
    public TodoEntity save(@RequestBody TodoEntity todo){
        try {
            return service.save(todo);
        }catch (IllegalArgumentException e){
            var message = e.getMessage();
            throw new ResponseStatusException(HttpStatus.CONFLICT, message);
        }

  }

  @PutMapping("{id}")
  public void updateTodo(@PathVariable("id") Integer id, @RequestBody TodoEntity todo){
        todo.setId(id);
        service.updateTodo(todo);
  }

  @GetMapping("{id}")
  public TodoEntity FindById(@PathVariable("id") Integer id){
        return service.findById(id);
  }
}
