package com.Tavin.TodoApi.service;

import com.Tavin.TodoApi.entity.TodoEntity;
import com.Tavin.TodoApi.repository.TodoRepository;
import com.Tavin.TodoApi.service.validator.TodoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private TodoRepository Repository;
    private TodoValidator   Validator;

    public TodoService(TodoRepository todoRepository, TodoValidator Validator){
        this.Repository = todoRepository;
        this.Validator = Validator;
    }

    public TodoEntity save(TodoEntity novoTodo){
        Validator.validator(novoTodo);
        return Repository.save(novoTodo);
    }

    public TodoEntity findById( Integer id){
        return Repository.findById(id).orElse(null);
    }

    public TodoEntity updateTodo(TodoEntity todo){
        return Repository.save(todo);
    }
}
