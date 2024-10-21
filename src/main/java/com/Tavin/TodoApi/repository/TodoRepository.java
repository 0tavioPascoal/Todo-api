package com.Tavin.TodoApi.repository;

import com.Tavin.TodoApi.entity.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, Integer > {

    boolean existsByDescription(String description);

    boolean existsByTitle(String title);
}
