package com.Tavin.TodoApi.service;

import com.Tavin.TodoApi.entity.TodoEntity;
import com.Tavin.TodoApi.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {


    private TodoRepository Repository;

    public TodoService(TodoRepository todoRepository){
        this.Repository = todoRepository;
    }

    public TodoEntity save(TodoEntity novoTodo){
        return Repository.save(novoTodo);
    }
}
