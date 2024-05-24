package com.example.proyecto.dao;

import com.example.proyecto.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryDao extends JpaRepository <Category, Integer>{
    List<Category> getAllCategory();
}
