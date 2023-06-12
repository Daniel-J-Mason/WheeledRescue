package com.allthing.wheeledrescue.domain.repository;

import com.allthing.wheeledrescue.domain.model.Title;
import com.allthing.wheeledrescue.util.exception.DatabaseEntityNotFoundException;

import java.util.List;
import java.util.Optional;

public interface TitleRepository {
    Optional<Title> findById();
    
    List<Title> findAll();
    
    Title create(Title entity) throws DatabaseEntityNotFoundException;
    
    Title update(Title entity) throws DatabaseEntityNotFoundException;
}
