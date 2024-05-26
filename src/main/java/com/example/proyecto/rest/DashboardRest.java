package com.example.proyecto.rest;


import com.example.proyecto.pojo.Bill;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@RequestMapping(path = "/dashboard")
@CrossOrigin
public interface DashboardRest {
    @GetMapping(path = "/details")
    ResponseEntity<Map<String,Object>> getCount();
}
