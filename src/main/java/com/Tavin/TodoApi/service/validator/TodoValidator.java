package com.Tavin.TodoApi.service.validator;

import com.Tavin.TodoApi.entity.TodoEntity;
import com.Tavin.TodoApi.repository.TodoRepository;
import org.springframework.stereotype.Component;

@Component
public class TodoValidator {

    private TodoRepository repository;

    public TodoValidator(TodoRepository repository){
        this.repository = repository;
    }

    public void validator(TodoEntity todo){
        if(ExistsWithDescription(todo.getDescription()) && ExistsWithTitle(todo.getTitle())){
            throw new IllegalArgumentException("Description already exists");
        }
    }

    public boolean ExistsWithDescription(String description){
        return repository.existsByDescription(description);
    }

    public boolean ExistsWithTitle(String title){
        return repository.existsByTitle(title);
    }

}
